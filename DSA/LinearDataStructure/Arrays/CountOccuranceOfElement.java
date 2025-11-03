package DSA.LinearDataStructure.Arrays;

public class CountOccuranceOfElement {
    int countElement(int[] arr,int num)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == num) {
                count++;
            }
        }
        return count;
    }
    static void main(String[] args) {
        CountOccuranceOfElement obj = new CountOccuranceOfElement();
        int[] arr = new int[]{1,2,2,3,4,5,2};
        int num = 2;
        System.out.println(obj.countElement(arr,num));
    }
}
