package DSA.SearchingAlgo;

public class binarySearch {

    public static void main(String [] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int target = 8;
        boolean isFound=false;

        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println("element found");
                isFound=true;
                break;

            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(isFound==false){
            System.out.println("element not found");

        }
    }
}
