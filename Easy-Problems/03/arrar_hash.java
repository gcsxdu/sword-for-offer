class Solution{
    public int findRepeatNumber(int[] nums){
        int[] hashTable = new int[nums.length];
        Arrays.fill(hashTable, 0);
        for(int i=0;i<nums.length;i++){
            if(hashTable[nums[i]]>0){
                return nums[i];
            }
            else{
                hashTable[nums[i]]++;
            }
        }
        return -1;
    }
}