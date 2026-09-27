class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int j = 0; j < nums.length; j++){
            int needed = target - nums[j];

            if(map.containsKey(needed)){
                return new int[]{map.get(needed), j};
            }

            map.put(nums[j], j);
        }

        return new int[]{};
    }
}