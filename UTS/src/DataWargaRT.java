public class DataWargaRT {
    private WargaRT[] warga;
    public int nElemen;

    public DataWargaRT(int maxData) {
        warga = new WargaRT[maxData];
        nElemen = 0;
    }

    public void insertData(String kepalakeluarga, int jumlahanggota, String alamat, int nomerrumah) {
        if (checkDuplicateKepala(kepalakeluarga)) {// kalo duplicate
            System.out.println(kepalakeluarga + " Sudah terdaftar");
            System.out.println("Nama KK: " + kepalakeluarga + " anggota: " + jumlahanggota + " alamat: " + alamat
                    + " no: " + nomerrumah);
        } else {
            warga[nElemen] = new WargaRT(kepalakeluarga, jumlahanggota, alamat, nomerrumah);
            nElemen++;
        }
    }

    boolean checkDuplicateKepala(String kepalakeluarga) {
        for (int i = 0; i < nElemen; i++) {
            if (kepalakeluarga == warga[i].getKepalakeluarga()) {
                return true; // return true kalo ada duplicate
            }
        }
        return false; // false kalo tidak
    }

    // Disini sorting berdasarkan no rumah menggunakan InsertionSort algorithm
    public void InsertionSort() {
        int i, curIn;

        for (curIn = 1; curIn < nElemen; curIn++) {
            WargaRT temp = warga[curIn];
            i = curIn;
            while (i > 0 && warga[i - 1].getNomerrumah() >= temp.getNomerrumah()) {
                warga[i] = warga[i - 1];                
                i--;                
            }
            warga[i] = temp;          
        }
    }
    
    public int sizeData(){
        return nElemen;
    }

    //recursion menghitung seluruh warga RT
    public int jumlahKepalaDanAnggota(int n) {
        if (n - 1 < 0) {
            return 0;
        } else {
            return (warga[n - 1].getJumlahanggota() + 1) + jumlahKepalaDanAnggota(n - 1); // + 1 menghitung kk nya
        }
    }

    public void DisplayData() {
        System.out.println("Data Warga:");
        for (int i = 0; i < nElemen; i++) {
            System.out.print(i + 1 + ". ");
            warga[i].displayWarga();
        }
    }
}