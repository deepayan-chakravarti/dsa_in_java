package linkedlists;

public class OccurrencesInDLL {
    public static DNode deleteAllOccurrences(DNode head, int target) {
        if (head == null) return head;
        if (head.data == target) {
            head = head.next;
        }
        DNode temp = head;
        while (temp.next != null) {
            if (temp.data == target) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            temp = temp.next;
        }
        if (temp.data == target) {
            temp.prev.next = null;
        }
        return head;
    }

    public static void main(String[] args) {
        DNode head = new DNode(1);
        head.next = new DNode(2, null, head);
        head.next.next = new DNode(3, null, head.next);
        head.next.next.next = new DNode( 1, null, head.next.next);
        head.next.next.next.next = new DNode( 2, null, head.next.next);
        DNode ans = deleteAllOccurrences(head, 1);
        DNode temp = ans;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
