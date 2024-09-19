class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int index=nums[i];
            if(nums[Math.abs(index)-1]<0)
                return Math.abs(index);
            nums[Math.abs(index)-1]=-nums[Math.abs(index)-1];
        }

        return -1;
    }
}