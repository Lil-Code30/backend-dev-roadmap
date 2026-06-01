public class Task {
    public static void main(String[] args) {

        // System.out.println(getCharacterSet('7', 'P'));
        // System.out.println(getCharacterSet("uppercase"));
        getCharacterSet('7', 'P');
        System.out.println();
        getCharacterSet('X', '}');

        System.out.println("\n------------------");
        getCharacterSet("uppercase");
        System.out.println();
        getCharacterSet("lowercase");
        System.out.println();
        getCharacterSet("digit");
        System.out.println();
        getCharacterSet("special");

    }

    public static void getCharacterSet(char start, char end){

        //Write your solution here

        for(int i = (int) start; i <= (int) end; i++){
            char k = (char) i;
            System.out.print(k);
        }

    }

    public static void getCharacterSet(String group){

        //Write your solution here
        switch (group) {
            case "uppercase":
                for(int i = 65; i <= 90; i++){
                    char k = (char) i;
                    System.out.print(k);
                }
                break;
            case "lowercase":
                for(int i = 97; i <= 122; i++){
                    char k = (char) i;
                    System.out.print(k);
                }
                break;
            case "digit":
                for(int i = 48; i <= 57; i++){
                    char k = (char) i;
                    System.out.print(k);
                }
                break;
            case "special":
                for(int i = 33; i <= 46; i++){
                    char k = (char) i;
                    System.out.print(k);
                }
                break;
            default:
                System.out.println();
        }
    }

}