public class Main {

    // Method to generate an array indicating whether each index is a prime number
    /* Implement the program based on instructions */

    public static void main(String[] args) {
        int n = 20; // Example size
        boolean[] primeArray = generatePrimeArray(n);

        // Print the prime array
        for (int i = 0; i < n; i++) {
            System.out.println(i + " : " + primeArray[i]);
        }
    }
}
