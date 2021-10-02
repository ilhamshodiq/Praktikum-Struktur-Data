package Praktikum;

public class StackLink {
    private int id;
    private String namabarang;
    public StackLink next;

    public StackLink(int id, String namabarang) {
        this.id = id;
        this.namabarang = namabarang;
    }

    public void displayStackLink() {
        System.out.println("{"+id+","+namabarang+"}");
    }

}
