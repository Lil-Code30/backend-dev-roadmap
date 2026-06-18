import java.io.*;
import java.rmi.RemoteException;

public class ExceptionDemo {
    public static void main(String[] args) throws Exception {
        // https://www.baeldung.com/java-exceptions

        // Built-in Exception
        // https://www.tutorialspoint.com/java/java_builtin_exceptions.htm

        // Multiple Catch Blocks
        try{
            File file = new File("E://file.tsxt");

            FileReader fr = new FileReader(file);
        }catch( FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        int a[] = new int[2];

        try{
            System.out.println("Access element three :" + a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown : " + e);
        }finally{
            a[0] = 6;

            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }


        try{
            int a2[] = new int[2];
            int b = 0;
            int c = 1/b;

            System.out.println("Access element three : "+ a2[3]);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Exception thrown : " + e);
        }

        //Java Nested Try Block Example
        System.out.println("===== Java Nested Try Block Example =====");

        try{
            int a3[] = new int[2];
            try{
                int b = 0;
                int c = 1/b;
            }catch (Exception e){
                System.out.println("Exception thrown: " + e);
            }

            System.out.println("Access element three : "+ a3[3]);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Exception thrown : " + e);
        }

        int num1 = 2;
        int num2 = 0;

        System.out.println("Result: " + divide(num1, num2));

        System.out.println("Out of the block");

    }

    //The Throws/Throw Keywords
    /*
    * Try to understand the difference between throws and throw keywords,
    * throws is used to postpone the handling of a checked exception
    * and throw is used to invoke an exception explicitly.
    * */
    public void deposit(double amount) throws RemoteException{
        // Method implemented
        throw new RemoteException();
    }

    private static int divide(int a, int b) throws Exception{
        if (b == 0){
            throw new Exception("second argument cannot be zero.");
        }

        return a/b;
    }

//    public void withdraw(double amount) throws RemoteException,
//            InsufficentFundsException {
//        // method implementation
//    }

}
