public class Task {
    public static void main(String[] args) {

        System.out.println(simpleRoomBook(false,2,1,2018));
        System.out.println(simpleRoomBook(true,2,1,2018));
        System.out.println(simpleRoomBook(true,2,1,2022));
        System.out.println(simpleRoomBook(true,7,1,2018));

    }

    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {

        //Write your solution here
        if(isAvailable){
            if((month >= 1 || month <= 12) && (day >= 1 || day <= 8) && year == 2018){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }

    }

}