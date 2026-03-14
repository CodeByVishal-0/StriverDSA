package Array;
import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));

    }
    public static void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<m;i++){
            reverse(matrix,i,m,n);
        }

    }
    public static void reverse(int[][] matrix,int i,int m,int n){
        int l=0;
            int r=n-1;
            while(l<r){
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l++;
                r--;
            }
    }
    
}
