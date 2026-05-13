public class Dummy {
   public int number;
   public String s;

   public Dummy() {
      this(2, "N");
      number = number + 1;
      s = s + 'o';
   }

   public Dummy(int number) {
      this(number, "None");
   }

   public Dummy(String s) {
      this(1, s);
   }

   public Dummy(int number, String s) {
      this.number = number + 1;
      this.s = s + "None";
   }
}
