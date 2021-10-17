public class AdvancedSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        AdvancedSort arr;
        arr = new AdvancedSort(maxSize);

        // arr.insert(70);
        // arr.insert(80);
        // arr.insert(75);
        // arr.insert(55);
        // arr.insert(85);
        // arr.insert(25);
        // arr.insert(30);
        // arr.insert(00);    

        // System.out.println("Sebelum di Urutkan : ");
        // arr.display();   

        // System.out.println("Shell Sort : ");
        // arr.ShellSort();
        // arr.display();

        //no 4
        arr.insert(60);
        arr.insert(5);
        arr.insert(15);
        arr.insert(45);
        arr.insert(35);
        arr.insert(20);
        arr.insert(25);
        arr.insert(10);
        arr.insert(50);
        arr.insert(30);

        System.out.println("Quick Sort : ");
        arr.QuickSort();
        arr.display();
    }
}
