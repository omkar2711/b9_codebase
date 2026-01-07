package DSA.Arrays;

public class sumTwoInteger {
    public static void sum(int[] arr, int target){
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        
        int target = 70;

        sum(arr, target);
    }
}
