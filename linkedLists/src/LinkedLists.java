import java.util.NoSuchElementException;

public class LinkedLists {

    //? this is the node class containing value and the pointer fields only
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }


    //? from here we have linked list class using these nodes
    private Node first; //! head */
    private Node last; //! tail */
    private int size;

    //? add last node
    public void addLast(int item) {
        var node = new Node(item); //! instance and passing value to that node */

        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }
    //? add first node

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }


    //! to check first is null
    private boolean isEmpty() {
        return first == null;
    }

    //! index of the element in linked list
    public int indexOf(int item) {
        int index = 0;
        var current = first; //? starting from first
        while (current != null) { // checking current
            if (current.value == item) return index;  // checking value in current node
            current = current.next; // which will be the next node and when it reaches last the next has no node
            index++; // increment to keep track of the index
        }
        return -1; // else of the condition
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
        //! reusing the previous made function -1 is false and other value is true

//        var current = first;
//        while (current != null) {
//            if (current.value == item) return true;
//            current = current.next;
//        }
//        return false;
    }

    //! Removing the first item
    public void removeFirst() {
        if (isEmpty()) // if there is no element
            throw new NoSuchElementException();

        if (first == last) { // if only one item is present
            first = last = null;
            size = 0;
            return;
        }
        //[10 -> 20 -> 30 ]
        var second = first.next; // we store what is in first pointer in the second to keep track when we remove link
        first.next = null; //removing link [10  20 -> 30]
        first = second; // updating first with second item [20 -> 30]

        size--;
    }

    //! Removing Last Item of the linked List

    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            size = 0;
            return;
        }
        //[10 -> 20 -> 30]
        //previous -> 20
        //last ->30  we need to last ->20 and break last's link with 30
        var previous = getPrevious(last); //getting second last
        last = previous; // assigning new to last
        last.next = null; // breaking with 30
        size--;
    }

    //? get previous node
    private Node getPrevious(Node node) {
        var current = first; //starting point to traverse
        while (current != null) {
            if (current.next == node) return current; // to get node before last
            current = current.next;
        }
        return null;
    }

    //! Size Of
    public int size() {
        return size; // because adds when we add and decreases we remove
        //! now with this complexity is o(1)
        //! if we traverse the complexity is o(n)
    }

    //! converts LL to the array
    public int[] toArray() {
        //? created an array to store the linked list of size of LL
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    //! reverses the LL
    public void reverse() {
//        [10->20->30->40]
        // >pre cur nex
        // n = c.next
        // c.next = p
        if (isEmpty()) return;

        var previous = first;
        var current = first.next;


        while (current != null) {
            var next = current.next; //now next will hold 30
            current.next = previous;// now will point to 10
            previous = current;//to move the cursor from 10 to 20
            current = next;// to move the next from 30 to 40
        }
        last = first;// to make last into first
        last.next = null;// because it should be null
        first = previous; // to change direction of first and last because at last previous will be pointing to the end element

    }

    //? get kth element from the end

    public int getKthFromTheEnd(int k) {
        if (isEmpty()) throw new IllegalMonitorStateException();
        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;

            if (b == null) throw new IllegalMonitorStateException();
        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
}
