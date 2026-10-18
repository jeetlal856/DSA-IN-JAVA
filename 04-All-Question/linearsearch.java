import java.util.Scanner;

public class linearsearch{

    public static int searchElement(int[]arr,int n){
         int ans=-1;
         for(int i=0;i<arr.length;i++){
           if(arr[i]==n){
            ans=arr[i];
            return ans;
           }
         }
         return ans;
    }
    
    public static void main(String[] args) {

        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("enter element in array");
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
      
        System.out.println("enter element and search");
        System.out.println();

        int n=sc.nextInt();

        int ans=searchElement(arr,n);
        if(ans==-1){
            System.out.println("the target eement is not persent in search space");
        }else{
            System.out.println("target element is persent in search space "+ans);
        }
        System.out.println();
        // System.out.println(ans);
       sc.close();
    }
}