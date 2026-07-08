class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] rigth = new int[n];
        int pro = 1;

        for(int i=n-1;i>=0;i--){
            pro = pro*nums[i];
            rigth[i] = pro;
        }
        int[] ans = new int[n];
        int left =1 ;

        for(int i=0;i<n-1;i++){
            int val = left * rigth[i+1];
            ans[i] = val;
            left = left*nums[i];
        }
        ans[n-1] = left;
        return ans;
        
    }
}