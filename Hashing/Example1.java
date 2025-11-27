package Hashing;
import java.util.HashSet;

// [2,5,7,9] target = 13


public class Example1 {
    public static void main(String[] args) {
        

        int[] arr = {2,5,7,9};

        int n = arr.length;
        int target = 16;

        boolean flag = false;
        // //Brute Force
        // for(int i = 0;i<n;i++){
        //     for(int j = i + 1; j<n;j++){
        //         if(arr[i] + arr[j] == target){
        //             flag = true;
        //             break;
        //         }
        //     }
        //     if(flag == true) break;
        // }

        // for(int i = 0;i<n-1;i++){
        //     if(arr[i] + arr[i+1] == target){
        //         flag = true;
        //     }
        // }


        HashSet<Integer> set = new HashSet<>();

        for(int i = 0;i<n;i++){
            set.add(arr[i]);
        }
        //O(n)

        for(int i = 0;i<n;i++){
            int x = target - arr[i];
            flag = set.contains(x); //O()
        }
        //O(n)

        if(flag == false){
            System.out.println("Pair is not present");
        }
        else{
            System.out.println("Pair is present in the array");
        }
    }
}
