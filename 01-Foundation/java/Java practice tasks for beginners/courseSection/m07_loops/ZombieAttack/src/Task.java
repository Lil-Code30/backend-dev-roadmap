public class Task {
    public static void main(String[] args) {

        int inhabitants = 6;

        // ----Do not change below lines. needed for testing---
        inhabitants = args.length > 0 ? Integer.parseInt(args[0]) : inhabitants;
        //--------------------------------

        //Write your solution here

        /*
        for(int i = 0; i >= 0 ; i++){
            System.out.println("Day " + i + "[" + inhabitants + ']');
            inhabitants /= 2;

            if(inhabitants == 0){
                System.out.println("---- EXTINCT ----");
                break;
            }
        }
        */

        int i = 0;
        do{
            System.out.println("Day " + i + "[" + inhabitants + ']');
            inhabitants /= 2;
            i++;
        }while(inhabitants != 0 );
        System.out.println("---- EXTINCT ----");

    }
}