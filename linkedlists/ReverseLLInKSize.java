package linkedlists;

public class ReverseLLInKSize {
    public static Node reverseKGroup(Node head, int k) {
        Node temp = head;
        Node prevnode = head;
        while (temp != null) {
            Node kthnode = findKthNode(temp, k);
            if (kthnode == null) {
                prevnode.next = temp;
                break;
            }
            Node nextnode = kthnode.next;
            kthnode.next = null;
            reverse(temp);
            if (temp == head) {
                head = kthnode;
            } else {
                prevnode.next = kthnode;
            }
            prevnode = temp;
            temp = nextnode;
        }
        return head;
    }

    public static Node findKthNode(Node temp, int k) {
        k--;
        while (k > 0) {
            if (temp == null) return null;
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public static Node reverse (Node head) {
        Node temp = head;
        Node node = null;
        while (temp != null) {
            temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }
        return node;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Node ans = reverseKGroup(head, 2);
        while (ans != null) {
            System.out.println(ans.data);
            ans = ans.next;
        }
    }
}
