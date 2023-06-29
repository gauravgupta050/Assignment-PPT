package Assignment4;
import java.util.*;

public class Q4 {

    public static int sum(int[] arr){
        Arrays.sort(arr);
        int add = 0;
        for(int i=0; i<arr.length; i += 2){
            add = add + arr[i];
        }
        return add;

    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        int result = sum(arr);
        System.out.println("The maximized sum is "+result);
    }
    
}
