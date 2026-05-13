import java.util.Locale;

public class Main {

   /**
    * Round the given value to 5 cents.
    *
    * @param value The value to round to 5 cents.
    * @return The value rounded to 5 cents.
    */
   public static /* Define the return type */ roundTo5Cents(/* Define the parameter type */ value) {
      return /* Write the statements to round to 5 centimes */;
   }

   /**
    * Compute the total deductions accordingly to the given gross salary.
    *
    * @param grossSalary The gross salary.
    * @return The deductions to apply to the gross salary, rounded to 5 cents.
    */
   public static double computeDeductions(double grossSalary) {
      final double AVS_RATE = 5.300 / 100;
      final double AC_RATE = 1.100 / 100;
      final double LAA_NON_PROF_RATE = 0.920 / 100;
      final double EPARGNE_RATE = 0.6744;
      final double RP_EPARGNE_RATE = EPARGNE_RATE * 8.000 / 100;
      final double RP_RISQUE_RATE = EPARGNE_RATE * 2.020 / 100;

      double avs = /* Call the right method */(grossSalary * AVS_RATE);
      double ac = /* Call the right method */(grossSalary * AC_RATE);
      double rp_epargne = /* Call the right method */(grossSalary * RP_EPARGNE_RATE);
      double rp_risque = /* Call the right method */(grossSalary * RP_RISQUE_RATE);
      double laa_non_prof = /* Call the right method */(grossSalary * LAA_NON_PROF_RATE);
      double deductions = /* Call the right method */(avs + ac + rp_epargne + rp_risque + laa_non_prof);

      return deductions;
   }

   /**
    * Display on the console all salary information.
    *
    * @param rate The work rate (between 0 and 100).
    * @param grossSalary The gross salary, rounded to 5 cents.
    * @param deductions The total deductions, rounded to 5 cents.
    * @param netSalary The net salary, rounded to 5 cents.
    */
   public static /* Define the return type */ displaySalaryInfo(int rate, double grossSalary,
                                        double deductions, double netSalary) {
      System.out.println("=== Salary information :");
      System.out.println("Work rate " + rate + "%");
      // Don't use printf, otherwise the test check won't work correctly
      System.out.println(String.format(Locale.US, "Gross salary %.2f",
          grossSalary));
      System.out.println(String.format(Locale.US,"Deductions %.2f", deductions));
      System.out.println(String.format(Locale.US,"Net salary %.2f", netSalary));
   }

   /**
    * Entry point of Java program.
    *
    * @param args The list of arguments.
    */
   /* Fill up the main signature */ main/* Fill up the main signature */ {
      // Choix de l'utilisateur
      double salaire_100 = 6423.20;

      for(int rate = 20;/* Fill up the for loop parameters */) {
         double grossSalary = /* Call the right method */(salaire_100 * rate / 100);
         double deductions = /* Call the right method */(grossSalary);
         double netSalary = grossSalary - deductions;
         displaySalaryInfo(rate, grossSalary, deductions, netSalary);
      }
   }
}