public class ExampleClass {

    public static void main(String[] args){

        Student vishal;
        for (int i = 0; i < 1000; i++) {
            vishal = new Student();
        }
    }
}
class Student{
    String name;
    int roll;
    Student () {

    }

    Student (String name,int roll){
        this.name = name;
        this.roll = roll;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
