package oop;

public class Teacher extends Person {

    private double salary;
    private int employeeID;

    public Teacher(double salary, int age, String name, int employeeID) {
        this.salary = salary;
        this.employeeID = employeeID;
        this.age = age;
        this.name = name;
    }

    public void setSalary(int x){
        if(x <= 0){
            this.salary = 0;
            return;
        }
        this.salary = x;
    }

    public double getSalary(){
        return salary;
    }

    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }

    public void EmployeeID(){
        System.out.println(employeeID);
    }
}