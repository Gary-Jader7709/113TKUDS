package practice_0722;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }
}

public class Q6_PrintReverse {
    public static void printReverse(ListNode head) {
        if (head == null)
            return;
        printReverse(head.next);
        System.out.print(head.data + " ");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.print("反向列印：");
        printReverse(head); // 輸出：4 3 2 1
    }
}
