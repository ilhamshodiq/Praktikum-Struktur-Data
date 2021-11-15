package Praktikum;

public class Heap {
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int size) {
        maxSize = size;
        currentSize = 0;
        heapArray = new Node[size];
    }

    public void insertAt(int index, int value) {
        Node newNode = new Node(value);
        heapArray[index] = newNode;
        currentSize++;
    }

    public Node remove() {
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }

    public void trickleDown(int index) {
        int largerChild;
        Node top = heapArray[index];
        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            if (rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()) {
                largerChild = rightChild;
            } else {
                largerChild = leftChild;
            }
            if (top.getKey() >= heapArray[largerChild].getKey()) {
                break;
            }
            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = top;
    }

    public void displayHeap() {
        System.out.println("Heap Array: ");
        for (int i = 0; i < currentSize; i++) {
            if (heapArray[i] != null) {
                System.out.print(heapArray[i].getKey() + " ");
            } else {
                System.out.println("--");
            }
        }
        System.out.println("");
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0;
        String dots = ".......................................";
        System.out.println(dots + dots);
        while (currentSize > 0) {
            if (column == 0) {
                for (int k = 0; k < nBlanks; k++) {
                    System.out.print(' ');
                }
            }
            System.out.print(heapArray[j].getKey());
            if (++j == currentSize) {
                break;
            }
            if (++column == itemsPerRow) {
                nBlanks /= 2;
                itemsPerRow *= 2;
                column = 0;
                System.out.println();
            } else {
                for (int k = 0; k < nBlanks * 2 - 2; k++) {
                    System.out.print(' ');
                }
            }
        }
        System.out.println("\n" + dots + dots);
    }

    public void displayArray() {
        for (int j = 0; j < maxSize; j++) {
            System.out.print(heapArray[j].getKey() + " ");
        }
        System.out.println("");
    }

    public void HeapSort() {
        int N = currentSize;
        for (int i = N / 2 - 1; i >= 0; i--) {
            trickleDown(i);
        }
        // One by one extract an element from heap
        for (int j = N - 1; j >= 0; j--) {
            Node temp = remove();
            heapArray[j] = temp;
        }
    }
}