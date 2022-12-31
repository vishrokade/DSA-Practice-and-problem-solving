package OOP;


class Test{
    static String name;
    public Test(String name){
        this.name = name;
    }
}

//this class/outer class cannot be static cause it is itself not dependant on other class
//so without creating an object of this class we cant reference it so how can we access the
// main method inside this class
public class InnerClasses {

    static class Inner{
        String name;

        public Inner(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args){

        Inner obj = new Inner("vishal");
        Inner obj1 = new Inner("mahesh");

        System.out.println(obj.name);
        System.out.println(obj1.name);

        Test object = new Test("soham");
        Test object2 = new Test("abhi");

        System.out.println(object.name);
        System.out.println(object2.name);



        System.out.println(Test.name);
    }
}

//System.out.println();

//here println() is method of the printstream class that has variable name as out