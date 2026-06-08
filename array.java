public class array{
    public static void main( String  [] args){
        // int [] x = new int [3];
        // System.out.print(x[1]);
          sum(new int[]{ 1, 2, 3 });

    }
    public static void sum(int[] a)
    {
        int total = 1;
        for(int a1 : a)
        {
            total = total + a1;
            System.out.println(total);
        }
    }
}