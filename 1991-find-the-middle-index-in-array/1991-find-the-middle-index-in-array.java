class Solution {
    public int findMiddleIndex(int[] nums) {
        int total = 0 ;
        int leftsum = 0;

        for(int num : nums){
            total += num;
        }

        for(int i =0; i<nums.length; i++){
            int rightSum = total - leftsum - nums[i];

            if(leftsum == rightSum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;

    }
}