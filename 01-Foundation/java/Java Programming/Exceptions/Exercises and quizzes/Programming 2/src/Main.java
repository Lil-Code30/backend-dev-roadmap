import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

   public static Date createDate(int year, int month, int day) {
      SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
      try {
         String s = String.format("%04d-%02d-%02d", year, month, day);
         return dateFormat.parse(s);
      } catch (ParseException e) {
         throw new RuntimeException(e);
      }
   }

   public static String displayDate(Date date) {
      SimpleDateFormat dateFormat = new SimpleDateFormat ("dd.MM.yyyy");
      return dateFormat.format(date);
   }

   public static void goToShop(Date date) /* Complete signature */ {
      /* Throw IllegalAccessException when necessary */
      System.out.println("Going to the shop");
   }

   public static void buySnack(Date date) /* Complete signature */ {
      /* Throw UnsupportedOperationException when necessary */
      System.out.println("Buying some snacks");
   }

   public static void goToSchool() {
      System.out.println("Going back to school");
   }

   public static void main(String[] args) {
      Date[] dates = {
            createDate(2022, 10, 10),
            createDate(2022, 10, 11),
            createDate(2022, 10, 12)
      };
      for(Date date: dates) {
         try {
            System.out.println("=== Craving for snacks the " + displayDate(date));
            /* Write necessary methods */
         } /* Complete the try/catch block */
      }
   }
}