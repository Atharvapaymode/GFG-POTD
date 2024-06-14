class Solution {
    static String armstrongNumber(int n) {
       int sum=0;
       int temp=n;
       while(n>0){
           int a = n%10;
           sum+=Math.pow(a,3);
           n/=10;
       }
       
       if (sum==temp){
           return "true";
       }
       else
       return "false";
    }
}
