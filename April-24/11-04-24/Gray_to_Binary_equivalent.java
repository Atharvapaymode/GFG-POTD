class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        int binary =0;
        for(; n!=0; n>>=1){
            binary ^=n;
        }
        return binary;
    }
       
}
