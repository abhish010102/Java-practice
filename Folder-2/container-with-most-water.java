class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int m=0;

        while(l<r){
            if(m<(Math.min(height[l],height[r])*(r-l)))
                m=Math.min(height[l],height[r])*(r-l);

            if(height[l]<height[r])
                l++;
            else
                r--;
        }

        return m;
    }
}