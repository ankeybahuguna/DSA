class Solution {
    public int findPeakElement(int[] arr) {

        int n = arr.length;
        int low = 0, high = n-1;
        
        if(n == 1) return 0;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            
            if(mid > 0 && mid < n-1) {
                if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                    return mid;
                }

                else if (arr[mid] < arr[mid + 1]) {
                    low = mid + 1;
                }

                else {
                    high= mid - 1;
                }
            }

            else if ( mid == 0) {
                if(arr[mid] > arr[mid+1]) return mid;
                else return mid+1;
            }
            else if (mid == n-1) {
                if(arr[mid] > arr[mid-1]) return mid;
                else return mid-1;
            }
        }


        return -1;
    }
}