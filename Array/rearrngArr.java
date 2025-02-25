

import java.util.Arrays;

// Rearrange array in increasing-decreasing order
public class rearrngArr {
    public static void main(String[] args) { // TC = O(nlogn) + o(n)
        int arr[] = {8,7,1,6,5,9};
        int n = arr.length;
        Arrays.sort(arr);

        for (int i=0; i <n/2; i++){
            System.out.print(arr[i] + " ");
        }
        for (int i = n-1; i >= n /2; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
