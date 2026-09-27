package linkedlists;

import java.util.*;

public class FindPairsWithGivenSum {
    public static List<List<Integer>> findPairsWithGivenSum1(DNode head, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        DNode temp = head;
        List<List<Integer>> ans = new ArrayList<>();
        while (temp != null) {
            if (map.containsKey(target - temp.data)) ans.add(Arrays.asList(target- temp.data, temp.data));
            map.put(temp.data, map.getOrDefault(temp.data, 0) + 1);
            temp = temp.next;
        }
        Collections.reverse(ans);
        return ans;
    }

    public static List<List<Integer>> findPairsWithGivenSum2(DNode head, int target) {
        DNode i = head;
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        DNode j = temp;
        List<List<Integer>> ans = new ArrayList<>();
        while (j != null && i != null && i != j && j.next != i) {
            if (i.data + j.data == target) {
                ans.add(Arrays.asList(i.data, j.data));
                i = i.next;
                j = j.prev;
            } else if (i.data + j.data > target) {
                j = j.prev;
            } else {
                i = i.next;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        DNode head = new DNode(1);
        head.next = new DNode(2, head, null);
        head.next.next = new DNode(4, head.next, null);
        head.next.next.next = new DNode(5, head.next.next, null);
        head.next.next.next.next = new DNode(6, head.next.next.next, null);
        head.next.next.next.next.next = new DNode(8, head.next.next.next, null);
        head.next.next.next.next.next.next = new DNode(9, head.next.next.next.next, null);
        List<List<Integer>> ans = findPairsWithGivenSum2(head, 17);
        for (List<Integer> list : ans) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}
