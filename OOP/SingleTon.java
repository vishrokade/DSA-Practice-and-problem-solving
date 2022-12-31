package OOP;
//we can create only one object of the class
//singleton class is used to create only one object of the class
public class SingleTon {
    private SingleTon() {  //make constructor private so the constructor cant be accessed frm the another files
                            //when we call the constructor object is being made
    }

    public static SingleTon singleTon;

    public static SingleTon getInstance() {

        if (singleTon == null){  //it checks that the object of the class is created or not
            // and create only one object of it and return it
            // and if the object is already created then it onl return the create one
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}
