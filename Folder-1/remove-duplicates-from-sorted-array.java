class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=1;

        while(i<nums.length){
            if(nums[i]!=nums[i-1]){   
                if(i!=j)
                    nums[j++]=nums[i];
                else
                    j++;
            }
            i++;
        }

        return j;
    }
}