class Solution {
    public int[] findErrorNums(int[] nums) {

        int n = nums.length;

        long sum = 0;

        // Actual sum
        for (int num : nums) {
            sum += num;
        }

        // Expected sum: 1 + 2 + ... + n
        long expectedSum = (long) n * (n + 1) / 2;

        // R - M
        long diff = sum - expectedSum;


        long squareSum = 0;

        // Actual square sum
        for (int num : nums) {
            squareSum += (long) num * num;
        }

        // Expected square sum:
        // 1² + 2² + ... + n²
        long expectedSquareSum =
                (long) n * (n + 1) * (2 * n + 1) / 6;

        // R² - M²
        long squareDiff = squareSum - expectedSquareSum;

        // R + M
        long sumRM = squareDiff / diff;

        // R = ((R - M) + (R + M)) / 2
        long repeated = (diff + sumRM) / 2;

        // M = (R + M) - R
        long missing = sumRM - repeated;

        return new int[]{(int) repeated, (int) missing};
    }
}