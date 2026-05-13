public class Main {
   public static void main(String[] args) {
      // The user choose the value of the salary (at 100%) and the work rate.
      double salary_100 = 6000.0;
      double rate = 0.75;

      // The final key word is used because the values are constants.
      // It means they never change and the final makes so that if someone
      // tries to assign a new value, an error is raised.
      final double AVS_RATE = 5.300 / 100;
      final double AC_RATE = 1.100 / 100;
      final double LAA_NON_PROF_RATE = 0.920 / 100;
      final double EPARGNE_RATE = 0.7;
      final double RP_EPARGNE_RATE = EPARGNE_RATE * 8.000 / 100;
      final double RP_RISQUE_RATE = EPARGNE_RATE * 2.020 / 100;

      double gross_salary = salary_100 * rate;

      double avs = gross_salary * AVS_RATE;
      double ac = gross_salary * AC_RATE;
      double rp_epargne = gross_salary * RP_EPARGNE_RATE;
      double rp_risque = gross_salary * RP_RISQUE_RATE;
      double laa_non_prof = gross_salary * LAA_NON_PROF_RATE;
      double deductions = avs + ac + rp_epargne + rp_risque + laa_non_prof;

      double net_salary = gross_salary - deductions;

      System.out.println(gross_salary);
      System.out.println(deductions);
      System.out.println(net_salary);
   }
}