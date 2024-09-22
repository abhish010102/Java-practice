class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]);

            if(nums[index-1]<0)
                l.add(index);
            nums[index-1]*=-1;
        }

        return l;
    }
}