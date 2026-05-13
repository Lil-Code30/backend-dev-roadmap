public class Main {
   public static void main(String[] args) {
      Library l = new Library();
      System.out.println(l.toString());
      l.addBook("Les fleurs du mal", "Charles Baudelaire");
      l.addBook("To kill a mockingbird", "Harper Lee");
      System.out.println(l.toString());
   }
}