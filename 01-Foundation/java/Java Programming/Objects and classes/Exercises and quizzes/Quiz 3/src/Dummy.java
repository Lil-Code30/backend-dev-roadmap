public class Dummy {
   public int number;

   public Dummy(int number) {
      this.number = number;
   }

   public void f(Dummy d) {
      d.number = number + 1;
   }

   public Dummy g() {
      number = number + 1;
      return new Dummy(number - 1);
   }
}
