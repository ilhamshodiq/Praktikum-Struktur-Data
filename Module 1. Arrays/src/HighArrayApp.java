public class HighArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

        // arr.insert(70);
        // arr.insert(80);
        // arr.insert(75);
        // arr.insert(55);
        // arr.insert(85);
        // arr.insert(25);
        // arr.insert(30);
        // arr.insert(00);
        // arr.insert(90);
        // arr.insert(40);
        // arr.insert(60);
        arr.insert(79);
        arr.insert(53);
        arr.insert(30);
        arr.insert(77);
        arr.insert(45);
        arr.insert(15);
        arr.insert(81);
        arr.insert(53);
    

        arr.display();

        int key = 30;
        if (arr.find(key)) {
            System.out.println(key + " ditemukan");
        } else {
            System.out.println(key + " tidak ditemukan");
        }

        // arr.delete(00);
        // arr.delete(80);
        // arr.delete(55);

        arr.display();
        System.out.println("Jumlah Elemen : " + arr.size());
        

    }
}