package oop.encapsulation;

public class RunEncap {

    public static void main(String[] args){
        EncapTest encap = new EncapTest();

        encap.setName("Test");
        encap.setIdNum("1");
        encap.setAge(100);

        System.out.println("Name : " + encap.getName() + " Age : " + encap.getAge());
    }

}
