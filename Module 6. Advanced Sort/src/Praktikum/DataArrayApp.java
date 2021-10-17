package Praktikum;

public class DataArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);
        arr.insert(16650250, "Rais", "Ambon");
        arr.insert(16650220, "Ismail", "Banyuwangi");
        arr.insert(16650280, "Arina", "Malang");
        arr.insert(16650240, "Dinda", "Bandung");
        arr.insert(16650270, "Agung", "Madiun");
        arr.insert(16650200, "Jundi", "Malang");
        arr.insert(16650210, "Ahmad", "Sidoarjo");
        arr.insert(16650260, "Helmi", "Madura");

        System.out.println("Sebelum Sorting : ");
        arr.displayArray();

        System.out.println("Merge Sort Sorting berdasarkan Nama :");
        arr.mergeSort();
        arr.displayArray();

        System.out.println("Shell Sort Sorting berdasarkan NIM :");
        arr.ShellSort();
        arr.displayArray();

        System.out.println("Quick Sort berdasarkan Nama");
        arr.QuickSort();
        arr.displayArray();
    }
}