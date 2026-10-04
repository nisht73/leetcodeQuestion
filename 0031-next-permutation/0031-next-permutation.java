class Solution {
    public void nextPermutation(int[] nums) {

        int pivot = -1;

        // 1. Find the pivot
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If no pivot, reverse entire array
        if (pivot == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // 2. Find the rightmost element greater than pivot
        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // 3. Reverse from pivot + 1 to end
        reverse(nums, pivot + 1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}