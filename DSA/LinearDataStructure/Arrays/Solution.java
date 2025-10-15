package DSA.LinearDataStructure.Arrays;


import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        search(arr, x);
        System.out.println();
    }

    public static int search(int arr[], int x) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        if (!found) {

        }
        return -1;
    }
}
