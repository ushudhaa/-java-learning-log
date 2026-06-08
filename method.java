public class method {
     static int logic(int a, int b){
        int c;
        if (a>b){
            c = (a+b)*5;
        }
        else{
            c = a+b;
        }
        return c;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = logic(a,b);
        // method obj = new method();
        // int c = obj.logic(a,b);


        int a1 = 30;
        int b1 = 40;
        int c1 = logic(a1,b1);  //if we are using static method then we can call the method directly without creating the object of the class
        // method obj1 = new method();  // if we are using non static method then we have to create the object of the class to call the method
        // int c1 = obj1.logic(a1,b1);


        System.out.println(c);
        System.out.println(c1);
    }
}