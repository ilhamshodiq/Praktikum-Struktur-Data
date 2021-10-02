package Praktikum;

public class QueueLink {
    private int nim;
    private String mahasiswa;
    public QueueLink next;

    public QueueLink(int nim, String mahasiswa) {
        this.nim = nim;
        this.mahasiswa = mahasiswa;
    }

    public void displayQueueLink() {
        System.out.println(nim + " " + mahasiswa);
    }

}
