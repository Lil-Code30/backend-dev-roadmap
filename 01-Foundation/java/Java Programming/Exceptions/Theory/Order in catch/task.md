# L'influence de l'ordre des try / catch

---
> **&#9432;**
**Attention** : L'ordre des `try` / `catch` est important. Si plusieurs
`catch` sont compatibles avec le type d'exception levée, c'est le premier
`catch` uniquement qui capture et traite l'exception.
---

## Traitement hiérarchique
Afin d'illustrer le traitement hiérarchique des exceptions, nous pouvons 
utiliser l'exemple de l'exception `FileNotFoundException`. Cette exception fait 
partie de la famille plus vaste `IOException`, qui fait elle partie de la 
famille `Exception`. Dès lors, dans le cas illustré ci-dessous :
```
try {
    // Instructions
} catch(FileNotFoundException e) {
    // ...
} catch(IOException e) {
    // ...
} catch(Exception e) {
    // ...
}
```
Les exceptions `FileNotFoundException` sont traitées par le premier `catch`, 
les exceptions `IOException` par le deuxième `catch` et toutes les autres 
exceptions par le dernier `catch`. 

## Du plus spécifique au plus général
Si l'ordre de traitement était inversé comme suit :
```
try {
    // Instructions
} catch(Exception e) {
    // ...
} catch(IOException e) {
    // ...
} catch(FileNotFoundException e) {
    // ...
}
```
toutes les exceptions générées devraient être traitées par le premier 
`catch` puisqu'il s'agit de la famille la plus générale ! Dès lors, le 
compilateur n'accepte pas les deux derniers `catch`, car il s'aperçoit 
qu'aucune exception ne pourra jamais être traitée par ces `catch`.

# Exemple
Lancez le programme "Main.java" et observez le résultat.
