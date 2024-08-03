class Solution {
    // Function to find if there is a celebrity in the party or not.
   public int celebrity(int mat[][]) {
        List<Integer> possCelebs = new ArrayList<>();
        for(int i = 0; i < mat.length; i++) {
            boolean isPossCeleb = true;
            for(int j = 0; j < mat[i].length; j++) {
                if(i != j && mat[i][j] == 1) isPossCeleb = false;
            }
            if(isPossCeleb) possCelebs.add(i);
        }
        
        for(int i = 0; i < mat[0].length; i++) {
            boolean isPossCeleb = true;
            for(int j = 0; j < mat.length; j++) {
                if(i != j && mat[j][i] == 0) isPossCeleb = false;
            }
            if(!isPossCeleb) possCelebs.remove((Integer) i);
        }
        if(possCelebs.isEmpty()) return -1;
        return possCelebs.get(0);
    }


}
