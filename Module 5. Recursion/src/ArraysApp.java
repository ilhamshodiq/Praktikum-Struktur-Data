public class ArraysApp {
    public static void main(String[] args) {
        Arrays arr = new Arrays(10);

        arr.insert(4);
        arr.insert(2);
        arr.insert(9);
        arr.insert(3);
        arr.insert(5);
        arr.insert(6);
        arr.insert(10);
        arr.insert(8);
        arr.insert(1);
        arr.insert(7);

        System.out.println("Sebelum diurutkan : ");
        arr.display();
        System.out.println("Sesudah diurutkan : ");
        arr.mergeSort();
        arr.display();

    }
}
