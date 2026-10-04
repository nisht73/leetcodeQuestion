class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i = 1; i<=nums.length; i++) {
            map.put(i,0);
        }
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for(int i =1; i<= nums.length; i++ ){
            if(map.get(i) == 0){
                ans[1] = i;
            }
            if(map.get(i) == 2){
                ans[0] = i;
            }
        }
        return ans;
    }
}