package AssignmentJava;

import java.util.Arrays;

public class pgm3 {
    public static boolean hasTwoSum(int[] arr, int t) {
        
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == t) {
                return true;
            } else if (sum < t) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, -1, 2, -3, 1};
        int t1 = -2;
        System.out.println(hasTwoSum(arr1, t1)); 

        int[] arr2 = {1, -2, 1, 0, 5};
        int t2 = 0;
        System.out.println(hasTwoSum(arr2, t2)); 
    }
}
