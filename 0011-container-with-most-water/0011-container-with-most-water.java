class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxContainer= 0;
        while(left<right){
            int length = Math.min(height[left],height[right]);
            int width = right - left;
            int containerVolume = length * width;
            
            maxContainer = Math.max(maxContainer,containerVolume);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxContainer;
    }
}