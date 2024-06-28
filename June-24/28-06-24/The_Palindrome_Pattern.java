class Solution {
    public String pattern(int[][] arr) {
        // Code here
        int m = arr.length;
        int n = arr[0].length;
        
        if(m == 1) return "0 R";
        
        int res = -1;
        // First checking all row
        for(int i = 0; i < m; i++){
            if(isPalindrome(arr[i], 0, n-1)){
                res = i;
                break;
            }
        }
        
        if(res >= 0) return res + " R";
    
        // Now checking all column
        for(int i = 0; i < n; i++){
            int[] temp = new int[m];
            int k = 0;
            for(int j = 0; j < m; j++){
                temp[k++] = arr[j][i];
            }
            
            if(isPalindrome(temp, 0, n-1)){
                res = i;
                break;
            }
        }
        
        
        return res >= 0 ? (res + " C") : "-1";
    }
    
    static boolean isPalindrome(int[] arr, int i, int n){
        while(i < n){
            if(arr[i] != arr[n]) return false;
            i++;
            n--;
        }
        
        return true;
    }
}
