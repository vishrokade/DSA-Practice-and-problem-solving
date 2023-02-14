package OOP;

public class Demo {

    int a = 10;
    static void print(){
        System.out.println("hii this is vishal");
    }
    public static void main(String args[]){
     /*   int no = 5;
        Demo d1 = new Demo();
       print();
        System.out.println(d1.a);

        boolean c ;
        c = d1.checkEven(no);


        if(c==true){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }

      */

        int a=10;
        int b =20;
        findsum(a,b);
        int c = findadd(10,30);
    }
     boolean checkEven(int no){
        if(no%2 == 0){
            return true;
        }
        return false;
    }
    static void  findsum(int first,int second){
        System.out.println(first+second);
    }

    static int findadd(int a,int b){
        return a+b;
    }
}
