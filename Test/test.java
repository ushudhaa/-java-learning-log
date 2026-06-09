package Test;

public class test {
    static void main(String[] args) {
        /*student s = new student();
        s.name = "Ushudha";
        s.roll_no = 2;
        s.setAge(-1);
        System.out.println(s.getAge());*/

        bank bank = new  bank();
        bank.setAccountNumber(3302);
        bank.deposit(-10);
        bank.withdraw(100);
        bank.deposit(100);
        bank.withdraw(10);
        System.out.println(bank.getBalance());

    }
}
