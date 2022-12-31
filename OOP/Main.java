package OOP;

public class Main {

    public static void main(String []args){
        SingleTon obj = SingleTon.getInstance();

        SingleTon obj2  = SingleTon.getInstance();

        SingleTon obj3  = SingleTon.getInstance();

        //the value of all the object is the same
        //all of these variables are pointing to the same object
    }
}
