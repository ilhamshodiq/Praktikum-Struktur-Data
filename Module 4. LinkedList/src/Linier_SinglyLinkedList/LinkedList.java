package Linier_SinglyLinkedList;

public class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int Data) {
        Link newLink = new Link(Data);
        newLink.next = first;
        first = newLink;
    }

    //preliminary no 5
    public void insertLast(int Data) {
           /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
           Link newLink = new Link(Data);

           /* 4. This new node is going to be the last node, so
                 make next of it as null */
           newLink.next = null;
   
           /* 5. Else traverse till the last node */
           Link last = first;
           while (last.next != null)
               last = last.next;
   
           /* 6. Change the next of last node */
           last.next = newLink;      
    } 

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }
    
    //preliminary no 6
    public Link deleteLast() {
        Link temp = first;
        while (temp.next.next != null)//nyarik node terakhir kedua
            temp = temp.next;

        temp.next = null;// hapus node terakhir

        return temp;
    }

    public Link find(int key) {
        Link current = first;
        while (current.Data != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.Data != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    public void displayList() {
        System.out.println("List(first-->last):");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

}
