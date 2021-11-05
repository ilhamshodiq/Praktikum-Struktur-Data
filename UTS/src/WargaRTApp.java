public class WargaRTApp {
    public static void main(String[] args) {        
        DataWargaRT datawarga = new DataWargaRT(1000);

        datawarga.insertData("Ali", 4, "JL. D Belayan", 12);
        datawarga.insertData("Ahmad", 2, "JL. D Belayan", 9);
        datawarga.insertData("Abdurrohman", 3, "JL. D Belayan", 7);
        datawarga.insertData("Burhan", 4, "JL. D Belayan", 6);
        datawarga.insertData("Bachtiar", 5, "JL. D Belayan", 10);
        datawarga.insertData("Sofyan", 1, "JL. D Belayan", 11);
        datawarga.DisplayData();
        System.out.println();
        System.out.println("--Tambah nama yang sudah ada--");
        datawarga.insertData("Ali", 4, "JL. D Belayan", 13);
        datawarga.DisplayData();
        System.out.println();
        System.out.println("--Tambah--");
        datawarga.insertData("Choirul", 6, "JL. D Sentani", 13);
        datawarga.insertData("Sujatmoko", 3, "JL. D Sentani", 15);
        datawarga.insertData("Galuh", 2, "JL. D Sentani", 14);
        datawarga.insertData("Hari", 4, "JL. D Sentani", 8);
        datawarga.DisplayData();
        System.out.println();
        System.out.println("--pengurutan--");
        datawarga.InsertionSort();
        datawarga.DisplayData();
        System.out.println();
        System.out.println("Jumlah warga RT 04 adalah : "+ datawarga.jumlahKepalaDanAnggota(datawarga.sizeData()));
    }
}
