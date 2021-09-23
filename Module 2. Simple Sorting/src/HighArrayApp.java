public class HighArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
        arr.insert(30);
        arr.insert(00);
        arr.insert(90);
        arr.insert(40);
     
        
        System.out.println("Sebelum di Urutkan : ");
        arr.display();
        // System.out.println("Bubble sort : ");
        // arr.BubbleSort();
        // System.out.println("Selection sort : ");
        // arr.SelectionSort();
        System.out.println("Insertion sort :");
        arr.InsertionSort();

        System.out.println("Setelah di Urutkan : ");
        arr.display();

        
    }
}