public class checking_sorted_array {
    // method 1
    static boolean isSorted(int[]arr){
        int n = arr.length;

        for (int i = 1; i < n; i++){
            if(arr[i-1] > arr[i])
                return false;
        }
        return true;

    }

    // method 2
    static boolean isSorted2(int[]arr,int n){


        // base case
        if(n == 1 || n == 0)
            return true;

        return arr[n-1] >= arr[n-2] && isSorted2(arr,n-1);
    }
    public static void main(String[] args) {

    }
}
