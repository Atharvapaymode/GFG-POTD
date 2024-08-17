class Solution {
    public static long[] productExceptSelf(int nums[]) {
        int len = nums.length;
        
        long[] productArray = new long[len];
        
        for(int i=0;i<len;i++){
            long curProduct = 1;
            for(int j=0;j<len;j++){
                if(i != j){
                    curProduct *= nums[j];
                }
            }
            productArray[i] = curProduct;
        }
        
        return productArray;
        
        
    }
}
