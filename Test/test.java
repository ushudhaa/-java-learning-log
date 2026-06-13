package Test;

import oop.Student;

public class test {
   /* static String isEven(int x){
        if(x%2 == 0){
            return "Even";
        }
        return "odd";
    }*/

    static void main(String[] args) {
        /*student s = new student();
        s.name = "Ushudha";
        s.roll_no = 2;
        s.setAge(-1);
        System.out.println(s.getAge());*/

        /*bank bank = new  bank();
        bank.setAccountNumber(3302);
        bank.deposit(-10);
        bank.withdraw(100);
        bank.deposit(100);
        bank.withdraw(10);
        System.out.println(bank.getBalance());*/
/*
        Rabbit rabbit = new Rabbit();
        rabbit.setAge(5);
        rabbit.eat();
        rabbit.sayhello();*/

        /*String result = isEven(9);
        System.out.println(result);*/
        /*for (char i = 'A'; i <= 'Z'; i++) {

            //String result = isEven(i);
            System.out.println(i);
        }*/
/*
       Animal myAnimal = new Animal();
        myAnimal.sayhello();

        Rabbit r = new Rabbit();
        r.sayhello();*/


        /*Teacher T = new Teacher(80000, 18, "ushudha", 1);

        T.EmployeeID();

        System.out.println(T.getSalary());

        System.out.println(T.getName());

        System.out.println(T.getAge());*/

        Student student = new Student("sohan", 'A', 1, 18);
        System.out.println(student.getGrade());
        System.out.println(student.getAge());
        System.out.println(student.getRoll_no());
        System.out.println(student.getName());

    }

}
