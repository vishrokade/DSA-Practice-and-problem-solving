package recursion;

public class concept {
    public static void main(String[] args){
    fun(5);
    }

    static void fun(int no){

        if(no == 0){
            return;
        }
        System.out.println(no);
        fun(--no);
        // n-- vs --n
    }

}
