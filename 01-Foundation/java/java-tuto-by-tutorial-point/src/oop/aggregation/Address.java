package oop.aggregation;

public class Address {
    int strNum;
    String city;
    String state;
    String country;

    Address(int street, String c, String st, String country) {
        this.strNum = street;
        this.city = c;
        this.state = st;
        this.country = country;
    }
}
