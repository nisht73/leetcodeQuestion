class Solution {

    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public int partition_algo(int[] nums, int L , int R){
        int P = nums[L];
        int i = L+1; //0
        int j = R; //0

        while(i<=j) {
            if(nums[i] < P && nums[j] > P) {
                swap(nums,i,j);
                i++;
                j--;
            }
            if(nums[i] >= P){
                i++;
            }
            if(nums[j] <= P){
                j--;
            }

        }
        swap(nums,L,j);//P is at jth index
        return j;
    }
    public int findKthLargest(int[] nums, int k) {
         int n = nums.length;
         int L = 0;
         int R = n-1;
        
         int pivot_indx = 0;

         while(true) {
            pivot_indx = partition_algo( nums,  L , R);

            if(pivot_indx == k-1){
                break;
            } else if(pivot_indx > k-1){
                R = pivot_indx -1;
            } else if(pivot_indx < k-1) {
                L = pivot_indx + 1;
            }

         }
         return nums[pivot_indx];

    }
}