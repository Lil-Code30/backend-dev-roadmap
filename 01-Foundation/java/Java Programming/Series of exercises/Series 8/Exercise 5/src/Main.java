public class Main {

    /* Implement the program based on instructions */

    public static void main(String[] args) {
        byte[][] originalImage = {
                {10, 20, 30, 40, 50, 60},
                {15, 25, 35, 45, 55, 65},
                {70, 80, 90, 100, 110, 120},
                {75, 85, 95, 105, 115, 125}
        };

        byte[][] reducedImage = downScale(originalImage);

        for (int i = 0; i < reducedImage.length; i++) {
            for (int j = 0; j < reducedImage[i].length; j++) {
                System.out.print(reducedImage[i][j] + " ");
            }
            System.out.println();
        }
    }
}
