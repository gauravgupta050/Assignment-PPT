package Assignment4;
import java.util.*;

public class Q3 {
    public static int[][] transpose(int[][] arr, int r, int c){
        int[][] result = new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp = arr[i][j];
                arr[i][j] =  arr[j][i]; 
                arr[j][i] = temp;
                //result[j][i] = arr[i][j];

            }
        }
        return arr;

    } 

    public static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int r = arr.length;
        int c = arr[0].length;

        int[][] nums = transpose(arr,r,c);
        printArray(nums);
    }
    
}
