import java.util.NoSuchElementException;
import java.util.jar.Pack200;

/**
 * Created by Jeffrey on 2/3/16.
 */
public class LinkedList<E> {

    // data,
    // pointer- linkedList has it
    // next
    // head- first element
    // nodes - cell equivalent in linkedlist. pointer+data

    private static class Node<E> {
        // fields for Node
        public E data;
        public Node<E> next;

        // Node constructor
        public Node(E d, Node<E> n)
        {
            this.data = d;
            this.next = n;
        }
    }
    /*
    ===================================================================
    fields for LinkedList
    ===================================================================
     */
    private Node<E> head;
    private int count;
    private Node<E> tail;
    /*
    ======================================================================================================================================
    LinkedList constructor. Constructs an empty list

    Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
    ======================================================================================================================================
     */
    public LinkedList()
    {
        this.head = null;
        this.count = 0;
        this.tail = null;

    }

//    public LinkedList (Collection<? extends E> c){
//
//    }



    /*
    ======================================================================================================================================
    addToFront. Inserts the specifed element at the beginning of this list
    ======================================================================================================================================
     */
    public void addToFront (E e)
    {
        head = new Node<E>(e, head);
        count++;
    }


    public int size()
    {
        return count;
    }

    public E getFirst()
    {
        return head.data;
    }

    public void clear()
    {
        head = null;
        count = 0;
    }

    public void removeFirst() // if you delete first node, the whole linkedList will be destroyed
    {
        if (head == null){
            throw new NoSuchElementException();
        }
        if (head.next == null) {
            clear();
        } else {
            head = head.next;
            count--;
        }
    }

    public void removeElement(E e) // set equal to null
    {
        if (head != null){
            if (head.data.equals(e)){
                removeFirst();
                return;
            }
        } else {
            Node<E> currentNode = head;
            while(currentNode.next != null){
                if (currentNode.next.data.equals(e)){
                    currentNode.next = currentNode.next.next; // node and pointer stick together a--> c
                    count--;
                }
                currentNode = currentNode.next;
            }
        }

    }

    public void printList() {
        Node<E> currentNode = head;
        for (int i = 0; i < count; i++){ // before didn't have for loop
            if (head != null) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        }

    }


    public void addLast(E e) {
        Node<E> currentNode = head;
        if (head == null){ // if head is null
            head = new Node<E>(e,head);
        }

        else if (currentNode.next != null || head.next == null){
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = new Node<E>(e, currentNode.next);
        }
        count++;

    }
}

