package ch.heiafr.tic;

public final class Child extends Parent {

   public static final int LEGAL_AGE = 18;

   private int age;

   @Override
   public void print() {
      System.out.println("Child");
   }

   public boolean isOlder(final Child c) {
      // NOT POSSIBLE
      // c = new Child();
      // System.out.println("Dummy value %d " + privateAttribute);
      return age > c.age;
   }

   public void hasBirthday() {
      age += 1;
   }

   // NOT POSSIBLE
   // public void hasNewChild() {
   //    childrenNumber += 1;
   // }
}
