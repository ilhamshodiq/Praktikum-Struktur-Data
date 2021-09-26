package Praktikum;

public class Queue {
    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
    }

    public void insert(String value) {
        if (isFull()) {
            System.out.println("Maaf " + value + ", antrian sudah penuh");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queArray[++rear] = value;
            nItems++;
            System.out.println(value + " masuk antrian");
        }
    }

    public String remove() {
        String temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = "Kosong";
        nItems--;
        return temp;
    }

    public String peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

    public void display() {
        int temp = front;
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[front++] + ",");
            if (front == maxSize) {
                front = 0;
            }
        }
        System.out.println();
        front = temp;
    }
}
// public void displayArray() {
//     for (int i = 0; i < queArray.length; i++) {
//         System.out.print(queArray[i] + " ");
//     }
//     System.out.println();
// }
