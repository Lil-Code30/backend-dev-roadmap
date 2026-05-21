public class Loops {
    public static void main(String args[]) {

        for(int x = 10; x < 20; x = x + 1) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }

        int [] numbers = {10, 20, 30, 40, 50};

        for(int index = 0; index < numbers.length; index++) {
            System.out.print("value of item : " + numbers[index] );
            System.out.print("\n");
        }

        // Implementing nested for loop
        // Initializing loop counters
        int num = 1;
        int i = 1;

        // outer for loop
        for (num = 1; num <= 10; num++) {
            //inner for loop
            System.out.print("Table of " + num + " is : ");
            for (i = 1; i <= 10; i++) {
                // printing table
                System.out.print(num * i + " ");
            }
            // printing a new line
            System.out.println();
        }

        // for-each
        String[] fruits = {"Apple", "Banana", "Orange", "Pear", "Strawberry"};
        int index = 0;

        for(String fruit : fruits){
            System.out.println(++index + " - " + fruit);
        }

        Student[] students = {new Student(1, "Julie"), new Student(3, "Adam"), new Student(2, "Robert")};

        for(Student student : students){
            System.out.print( student );
            System.out.print(",");
        }

        int [] numbers2 = {10, 20, 30, 40, 50};
        int index2 = 0;

        while( index2 < 5 ) {
            System.out.print("value of item : " + numbers2[index2] );
            index2++;
            System.out.print("\n");
        }

        int x = 10;

        do {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }while( x <= 20 );

    }

}

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString(){
        return "[ " + this.rollNo + ", " + this.name + " ]";
    }
}