class Solution {
    public int[] twoRepeated(int arr[], int n) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2]; 
        int index = 0;
        for (int i = 0; i < n + 2; i++) {
            if (!set.add(arr[i])) {
                result[index++] = arr[i]; 
                if (index == 2) {
                    break; 
                }
            }
        }
        return result;
    }
}
