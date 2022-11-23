package Assignment_10;

public class Sliterator {

    Node addAtLast(Node currentHead, int newData)
    {
        Node node = new Node();
        node.data = newData;
        node.next = null;
        if (currentHead == null){
            return node;
        }
        else{
            Node temp = currentHead;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            return currentHead;
        }
    }

    Node removeFromLast(Node head)
    {
        if (head == null || head.next == null) return null;
        // Find the second last node
        Node secondLastNode = head;
        while (secondLastNode.next.next != null)
            secondLastNode = secondLastNode.next;

        // Change next of second last
        secondLastNode.next = null;

        return head;
    }

    public void displayList(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
