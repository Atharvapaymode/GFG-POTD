class Solution {

    public boolean isValid(String str) {
        int l=str.length()-1;
       String s="";
       for(int i=0;i<=l;i++)
        s+=".";
        if((str.contains(s)))
            return false;
        s="";
       int n=0;
       int count=0;
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)!='.')
                s+=str.charAt(i);
            else
            {
                count++;
                n=Integer.parseInt(s);
                if (s.length() > 1 && s.charAt(0) == '0') {
                     return false;
            }
                if (i + 1 < str.length() && str.charAt(i + 1) == '.') {
                    return false;
                }
                if(n>255||n<0)
                    return false;
                if(str.charAt(i+1)=='.')
                    return false;
                s="";
            }
       }
                n=Integer.parseInt(s);
                if (s.length() > 1 && s.charAt(0) == '0') 
                     return false;
                if(n>255||n<0)
                    return false;
       
       
       return count+1==4;
    }
}
