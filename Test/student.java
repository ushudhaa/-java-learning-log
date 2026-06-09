package Test;

public class student {
    //instance variable , properties, fields & behavior
    String name;
    private int age;
    int roll_no;

    public void setAge(int x) {
        if(x < 0){
            x = 0;
        }
            this.age = x;
    }

    public int getAge() {
        return age;
    }

}
