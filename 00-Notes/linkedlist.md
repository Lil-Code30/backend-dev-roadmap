# LinkedList en Java

## 1. Définition

`LinkedList` est une classe de la bibliothèque Java située dans le package `java.util`.

Elle implémente les interfaces :

- List
- Deque
- Queue

Contrairement à `ArrayList`, les éléments ne sont pas stockés dans un tableau dynamique mais dans une structure de nœuds reliés entre eux.

Import :

```java
import java.util.LinkedList;
```

---

## 2. Structure interne

Chaque élément est stocké dans un nœud contenant :

- La donnée (data)
- Une référence vers le nœud précédent
- Une référence vers le nœud suivant

Représentation :

```text
null <- [A] <-> [B] <-> [C] -> null
```

On parle de liste doublement chaînée (Doubly Linked List).

---

## 3. Caractéristiques

✅ Taille dynamique

✅ Maintient l'ordre d'insertion

✅ Autorise les doublons

✅ Autorise les valeurs null

✅ Insertion et suppression rapides au début ou à la fin

❌ Accès par index plus lent que ArrayList

❌ Consomme davantage de mémoire

---

## 4. Création d'une LinkedList

### Liste vide

```java
LinkedList<String> names = new LinkedList<>();
```

### Avec des entiers

```java
LinkedList<Integer> numbers = new LinkedList<>();
```

---

## 5. Ajouter des éléments

### add()

Ajoute à la fin.

```java
LinkedList<String> fruits = new LinkedList<>();

fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");
```

Résultat :

```text
[Apple, Banana, Orange]
```

---

### add(index, element)

Insertion à une position précise.

```java
fruits.add(1, "Mango");
```

Résultat :

```text
[Apple, Mango, Banana, Orange]
```

---

### addFirst()

Ajoute au début.

```java
fruits.addFirst("Pear");
```

Résultat :

```text
[Pear, Apple, Mango, Banana, Orange]
```

---

### addLast()

Ajoute à la fin.

```java
fruits.addLast("Kiwi");
```

---

## 6. Accéder aux éléments

### get(index)

```java
String fruit = fruits.get(2);
```

---

### getFirst()

```java
System.out.println(fruits.getFirst());
```

---

### getLast()

```java
System.out.println(fruits.getLast());
```

---

## 7. Modifier un élément

### set(index, element)

```java
fruits.set(1, "Peach");
```

Résultat :

```text
[Pear, Peach, Mango, Banana, Orange]
```

---

## 8. Supprimer des éléments

### remove(index)

```java
fruits.remove(2);
```

---

### remove(value)

```java
fruits.remove("Banana");
```

---

### removeFirst()

```java
fruits.removeFirst();
```

---

### removeLast()

```java
fruits.removeLast();
```

---

### clear()

Supprime tous les éléments.

```java
fruits.clear();
```

---

## 9. Taille de la liste

```java
int size = fruits.size();
```

---

## 10. Vérification

### contains()

```java
boolean found = fruits.contains("Apple");
```

### isEmpty()

```java
boolean empty = fruits.isEmpty();
```

---

## 11. Parcourir une LinkedList

### Boucle for classique

```java
for(int i = 0; i < fruits.size(); i++) {
    System.out.println(fruits.get(i));
}
```

---

### For-each

```java
for(String fruit : fruits) {
    System.out.println(fruit);
}
```

---

### Iterator

```java
Iterator<String> it = fruits.iterator();

while(it.hasNext()) {
    System.out.println(it.next());
}
```

---

## 12. Utilisation comme Queue

FIFO (First In First Out)

### offer()

```java
LinkedList<String> queue = new LinkedList<>();

queue.offer("A");
queue.offer("B");
queue.offer("C");
```

Résultat :

```text
[A, B, C]
```

---

### poll()

```java
queue.poll();
```

Résultat :

```text
[B, C]
```

---

### peek()

```java
System.out.println(queue.peek());
```

Sortie :

```text
B
```

---

## 13. Utilisation comme Stack

LIFO (Last In First Out)

### push()

```java
LinkedList<Integer> stack = new LinkedList<>();

stack.push(10);
stack.push(20);
stack.push(30);
```

Résultat :

```text
[30, 20, 10]
```

---

### pop()

```java
stack.pop();
```

Résultat :

```text
[20, 10]
```

---

### peek()

```java
stack.peek();
```

---

## 14. Exemple complet

```java
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("John");
        students.add("Alice");
        students.add("Bob");

        System.out.println(students);

        students.addFirst("Emma");

        students.removeLast();

        for(String student : students) {
            System.out.println(student);
        }
    }
}
```

Sortie :

```text
Emma
John
Alice
```

---

## 15. LinkedList vs ArrayList

| Caractéristique   | ArrayList         | LinkedList               |
| ----------------- | ----------------- | ------------------------ |
| Structure         | Tableau dynamique | Liste doublement chaînée |
| Accès par index   | Très rapide O(1)  | Lent O(n)                |
| Insertion début   | Lent O(n)         | Rapide O(1)              |
| Suppression début | Lent O(n)         | Rapide O(1)              |
| Mémoire           | Moins             | Plus                     |
| Recherche         | O(n)              | O(n)                     |

---

## 16. Complexités importantes

| Opération     | Complexité |
| ------------- | ---------- |
| addFirst()    | O(1)       |
| addLast()     | O(1)       |
| removeFirst() | O(1)       |
| removeLast()  | O(1)       |
| get(index)    | O(n)       |
| set(index)    | O(n)       |
| contains()    | O(n)       |
| add(index)    | O(n)       |
| remove(index) | O(n)       |

---

## 17. Quand utiliser LinkedList ?

Utiliser LinkedList lorsque :

- Beaucoup d'insertions
- Beaucoup de suppressions
- Utilisation comme Queue
- Utilisation comme Stack

Utiliser ArrayList lorsque :

- Beaucoup d'accès par index
- Recherche fréquente
- Lecture plus importante que modification

---

## 18. Points d'examen à retenir

1. LinkedList appartient au package java.util.
2. Structure : liste doublement chaînée.
3. Taille dynamique.
4. Autorise les doublons.
5. Autorise les valeurs null.
6. Plus rapide que ArrayList pour insertion/suppression en début ou fin.
7. Plus lente que ArrayList pour l'accès par index.
8. Peut être utilisée comme :
   - List
   - Queue
   - Deque
   - Stack

9. Implémente List et Deque.
10. Chaque nœud contient :
    - donnée
    - pointeur précédent
    - pointeur suivant

---

## Fiche Mémo Rapide

```java
LinkedList<String> list = new LinkedList<>();

list.add("Java");
list.addFirst("Python");
list.addLast("C++");

list.getFirst();
list.getLast();

list.removeFirst();
list.removeLast();

list.contains("Java");

list.size();

list.clear();
```

Mémo :

ArrayList → accès rapide aux index.

LinkedList → insertions/suppressions rapides.
