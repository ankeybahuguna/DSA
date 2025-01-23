class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i =  0;
        int j = numbers.length - 1;

        while (i < j ) {
            int currentSum = numbers[i] + numbers[j];
            if (currentSum == target) {
                return new int[] {i+1, j+1};
            }
            else if (currentSum < target) {
                i++;
            }
            else {
                j--;
            }
        }
        throw new IllegalArgumentException("There was not a solution");
    }
}