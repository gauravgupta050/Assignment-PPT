package Assignment4;
import java.util.*;

public class Q6 {

    public static int[] sortedSquare(int[] nums){
        
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }  
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
            int[] nums = {-4,-1,0,3,10};
            System.out.println("The output array is "+ Arrays.toString(sortedSquare(nums)));
    }
}
