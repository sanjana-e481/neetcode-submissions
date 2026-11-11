class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        boolean flag = false;
        for (int i=0; i<len; i++){
            for(int j=i+1; j>i && j<len; j++){
                if(nums[i]==nums[j]){
                    flag = true;
                }
            }
        }

        return flag;
    }
}