import java.util.Scanner;

/*public class ch5_takinginput {
    public static void main(String[] args) {

        System.out.println("Take input from user");


        Scanner sc = new Scanner(System.in);

       *//* System.out.println("Enter the user number 1:");
        int a = sc.nextInt();
        System.out.println("Enter the user number  2:");
        int b = sc.nextInt();
        int  sum = a + b;
        System.out.println(sum);*//* //this  is for  int method

        boolean b = sc.hasNextInt();
        System.out.println(b);
    }
}*/

public class takinginput {

    static void methodName(int... numbers) {

        int total = 0;

        for (int n : numbers) {
            total += n;
        }

        int maxMarks = numbers.length * 100;

        double percentage = (total * 100.0) / maxMarks;

        System.out.println("Total Percentage: " + percentage);
    }

    public static void main(String[] args) {

        System.out.println("Total percentage");
        Scanner sc = new Scanner(System.in);

        System.out.println("Math: Enter your marks out of 100");
        int a = sc.nextInt();

        System.out.println("English: Enter your marks out of 100");
        int b = sc.nextInt();

        System.out.println("Social: Enter your marks out of 100");
        int c = sc.nextInt();

        System.out.println("Account: Enter your marks out of 100");
        int d = sc.nextInt();

        System.out.println("Computer: Enter your marks out of 100");
        int e = sc.nextInt();

        methodName(a, b, c, d, e);
    }
}

