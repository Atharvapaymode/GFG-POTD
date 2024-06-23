
class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer>  al = new ArrayList<Integer> ();
        int count=1;
        
        for(char s:str.toCharArray())
        {
            if(s=='(')
            {
                stack.push(count);
                al.add(count);
                count++;
            }
            else if(s==')')
                al.add(stack.pop());
        }
        
        return al;
    }
};
