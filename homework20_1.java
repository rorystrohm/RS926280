public class homework20_1
{
   public static void main(String[] args)
   {
       //creating a linked list
       LinkedList llist = new LinkedList();
       llist.head = new ListNode(1);
       llist.head.next = new ListNode(2);
       llist.head.next.next = new ListNode(7);
       llist.head.next.next.next = new ListNode(7);
       llist.head.next.next.next.next = new ListNode(8);

       System.out.println("input: " + llist); //printing initial list
       deleteDuplicates(llist); //calling deleteDuplicates method
       System.out.println("output: " + llist); // printing llist

       //creating a new Linked list
       llist = new LinkedList();
       llist.head = new ListNode(3);
       llist.head.next = new ListNode(3);
       llist.head.next.next = new ListNode(1);
       llist.head.next.next.next = new ListNode(2);
       llist.head.next.next.next.next = new ListNode(3);

       System.out.println("\ninput: " + llist); //printing initial list
       deleteDuplicates(llist); //calling deleteDuplicates method
       System.out.println("output: " + llist); // printing llist
   }

   public static void deleteDuplicates(LinkedList llist)
   {
       //two temporary ListNode references
       ListNode curr1 = llist.head; //initialized to head of llist
       ListNode curr2;
       while(curr1 != null){ //runs until end of list is reached
           int value = curr1.value; //storing value of first ListNode reference variable
           curr2 = curr1; //second ListNode referencing first reference
           while(curr2.next != null) //runs until Second references the second Node from the last
           {
               //if any duplicate found
               if(curr2.next.value == value)
                   //removing node with duplicated value
                   curr2.next = curr2.next.next;
               else // updating Second reference to next node of it
                   curr2 = curr2.next;
           }
           // updating First reference to next node of it
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