package Praktikum;

public class StackLinkedList {
    private StackLink top;

    StackLinkedList() {
        top = null; 
    }

    public void push(int id, String namabarang) {
        StackLink newStack = new StackLink(id, namabarang);
        newStack.next = top;
        top = newStack;
    }

    public void pop() {
        top = top.next;
    }

    public void display() {
        System.out.println("Stack (top --> bottom) :");
        StackLink currentstack = top;

        while (currentstack != null) {
            currentstack.displayStackLink();
            currentstack = currentstack.next;
        }
    }
}
