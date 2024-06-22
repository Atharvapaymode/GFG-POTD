class Solution {
    long ExtractNumber(String sentence) {
        // code here
        String[] srr=sentence.split(" "); 
        boolean numeric=true;
        long max=-1;
        for(String str:srr){
            try{
                long number=Long.parseLong(str);
                if(!str.contains("9")){
                    max=Math.max(number,max);
                }
            }catch(NumberFormatException nfe){
                numeric=false;
            }
        }
        return max;
    }
}
