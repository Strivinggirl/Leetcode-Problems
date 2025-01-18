/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node>otc=new HashMap<>();
        otc.put(null,null);

        Node curr=head;

        while(curr!=null){
        Node currCopy=new Node(curr.val);
            otc.put(curr, currCopy);
            curr=curr.next;
        }

      curr=head;
        while(curr!=null){
            otc.get(curr).next=otc.get(curr.next);
            otc.get(curr).random=otc.get(curr.random);
            curr=curr.next;
        }
        return otc.get(head);
    }
}