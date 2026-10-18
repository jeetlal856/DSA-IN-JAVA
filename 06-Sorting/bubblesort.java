public class bubblesort {

    // function to display array

    public static void displayArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // bubble sort function
    public static void bubbleSort(int arr[]){
        // create boolean type variable that check given array are sorted or not
        boolean check=true;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    check=false;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(check!=false){
                System.out.println("array is already sorted");
                break;
            }
        }

        displayArr(arr);

    }


    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};
        bubbleSort(arr);
        
    }
    
}
