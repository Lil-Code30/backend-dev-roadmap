public class Task {
    public static void main(String[] args) {

        int modelYear = 2002;

        // ----Do not change below lines. needed for testing---
        modelYear = args.length > 0 ? Integer.parseInt(args[0]) : modelYear;
        //--------------------------------

        //Write your solution here

        if((modelYear >= 2001 && modelYear <= 2002) || (modelYear >= 2004 && modelYear <= 2006) ||(modelYear >= 2015 && modelYear <= 2018)){
            System.out.println("RECALL");
        }else{
            System.out.println("NOT RECALL");
        }

    }
}