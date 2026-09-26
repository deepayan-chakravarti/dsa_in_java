package linkedlists;

import java.util.HashMap;

public class RemoveDuplicates {
    public DNode removeDuplicatesBrute(DNode head) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        DNode temp = head;
        while (temp != null) {
            map.put(temp.data, map.getOrDefault(temp.data, 0) + 1);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (map.get(temp.data) > 1) {
                if (temp == head) {
                    head = temp.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    if (temp.prev != null) {
                        temp.prev.next = temp.next;
                    }
                    if (temp.next != null) {
                        temp.next.prev = temp.prev;
                    }
                }
            }
            map.put(temp.data, map.get(temp.data) - 1);
            temp = temp.next;
        }
        return head;
    }

    public DNode removeDuplicatesOptimal(DNode head) {
        DNode temp = head;
        while (temp.next != null) {
            if (temp.next.data == temp.data) {
                if (temp == head) {
                    head = temp.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    if (temp.prev != null) {
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                    }
                }
            }
            temp = temp.next;
        }
        return head;
    }
}
