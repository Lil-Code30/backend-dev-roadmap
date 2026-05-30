package oop.aggregation;

public class Student {
    int rno;
    String stName;

    Address stAddr;

    Student(int roll, String name, Address address){
        this.rno = roll;
        this.stName = name;
        this.stAddr = address;
    }
}
