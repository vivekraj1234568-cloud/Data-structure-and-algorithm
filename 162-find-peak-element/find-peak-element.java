class Solution {
    public int findPeakElement(int[] nums) {
         int n= nums.length;
          int index=0;
           int max= Integer.MIN_VALUE;
           for(int i=0; i<n; i++){
            if(nums[i]> max){
                max= nums[i];
                 index=i;

            } 

           }
            return index;
        
    }
}