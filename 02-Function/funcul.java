public class funcul {

    public static float Average(float a,float b,float c){
        float avg=(a+b+c)/3;
        return avg;
    }

    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }


    public static boolean palinDrome(int a){

        int b=a;
        int r=0;
        while(a>0){
            int ld=a%10;
            r=r*10+ld;
            a=a/10;

        }

        if(b==r){
            return true;
        }else{
            return false;
        }

    }

    public static int sumNum(int n){
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {

        float ans=Average(20.9f, 30.6f, 40.45f);
        System.out.println("average of three num = "+ans);

        boolean cheack=isEven(6);
        System.out.println(cheack);

        boolean cheakpalinDrome=palinDrome(123);
        if(cheakpalinDrome==true){
            System.out.println("num is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }

        int n=12345;

        int sum=sumNum(n);
        System.out.println("sum of number "+n+"="+sum);
        
    }
    
}
