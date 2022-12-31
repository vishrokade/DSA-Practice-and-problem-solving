package OOP;

public class StaticBlock {
    static int a = 5;
    static int b;

    //this static block only run once when the first object of the class is created
    //when the class is loaded first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main (String[] args){

        StaticBlock obj = new StaticBlock();
        System.out.println(obj.a +" "+ obj.b);

        obj.b = obj.b*5;

        System.out.println(obj.a +" "+ obj.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(obj2.a+" "+obj2.b);

    }
}
