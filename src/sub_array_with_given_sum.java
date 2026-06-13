public class sub_array_with_given_sum {
    public static void main(String[] args) {
        int arr[] = {1,4,20,3,10,5};
        int target = 33;

        int start =0;
        int sum = 0;

        for (int end=0; end<arr.length; end++){
            sum+=arr[end];

            while(sum>target){
                sum -= arr[start];
                start++;
            }
            if(sum == target){
                System.out.println("sub Array found :");
                for(int i = start; i <= end ; i++){
                    System.out.println(arr[i]+" ");
                }

                return;
            }
        }


        System.out.println("no subarray found");


    }
}
