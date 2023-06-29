package Assignment4;

public class Q7 {
    public static int maxCount(int m, int n, int[][] arr){
        int r = m;
        int c = n;
        for(int i=0;i<arr.length; i++){
            r = Math.min(r,arr[i][0]);
            c = Math.min(c,arr[i][1]);

        }
        return r*c;
    }

    public static void main(String[] args) {
        int m = 3;
        int n=3;
        int[][] arr = {{2,2},{3,3}};
        int result = maxCount(m,n,arr);
        System.out.println("The number of maximum integers in the matrix " + result);


    }
    
}
