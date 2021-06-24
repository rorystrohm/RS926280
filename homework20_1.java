/*
Given a sorted linked list, delete all nodes that have duplicate
numbers, leaving only distinct numbers from the original list.In this 
program, you need to 
(1) read 5 numbers and set them in a linkedlist in order
(2) delete duplicate

Example 1:
input: 1,2,3,3,5
output: head-->1-->2-->3-->5-->null

Example 2:
input: 1,1,1,2,3
output: head-->1-->2-->3-->null

Please complete the following program to fullfil the function.
*/
public class homework20_1
{
   public static void main(String[] args)
   {
      LinkedList llist = new LinkedList();
      llist.head = new ListNode(1);
      llist.head.next = new ListNode(2);
      llist.head.next.next = new ListNode(3);
      llist.head.next.next.next = new ListNode(3);
      llist.head.next.next.next.next = new ListNode(5);
      System.out.println("input: 1,2,3,3,5");
      deleteDuplicates(llist);
      System.out.println("output: " + llist);
      llist = new LinkedList();
      llist.head = new ListNode(1);
      llist.head.next = new ListNode(1);
      llist.head.next.next = new ListNode(1);
      llist.head.next.next.next = new ListNode(2);
      llist.head.next.next.next.next = new ListNode(3);
      System.out.println("input: 1,1,1,2,3");
      deleteDuplicates(llist);
      System.out.println("output: " + llist);
   }
   public static void deleteDuplicates(LinkedList llist)
   {
      ListNode curr1 = llist.head;
      ListNode curr2;
      while(curr1 != null) {
         int value = curr1.value;
         curr2 = curr1;
         while(curr2.next != null) {
            if(curr2.next.value == value) {
               curr2.next = curr2.next.next;
            } else {
               curr2 = curr2.next;
            }
         }
         curr1 = curr1.next;
      }
   }
}

class ListNode
{
   int value;
   ListNode next;
   ListNode(int v){value = v;}
}

class LinkedList
{
   ListNode head;
   public String toString()
   {
      String nodeData = "";
      ListNode ref = head;
      while(ref != null)
      {
         nodeData += ref.value + "-->";
         ref = ref.next;
      }
      return "head-->"+nodeData+"null";
   }
}
