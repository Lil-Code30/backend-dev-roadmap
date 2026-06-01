public class Task {
    public static void main(String[] args) {

        System.out.println(waterTax(50));
        System.out.println(waterTax(55));
        System.out.println(waterTax(151));

    }

    public static double waterTax(int units){

        //Write your solution here

        double bill = 0;

        if(units > 150){
            bill = (units * 0.90) + 100;
        }else if(units > 100){
            bill = (units * 0.90) + 50;
        }else if(units > 50){
            bill = units * 0.90;
        }else{
            bill = units * 0.60;
        }

        return bill;

    }


}