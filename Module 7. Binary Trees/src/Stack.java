public class Stack {
    private int maxSize;    
    private Node top;

    public Stack() {
        top = null;        
    }

    public void push(Node item) {
        Node oldtop = top;
        top = new Node();
        top.item = item;
        top.next = oldtop;
        maxSize++;
    }

    public Node pop() {
        Node item = top.item;       
        top = top.next;  
        return item;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public int size() {
        return maxSize;
    }

}