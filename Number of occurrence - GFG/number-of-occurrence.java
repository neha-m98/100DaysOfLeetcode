//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
    int left = binarySearch(arr, x, true);
    if (left < 0) return 0;
    int right = binarySearch(arr, x, false);
    return right - left + 1;
}

private int binarySearch(int[] arr, int target, boolean leftmost) {
    int lo = 0;
    int hi = arr.length - 1;
    int idx = -1;
    while (lo <= hi) {
        int mid = (lo + hi) >>> 1; // avoid overflow. same as (lo + hi) / 2

        if (target > arr[mid]) {
            lo = mid + 1;
        } else if (target < arr[mid]) {
            hi = mid - 1;
        } else {
            idx = mid;
            if (leftmost) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
    }
    return idx;
}
}