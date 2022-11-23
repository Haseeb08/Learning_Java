package Assignment_10;

public class Slist {

    public static void main(String args[]){
        Sliterator iter=new Sliterator();

        Node head = null;
        head = iter.addAtLast(head, 1);
        head = iter.addAtLast(head, 2);
        head = iter.addAtLast(head, 3);
        head = iter.addAtLast(head, 4);
        head = iter.addAtLast(head, 5);

        iter.displayList(head);
        iter.removeFromLast(head);
        System.out.println("Removed last data");
        iter.displayList(head);

    }
}
