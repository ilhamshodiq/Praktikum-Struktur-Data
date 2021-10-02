package Linier_SinglyLinkedList;

public class Link {
    public int Data;
    public Link next;

    public Link(int Data) {
        this.Data = Data;        
    }

    public void displayLink() {
        System.out.print(Data + " ");
    }

}
