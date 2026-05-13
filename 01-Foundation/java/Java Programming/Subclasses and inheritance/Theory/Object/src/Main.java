import ch.heiafr.tic.JustAnObject;

public class Main {
   public static void main(String[] args) {
      JustAnObject jao1 = new JustAnObject();
      System.out.println("jao1 is: " + jao1.toString());
      JustAnObject jao2 = new JustAnObject();
      System.out.println("jao2 is: " + jao2.toString());
      System.out.println("jao1 and jao2 are equals ? : " + jao1.equals(jao2));
      jao2 = jao1;
      System.out.println("jao1 and jao2 are equals ? : " + jao1.equals(jao2));
   }
}