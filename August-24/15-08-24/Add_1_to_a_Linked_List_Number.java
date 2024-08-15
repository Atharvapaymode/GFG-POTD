class Solution {
       public Node addOne(Node head) {
        // code here.
        if(head.next == null){   // step 1
            head.data+= 1;  // Add 1 to the last node
            return head;
        }
        Node sum = addOne(head.next);   // step 2
        head.data+= (sum.data/10);   // step 3
        sum.data = sum.data%10;   // step 4
        return head;   // step 5
    }
}
