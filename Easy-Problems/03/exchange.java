class Solution{
    public int findRepeatNumber(int[] nums){
        for(int i=0;i<nums.length;i++){
            while(i!=nums[i]){
                if(nums[nums[i]]==nums[i]){
                    return nums[i];
                }
                int temp=nums[nums[i]];
                nums[nums[i]]=nums[i];
                nums[i]=temp;
            }
        }
        return -1;
    }
}