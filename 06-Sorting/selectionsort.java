public class selectionsort {


      public static void displayArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // selection sort method

    public static void selectoinSort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp =arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
                displayArr(arr);

    }

    public static void main(String[] args) {

           int arr[]={5,4,1,3,2};
        selectoinSort(arr);
        
    }
    
}
