
class Solution {
    int rectanglesInCircle(int r) {
        // code here
        int track=0;
        for(int l=1; l<=2*r; l++){
            for(int w=1; w<=2*r; w++){
                if(l*l+w*w<=4*r*r){
                    track++;
                }
            }
        }
        return track;
    }
};
