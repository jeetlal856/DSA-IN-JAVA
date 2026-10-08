import java.util.*;


public class basicCode{
    public static void main(String args[]){

      Scanner sc=new Scanner(System.in);
      System.out.println("enter number and check number is prime or not");
      int n=sc.nextInt();
      sc.close();
      System.out.print("number is n="+n);
      System.out.println("");
      boolean check=true;
      for(int i=2;i<n;i++){
        if(n%i==0){
            check=false;
         
        }
      }

      if(check==true){
        System.out.println("number is prime");
      }else{
        System.out.println("number is not prime");
      }
    }
}