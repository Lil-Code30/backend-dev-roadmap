import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

   public static void a() {
      try {
         System.out.println("In a method");
         throw new FileNotFoundException();
      } catch (FileNotFoundException e) {
         System.out.println("FileNotFoundException caught");
      } catch (IOException e) {
         System.out.println("IOException caught");
      }catch (Exception e) {
         System.out.println("Exception caught");
      }
   }

   public static void b() {
      try {
         System.out.println("In b method");
         throw new FileNotFoundException();
      } catch (Exception e) {
         System.out.println("Exception caught");
      }
      // NOT possible to write because the exceptions are already caught by the
      // first catch
      /*
      catch (IOException e) {
         System.out.println("IOException caught");
      } catch (FileNotFoundException e) {
         System.out.println("FileNotFoundException caught");
      }
      */
   }

   public static void main(String[] args) {
      a();
      b();
   }
}