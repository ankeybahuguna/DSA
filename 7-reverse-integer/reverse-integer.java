class Solution {
    public int reverse(int x) {
        int reversedN = 0;

        while(x != 0 ) {
            int digit = x % 10;
            if (reversedN > Integer.MAX_VALUE / 10 || (reversedN == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;  
            }
            if (reversedN < Integer.MIN_VALUE / 10 || (reversedN == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;  
            }
            reversedN = reversedN * 10 + digit;
            x /= 10;
        }
        return reversedN;
    }
}