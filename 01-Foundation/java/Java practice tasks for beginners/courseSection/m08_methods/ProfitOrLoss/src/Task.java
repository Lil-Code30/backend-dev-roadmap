public class Task {
    public static void main(String[] args) {

        System.out.println(profit(10, 10));
        System.out.println(profit(100,1500));
        System.out.println(profit(20, 5));
    }

    public static String profit(int buyPrice, int sellPrice){

        String profit;
        //Write your solution here
        if(sellPrice > buyPrice){
            profit = "profit";
        }else if(sellPrice < buyPrice){
            profit = "loss";
        }else{
            profit = "no loss";
        }

        return profit;

    }

}