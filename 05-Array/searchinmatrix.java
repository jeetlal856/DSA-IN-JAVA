

public class searchinmatrix {

      public static void dispalyMatrix(int matrix[][]){

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static boolean searchInMatrix(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }

        return false;


    }
    public static void main(String[] args) {

        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        dispalyMatrix(matrix);

        boolean checkelement=searchInMatrix(matrix, 29);

        if(checkelement==true){
            System.out.print("element persent in matrix");
        }else{
            System.out.print("element is not persent in matrix");
        }
        
    }
    
}
