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

    @Override
    public boolean equals(Object obj){
        Student s = (Student) obj;

        return this.rollNo == ((Student) obj).rollNo && this.name.equalsIgnoreCase(((Student) obj).name);
    }

//    public int compareTo(Student student){
//        return this.rollNo - student.rollNo;
//    }
}