class Solution {
    public boolean check(int[] nums) {
        int ans=0;
        if(nums[0]<nums[nums.length-1]){
            ans++;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                ans++;;
            }
           if(ans>1){
            return false;
           }
        }
    return true;    
    }
}