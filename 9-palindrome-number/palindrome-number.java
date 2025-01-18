class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        int originalN = x;
        int reversedN = 0;

        while (originalN != 0) {
            int lastN = originalN % 10;
            reversedN = reversedN * 10 + lastN;
            originalN /= 10;
        }
        return x == reversedN;
    }
}