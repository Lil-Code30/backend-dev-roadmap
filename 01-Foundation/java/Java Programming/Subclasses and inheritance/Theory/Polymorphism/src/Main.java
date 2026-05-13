import ch.heiafr.tic.Animal;
import ch.heiafr.tic.Dog;
import ch.heiafr.tic.Fish;

public class Main {
   public static void main(String[] args) {
      Dog milou = new Dog(3, 7, "Milou");
      milou.eat();

      Animal toutou = new Dog(4, 8, "Toutou");
      toutou.eat();

      Animal[] menagerie = new Animal[6];
      menagerie[0] = new Fish(1, 10);
      menagerie[1] = new Dog(3, 7, "Milou");
      menagerie[2] = new Dog(4, 8, "Toutou");
      menagerie[3] = new Animal(2, 9);
      menagerie[4] = new Fish(7, 6);
      menagerie[5] = new Dog(8, 5, "Toto");

      feed(menagerie);
   }

   public static void feed(Animal[] menagerie) {
      if (menagerie == null)
         return;

      for(Animal a: menagerie) {
         a.eat();
      }
   }
}