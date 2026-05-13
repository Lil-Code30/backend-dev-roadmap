public class Main {
    /* Implement the program based on instructions */

    /* Implement the program based on instructions */

    public static void rectangularDemo() {
        int[][] rect = { {1,2,3},
                {4,5,6}};
        int[][] nonRect = {{1,2},
                {3,4,5}};
        try {
            checkRectangular(rect);
        } catch(Exception e) {
            throw new RuntimeException("wrong result in checkRectangular()!");
        }
        boolean thrown = false;
        try {
            checkRectangular(nonRect);
        } catch(Exception e) {
            thrown = true;
        }
        if(!thrown)
            throw new RuntimeException("wrong result in checkRectangular()!");
    }

    public static void similarDemo() {
        // TODO: check at least some data samples
    }

    public static void main(String[] args) {
        rectangularDemo();
        similarDemo();
        System.out.println("Everything seems Ok");
    }

}