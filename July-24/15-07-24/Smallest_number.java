class Solution {
 

public String smallestNumber(int s, int d) {
        // code here
        if(d*9 < s) return "-1";
        StringBuilder ans = new StringBuilder();
        
        while(d-- > 0) {
            int i= (ans.length() == 0) ? 1 : 0;
            
            if(d == 0) {
                ans.append(s);
                break;
            }
            
            while(d*9 < (s-i)) {
                i++;
            }
            
            ans.append(i);
            s -= i;
        }
        
        return ans.toString();
    }
}
