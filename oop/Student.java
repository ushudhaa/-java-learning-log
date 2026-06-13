package oop;

public class Student extends Person{
   protected char grade;
   protected int roll_no;

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
