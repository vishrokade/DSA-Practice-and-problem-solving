package Shapes;

public class Shapes {
    int w ;
    Shapes(int w){
        this.w = 0;
    }
   void area(){ // final keyword is used to prevent from the overriding of methods
       // if we do this area method as final then the methods in the square and circle class will not be
       // accessed if the name of the method is same
       //we can't override the method which is final
        System.out.println("we are in shapes");
    }
}
