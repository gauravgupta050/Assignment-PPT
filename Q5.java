package Assignment4;

public class Q5 {
    public static int totalRows(int n){
        long lo = 0;
        long hi = n;

        while(lo<hi){
            long mid = lo + (hi-lo)/2;
            if(n>=mid+(mid+1)/2){
                lo = mid + 1;
            }
            else{
                hi = mid-1;
            }
            



        }
        return (int)lo-1;
    }

    public static void main(String[] args) {
            
            int n = 5;
            System.out.println("The number of complete rows are " + totalRows(n));
        }
}
