package Arrays.DSA;

import java.util.Arrays;

public class DuplicateNumber {
    public static int[] removeDuplicates(int[] arr) {
        int count = 1;
        int point1 = 0;
        int point2 = 0;
        int n = arr.length;
        while(point2<n){
            if(arr[point1] == arr[point2]){
                point2++;
            }
            else if(arr[point1]!=arr[point2]){
                point1++;
                arr[point1] = arr[point2];
                point2++;
                count++;
            }
        }

        return Arrays.copyOf(arr, count);
    }
}
