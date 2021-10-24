public class Node {
    public int id;
    public String data;
    public Node leftChild;
    public Node rightChild;

    //buat stack
    public Node next;
    public Node item;

    public void displayNode() {
        System.out.print("{ " + id + ", " + data + " } ");
    }
}
