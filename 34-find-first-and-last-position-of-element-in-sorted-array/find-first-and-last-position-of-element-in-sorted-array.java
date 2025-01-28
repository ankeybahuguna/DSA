class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int first = -1, last = -1;

        // Finding the first occurrence
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                if (arr[mid] == target) first = mid; 
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }

        low = 0; high = n - 1;

        // Finding the last occurrence
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                if (arr[mid] == target) last = mid; 
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }

        int ans[] = new int[2];
        ans[0] = first;
        ans[1] = last;

        return ans;

    }
}