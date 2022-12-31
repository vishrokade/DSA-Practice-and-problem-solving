public class patterns {
    public static void main(String[] args){


        for(int i = 0; i<5;i++){
            for(int j = 5; j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 0; i<5;i++){
            for(int j= 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0 ; i<5;i++){
            for(int j = 0;j<5-i;j++){
                System.out.print("  ");
            }
            for(int k = 0; k <= i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int i = 0; i<5; i++){
            for(int j = 0; j<=i;j++){
                System.out.print("  ");
            }
            for(int k =5;k>i;k-- ){
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int i=0 ; i<4;i++){
            for(int j = 0;j<4-i;j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
/*
        for(int i = 0; i<3; i++){
            for(int j = 0; j<=i;j++){
                System.out.print(" ");
            }
            for(int k =3;k>i;k-- ){
                System.out.print(" *");
            }
            System.out.println();
        }



 */
        //tringleRec(5,0);
    }

    static void tringleRec(int c , int r){

        if(c==0){
            return;
        }

        if(c>r){

            tringleRec(c,r+1);
            System.out.print("*");
        }
        else {

            tringleRec(c-1,0);
            System.out.println();
        }
    }
}
