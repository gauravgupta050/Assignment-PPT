package Assignment4;
import java.util.*;

public class Q1 {
    
    public static List<Integer> intersection(int[] arr1, int[] arr2, int[] arr3){
        List<Integer> result = new ArrayList<>();
        int i=0;
        int j=0; 
        int k=0;

        while(i<arr1.length && j<arr2.length && k<arr3.length){
            
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                //System.out.println(arr1[i]);
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            else if(arr1[i]>arr2[j]){
                j++;

            }
            else if(arr2[j]>arr3[k]){
                k++;
            }
            else{
                i++;
            }

        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr1 =  {1,2,3,4,5};
        int[] arr2 = {1,2,5,7,9}; 
        int[] arr3 = {1,3,4,5,8};

        System.out.println(intersection(arr1, arr2, arr3));


    }
}
