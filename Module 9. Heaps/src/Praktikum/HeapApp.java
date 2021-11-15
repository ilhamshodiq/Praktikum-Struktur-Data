package Praktikum;

public class HeapApp {
    public static void main(String[] args) {
        int maxSize = 5;
        Heap testheap = new Heap(maxSize);

        for (int i = 0; i < maxSize; i++) {
            int value = (int) (Math.random() * 100);
            testheap.insertAt(i, value);
        }

        testheap.displayHeap();

        testheap.HeapSort();
        System.out.println("Array setelah urut: ");
        testheap.displayArray();       

    }
}
