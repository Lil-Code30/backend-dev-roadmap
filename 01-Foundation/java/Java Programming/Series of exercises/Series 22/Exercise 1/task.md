# Exercice 1 de la série 22

Dans cet exercice, nous réalisons une classe `Entity` dont on peut observer
les changements selon le principe d'un `observer`. L'observation est
réalisée à l'aide de l'interface `ValueChangedListener` :
- la classe observée (ici `Entity`) fournit une méthode qui permet de la
  configurer pour l'observer.
- la classe qui observe (ici `MyListener`) réalise l'interface et
  s'enregistre auprès de l'objet à observer afin de recevoir une
  notification à chaque appel de la méthode `setValue()`.

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :
Vous devez réaliser les points suivants :

- Implémentez les classes `Entity` et `MyListener` (classe à créer) selon la spécification.
  Le programme principal doit compiler et produire l'effet attendu.
- Dans la réalisation de la classe `MyListener`, vous devez afficher un
  message `"An entity changed its value to: "` suivi de la nouvelle valeur
  de l'instance d'`Entity` observée.
- Dans la méthode `main()`, réalisez une instance de `ValueChangedListener`
  à l'aide d'une classe anonyme. Le message à afficher dans ce cas est le
  même message précédé de `"anonymous: "`.
- Dans la méthode `main()`, réalisez une instance de `ValueChangedListener`
  à l'aide d'une expression lambda. Le message à afficher dans ce cas
  est le même message précédé de `"lambda: "`.
- Réalisez la classe `StubbornListener` qui a le comportement d'un
  `ValueChangedListener` têtu : à chaque fois qu'une valeur est modifiée, un
  `StubbornListener` modifie à nouveau l'entité avec la valeur `"Apple"`.
  Pour cette réalisation, le message affiché doit être précédé de `"stubborn: "`.

#