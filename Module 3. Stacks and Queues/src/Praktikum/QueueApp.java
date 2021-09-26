package Praktikum;

public class QueueApp {
    public static void main(String[] args) {
        Queue antrian = new Queue(4);

        System.out.println(">> Beberapa mulai mengantri");
        antrian.insert("Andi");
        antrian.insert("Ahmad");
        antrian.insert("Satrio");
        antrian.insert("Afrizal");
        antrian.insert("Sukran");
        antrian.insert("Mahmud");

        System.out.println();
        System.out.println(">>isi antrian");
        antrian.display();

        System.out.println();
        System.out.println(">> satu persatu keluar antrian");
        System.out.println();
        while (!antrian.isEmpty()) {
            System.out.println(antrian.peekFront() + " keluar dari antrian");
            antrian.remove();
            antrian.display();
            System.out.println();
        }
        if (antrian.isEmpty()) {
            System.out.println("antrian kosong");
            System.out.println(antrian.size() + " Person");
        }
    }
}
