package sword;

/**
 * 反转链表
 * <p>
 * 输入一个链表，反转链表后，输出链表的所有元素.
 * 主要是指针的操作，但是要注意不能断链。这里可以使用非递归的方式求解。
 *
 * @Author: milo
 * @Create: 2017-02-10
 */
public class ReverseList {

    public static ListNode solution(ListNode head) {
        ListNode reserveddHead = null;
        ListNode pNode = head;
        ListNode pPrev = null;
        while (pNode != null) {
            ListNode pNext = pNode.next;
            if (pNext == null) {
                reserveddHead = pNode;
            }

            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        return reserveddHead;
    }
}
