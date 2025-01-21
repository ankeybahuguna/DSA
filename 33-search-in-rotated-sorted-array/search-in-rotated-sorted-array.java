class Solution {
    public int search(int[] arr, int target) {

        int pivot = 0;
        for(int i = 0; i<arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                pivot = i;
                break;
            }
        }
        
        int left = 0;
        int right = pivot;
 
        while(left <= right) {
            int mid = left + (right -left) /2;
            if(arr[mid] == target) return mid;
            if ( arr[mid] <= target ) left = mid+1;
            else right = mid-1;
        }

        left = pivot + 1;
        right = arr.length - 1;

        while(left <= right) {
            int mid = left + (right -left) /2;
            if(arr[mid] == target) return mid;
            if ( arr[mid] <= target ) left = mid+1;
            else right = mid-1;
        }


        return -1;

    }
}