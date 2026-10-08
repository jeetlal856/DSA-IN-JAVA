

public class fun {

    public static int sum(int a,int b){
        int c=a+b;
        return c;
    }

    public static int sum(int a,int b,int c){
        int d=a+b+c;
        return d;
    }

    public static float sum(float a,float b){
        float c=a+b;
        return c;
    }

    // subtraction of  number

    public static int sub(int a,int b){
        int c=a-b;
        return c;
    }

    // function overloading

    public static int sub(int a,int b,int c){
        int d=a-b-c;
        return d;
    }

    // float function overloading

    public static float sub(float a,float b){
        float c=a-b;
        return c;
    }

    // multipllication method

    public static int mul(int a,int b){
        int c=a*b;
        return c;
    }

    // function overloading with different parameter

    public static int mul (int a,int b,int c){
        int d=a*b*c;
        return d;

    }

    // function overloading with different data type

    public static float mul(float a,float b){
        float c=a*b;
        return c;
    }

    // divide method

    public static int divide(int a,int b){
        int c=a/b;
        return c;
    }

    // function overloading with differentparameter

    public static int divide(int a,int b,int c){
        int d=(a/b)/c;
        return d;
    }

    public static float divide(float a,float b){
        float ans=a/b;
        return ans;
    }

    public static void main(String[] args) {

        float ans=sum(10.89f,10.14f);
        System.out.println(ans);

           float ans1=sub(10.89f,10.14f);
        System.out.println(ans1);

           float ans2=mul(10.89f,10.14f);
        System.out.println(ans2);


        
           float ans3=divide(10.89f,10.14f);
        System.out.println(ans3);
        
        
    }
}
