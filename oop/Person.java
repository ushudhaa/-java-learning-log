package oop;

public class Person {
    protected String name;
    protected int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            age = 18;
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void EmployeeID(){
        System.out.println("...." );
    }
}
