public class pattern1 {

    public static void pattern(){

        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1||j==1||i==4||j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                   
                }
            }
             System.out.println();
        }
    }

    // Inverted and roteded half payramid

    public static void InvertedHalfPayramid(int toRow,int toCol){
        for(int i=1;i<=toRow;i++){
            for(int j=1;j<=toCol-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Inverted half pyramid with number

    public static void pyramiWithNumber(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void FloydTringle(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;

            }
            System.out.println();
        }
    }

    public static void zeroOneTringle(int n){
        for(int i=1;i<=n; i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void batterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

               for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
         System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i+1;k++){
                System.out.print("*");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
      //  pattern();
    //   InvertedHalfPayramid(4, 4);
        // pyramiWithNumber(5);
        // FloydTringle(5);
        // zeroOneTringle(5);
        batterfly(10);
    }
    
}
