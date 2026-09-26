package linkedlists;

public class OccurrencesInDLL {
    public static DNode deleteAllOccurrences(DNode head, int target) {
        DNode temp = head;
        while (temp != null) {
            if (temp.data == target) {
                if (temp == head) {
                    head = temp.next;
                    if (head != null) head.prev = null;
                } else {
                    if (temp.prev != null) temp.prev.next = temp.next;
                    if (temp.next != null) temp.next.prev = temp.prev;
                }

            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        DNode head = new DNode(1);
        head.next = new DNode(2, head, null);
        head.next.next = new DNode(3, head.next, null);
        head.next.next.next = new DNode(1, head.next.next, null);
        head.next.next.next.next = new DNode(2, head.next.next.next, null);

        DNode ans = deleteAllOccurrences(head, 1);
        DNode temp = ans;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
