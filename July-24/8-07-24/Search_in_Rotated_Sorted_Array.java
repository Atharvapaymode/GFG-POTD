class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        for(int i=0;i<=arr.length-1;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
