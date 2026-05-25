public class Task {
    public static void main(String[] args) {

        int yearsWithCompany = 5;
        int department = 5;

        // ----Do not change below lines. needed for testing---
        yearsWithCompany = args.length > 0 ? Integer.parseInt(args[0]) : yearsWithCompany;
        department = args.length > 0 ? Integer.parseInt(args[1]) : department;
        //--------------------------------

        //Write your solution here

        boolean hasBonus = yearsWithCompany >= 5 && department == 10 || department == 15;

        System.out.println("hasBonus = " + hasBonus);

    }
}