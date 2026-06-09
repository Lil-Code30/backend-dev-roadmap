package oop.encapsulation;

public class EncapTest {
    private String name;
    private String idNum;
    private int age;

    public String getName(){
        return name;
    }

    // getters and setters
    public void setName(String newName){
        name = newName;
    }

    public String getIdNum(){
        return idNum;
    }

    public void setIdNum(String newIdNum){
        idNum = newIdNum;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        age = newAge;
    }
}
