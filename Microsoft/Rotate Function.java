class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum1 = Integer.MIN_VALUE;
        
        
        for(int i=0; i<nums.length; i++){
            int a[] = rotate(nums);
            int sum2 = 0;
            for(int j=0; j<a.length; j++){
                sum2  = sum2 + j*a[j];
            }
            if(sum1 < sum2){
                sum1 = sum2;
            }

        }
        return sum1;
        
    }
    public int[] rotate(int[] nums){
        int temp = nums[nums.length-1];
        for(int i=nums.length-1; i>0; i--){
            nums[i]= nums[i-1];
        }
        nums[0] = temp;
        return nums;
    }
}
