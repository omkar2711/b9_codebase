package DSA.Arrays;

public class findDuplicate {
    
    public static void main(String[] args) {
        
        int[] arr = {10,20,30,20,50};

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("The Dublicate number is "+arr[i]+" , "+arr[j]);
                    System.out.println("The Dublicate index is "+i+" , "+j);
                }
            }
        }
    }
}
