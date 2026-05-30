package oop.aggregation;

public class Tester {

    public static void main(String[] args){
        Address ad = new Address(10, "Bareilly", "UP", "India");

        Student st= new Student(1, "Aashi", ad);
        System.out.println("Roll no: "+ st.rno);
        System.out.println("Name: "+ st.stName);
        System.out.println("Street: "+ st.stAddr.strNum);
        System.out.println("City: "+ st.stAddr.city);
        System.out.println("State: "+ st.stAddr.state);
        System.out.println("Country: "+ st.stAddr.country);
    }
}
