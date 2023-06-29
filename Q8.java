package Assignment4;
import java.util.*;


public class Q8 {
    public static int[] reArrange(int[] nums, int n){
        int[] result = new int[2*n];
        for(int i=0;i<2*n;i++){
            if(i%2 == 0){
                result[i] = nums[i/2];
            }
            else{
                result[i] = nums[n+i/2];
            }
        }
        return result;
    }
    


    public static void main(String[] args) {
            int[] nums = {2,5,1,3,4,7};
            int n=3;
            System.out.println("The output array is " + Arrays.toString(reArrange(nums,n)));
    }
}
