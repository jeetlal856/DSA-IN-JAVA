

public class quetion1 {

    public static boolean checkDuplicate(int arr[]){
        boolean check=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    check=true;
                    return check;
                }
            }
        }
        return check;

    }

    public static void main(String[] args) {

        int arr[]={1,2,3,1};

        boolean ans=checkDuplicate(arr);
        System.out.println(ans);
        
    }
    
}
