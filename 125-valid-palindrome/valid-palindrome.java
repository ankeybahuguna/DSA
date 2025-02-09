class Solution {

    public boolean isPalindrome(String s) {
        String ans = s.replaceAll("[^a-zA-Z0-9]", "");
        String lower = ans.toLowerCase();
        char arr[] = lower.toCharArray();
        int i = 0;
        int j = arr.length -1;
        while (i <= j) {
            if(arr[i] == arr[j]) {
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
