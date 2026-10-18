import java.util.Scanner;

public class twoDimentionalMatrix {

    public static void dispalyMatrix(int matrix[][]){

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }


    // spiral Matrix quetion

    public static void spiralMatrix(int matrix[][]){
        int startCol=0;
        int startRow=0;
        int endCol=matrix[0].length-1;
        int endRow=matrix.length-1;
        while(startRow<=endRow && startCol<=endCol){
            //printing top element

            for(int i=startCol;i<=endCol;i++){
                System.out.print(matrix[startRow][i] + " ");   
                     }
   
         
        // right side
        for(int j=startRow+1;j<=endRow;j++){
            System.out.print(matrix[j][endCol]+" ");
        }

     
        //bottom

        for(int i=endCol-1;i>=startCol;i--){
            System.out.print(matrix[endRow][i]+" ");
        }
   
        //left side
        for(int j=endRow-1;j>=startRow+1;j--){
            System.out.print(matrix[j][startCol]+" ");
        }
        startCol++;
        startRow++;
        endCol--;
        endRow--;
    }
         }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int matrix[][]=new int[4][3];

        // taking element using for loop
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print("enter element in matrix");
                matrix[i][j]=sc.nextInt();
            }
        }
        
        dispalyMatrix(matrix);
        spiralMatrix(matrix);
      sc.close();
    }

    
}
