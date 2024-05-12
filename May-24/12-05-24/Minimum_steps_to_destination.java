class Solution {
    static int minSteps(int d) {
        // code 
        int sum=0, diff=0,steps=0;
        while(sum<d || sum>=d && diff%2!=0){
            sum+= ++steps;
            diff=sum-d;
        }
        return steps;
    }
}
