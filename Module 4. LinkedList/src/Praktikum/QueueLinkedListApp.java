package Praktikum;

public class QueueLinkedListApp {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        queue.insert(1665100, "Ilham");
        queue.insert(1665200, "Mira");
        queue.display();
        System.out.println();
        queue.insert(1665300, "Ami");
        queue.insert(1665400, "Haya");
        queue.insert(1665500, "Yati");
        queue.display();
        System.out.println();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.display();
    }
}
