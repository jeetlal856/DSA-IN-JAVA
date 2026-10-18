

public class daignalSum {
     public static void dispalyMatrix(int matrix[][]){

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static int DiagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            // first diagonal sum
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        
      int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      dispalyMatrix(matrix);
      System.out.print("sum of diagonal = "+DiagonalSum(matrix));

    }
    
}
