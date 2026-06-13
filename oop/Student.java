package oop;

public class Student extends Person{
   protected char grade;
   protected int roll_no;

   public Student(String name, char grade, int roll_no, int age){
       this.name = name;
       this.grade = grade;
       this.roll_no = roll_no;
       this.age  = age;
   }

public void setGrade(char grade){
    this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }



    public void setRoll_no(int roll_no){
    this.roll_no = roll_no;
    }

    public int getRoll_no(){
    return roll_no;
     }


}
