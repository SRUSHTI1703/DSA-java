import java.util.ArrayList;
import java.util.Collections;

public class LEADERS_ARRAY {
    static ArrayList<Integer> leaders(int arr[]){
        // BRUTE FORCE APPROACH - TIME COMPLEXITY {O(n^2)}
        ArrayList<Integer> leaders = new ArrayList<>();
        // OPTIMSED CODE
        int maxRight = arr[arr.length-1];
        leaders.add(maxRight);

        for(int i = arr.length-2;i>=0;i--){
            if(arr[i] >= maxRight){
                maxRight = arr[i];
                leaders.add(arr[i]);
            }
        }
        Collections.reverse(leaders);
        return leaders;
       // ---------------------------------------------------
//        for(int i =0; i<arr.length;i++){
//            boolean isLeader = true;
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[j]>arr[i]){
//                    isLeader = false;
//                    break;
//                }
//            }
//            if(isLeader){
//                leaders.add(arr[i]);
//            }
//        }
//        return leaders;
        //--------------------------------------------------------
    }
}
