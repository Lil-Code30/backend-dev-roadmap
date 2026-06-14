# PriorityQueue en Java — Notes Complètes

## 1. Définition

`PriorityQueue` est une structure de données basée sur un **tas (Heap)**.

Contrairement à une `Queue` normale (FIFO), les éléments sont retirés selon leur **priorité**, et non selon leur ordre d'insertion.

Import :

```java
import java.util.PriorityQueue;
```

---

# 2. Fonctionnement

Par défaut :

- Le plus petit élément possède la plus haute priorité.
- Utilise un **Min Heap**.

Exemple :

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.add(30);
pq.add(10);
pq.add(20);

System.out.println(pq);
```

Sortie possible :

```java
[10, 30, 20]
```

⚠️ L'ordre affiché n'est pas garanti.

Mais :

```java
while(!pq.isEmpty()) {
    System.out.println(pq.poll());
}
```

Affiche :

```java
10
20
30
```

---

# 3. Méthodes Principales

## add()

Ajoute un élément.

```java
pq.add(15);
```

---

## offer()

Ajoute également un élément.

```java
pq.offer(25);
```

Différence :

- `add()` lance une exception si impossible.
- `offer()` retourne `false`.

Pour `PriorityQueue`, elles se comportent pratiquement pareil.

---

## poll()

Supprime et retourne l'élément prioritaire.

```java
Integer x = pq.poll();
```

Si vide :

```java
null
```

---

## remove()

Supprime et retourne l'élément prioritaire.

```java
Integer x = pq.remove();
```

Si vide :

```java
NoSuchElementException
```

---

## peek()

Regarde le premier élément sans le supprimer.

```java
System.out.println(pq.peek());
```

Si vide :

```java
null
```

---

## element()

Même chose que peek().

```java
System.out.println(pq.element());
```

Si vide :

```java
NoSuchElementException
```

---

## size()

```java
System.out.println(pq.size());
```

---

## isEmpty()

```java
if(pq.isEmpty())
{
    System.out.println("Vide");
}
```

---

## clear()

```java
pq.clear();
```

---

# 4. Exemple Complet

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.add(40);
pq.add(10);
pq.add(30);
pq.add(20);

System.out.println("Premier: " + pq.peek());

while(!pq.isEmpty())
{
    System.out.println(pq.poll());
}
```

Résultat :

```java
Premier: 10

10
20
30
40
```

---

# 5. Max Heap

Par défaut :

```java
10 → 20 → 30 → 40
```

Pour avoir :

```java
40 → 30 → 20 → 10
```

Utiliser un comparateur.

```java
PriorityQueue<Integer> pq =
        new PriorityQueue<>(Comparator.reverseOrder());
```

Exemple :

```java
PriorityQueue<Integer> pq =
        new PriorityQueue<>(Comparator.reverseOrder());

pq.add(10);
pq.add(30);
pq.add(20);

while(!pq.isEmpty())
{
    System.out.println(pq.poll());
}
```

Résultat :

```java
30
20
10
```

---

# 6. PriorityQueue avec Comparator Personnalisé

Trier par longueur de chaîne :

```java
PriorityQueue<String> pq =
    new PriorityQueue<>(
        (a, b) -> a.length() - b.length()
    );
```

Ajout :

```java
pq.add("Banana");
pq.add("Cat");
pq.add("Apple");
```

Retrait :

```java
while(!pq.isEmpty())
{
    System.out.println(pq.poll());
}
```

Résultat :

```java
Cat
Apple
Banana
```

---

# 7. Comparator : Valeurs de Retour

Le comparateur doit retourner :

```java
(a, b) -> ...
```

### Retour négatif (< 0)

```java
return -1;
```

ou

```java
return a - b;
```

Signifie :

```java
a a plus haute priorité que b
```

---

### Retour positif (> 0)

```java
return 1;
```

Signifie :

```java
b a plus haute priorité que a
```

---

### Retour 0

```java
return 0;
```

Signifie :

```java
a et b sont égaux
```

---

Exemple :

```java
(a, b) -> a.length() - b.length()
```

Comparaison :

```java
"Cat"    -> 3
"Banana" -> 6
```

Calcul :

```java
3 - 6 = -3
```

Donc :

```java
Cat avant Banana
```

---

# 8. PriorityQueue d'Objets

Classe :

```java
class Student
{
    String name;
    int grade;

    Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
    }
}
```

Queue :

```java
PriorityQueue<Student> pq =
    new PriorityQueue<>(
        (s1, s2) -> s2.grade - s1.grade
    );
```

Ajout :

```java
pq.add(new Student("John", 80));
pq.add(new Student("Emma", 95));
pq.add(new Student("Mike", 70));
```

Retrait :

```java
while(!pq.isEmpty())
{
    Student s = pq.poll();

    System.out.println(
        s.name + " " + s.grade
    );
}
```

Résultat :

```java
Emma 95
John 80
Mike 70
```

---

# 9. Complexité

| Opération | Complexité |
| --------- | ---------- |
| add()     | O(log n)   |
| offer()   | O(log n)   |
| poll()    | O(log n)   |
| remove()  | O(log n)   |
| peek()    | O(1)       |
| size()    | O(1)       |

---

# 10. Différence entre Queue et PriorityQueue

| Queue                        | PriorityQueue                        |
| ---------------------------- | ------------------------------------ |
| FIFO                         | Priorité                             |
| Premier entré, premier sorti | Élément prioritaire sorti en premier |
| LinkedList souvent utilisée  | Heap utilisé                         |
| add = O(1)                   | add = O(log n)                       |

Exemple :

### Queue normale

```java
Queue<Integer> q = new LinkedList<>();

q.add(30);
q.add(10);
q.add(20);
```

Sortie :

```java
30
10
20
```

---

### PriorityQueue

```java
PriorityQueue<Integer> pq =
    new PriorityQueue<>();

pq.add(30);
pq.add(10);
pq.add(20);
```

Sortie :

```java
10
20
30
```

---

# À retenir pour l'examen

✅ Basée sur un **Heap**

✅ Par défaut = **Min Heap**

✅ `peek()` = voir le premier

✅ `poll()` = retirer le premier

✅ `add()` / `offer()` = insertion

✅ `Comparator.reverseOrder()` = Max Heap

✅ Insertion = **O(log n)**

✅ Suppression = **O(log n)**

✅ Consultation du premier = **O(1)**

✅ L'itération ou l'affichage de la queue ne garantit **pas** l'ordre trié. Seuls les appels successifs à `poll()` retournent les éléments selon leur priorité.
