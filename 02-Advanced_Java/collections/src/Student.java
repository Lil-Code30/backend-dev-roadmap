public class Student {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[ " + this.rollNo + ", " + this.name + "(" + this.age +") ]";
    }
}