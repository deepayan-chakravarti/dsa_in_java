package linkedlists;

public class Sort0s1s2s {
    public static Node sortList(Node head) {
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
                temp = temp.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
                temp = temp.next;
            } else {
                two.next = temp;
                two = two.next;
                temp = temp.next;
            }
        }
        zero.next = oneHead.next;
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(2);
        head.next.next.next = new Node(0);
        head.next.next.next.next = new Node(1);
        Node node = sortList(head);
        Node curr = node;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
    }
}
