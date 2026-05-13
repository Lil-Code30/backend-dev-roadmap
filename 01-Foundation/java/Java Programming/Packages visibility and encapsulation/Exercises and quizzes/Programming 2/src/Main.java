import ch.heiafr.tic.Person;
import ch.heiafr.tic.Watch;

public class Main {
   public static void main(String[] args) {
      Watch w1 = new Watch(13, 58);
      Watch w2 = new Watch(w1);
      System.out.println(w1.toString());
      w1.addMinute();
      w1.addMinute();
      System.out.println(w1.toString());
      System.out.println(w2.toString());

      Person p1 = new Person("A");
      p1.setWatch(w1);
      System.out.println(p1.toString());

      Person p2 = new Person("B", w2);
      System.out.println(p2.toString());

      Person p3 = new Person("C");
      System.out.println(p3.toString());
   }
}