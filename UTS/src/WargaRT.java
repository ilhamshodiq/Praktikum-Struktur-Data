public class WargaRT {
    private String kepalakeluarga;
    private int jumlahanggota;
    private String alamat;
    private int nomerrumah;

    public WargaRT(String kepalakeluarga, int jumlahanggota, String alamat, int nomerrumah) {
        this.kepalakeluarga = kepalakeluarga;
        this.jumlahanggota = jumlahanggota;
        this.alamat = alamat;
        this.nomerrumah = nomerrumah;
    }

    public String getKepalakeluarga() {
        return kepalakeluarga;
    }

    public void setKepalakeluarga(String kepalakeluarga) {
        this.kepalakeluarga = kepalakeluarga;
    }

    public int getJumlahanggota() {
        return jumlahanggota;
    }

    public void setJumlahanggota(int jumlahanggota) {
        this.jumlahanggota = jumlahanggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNomerrumah() {
        return nomerrumah;
    }

    public void setNomerrumah(int nomerrumah) {
        this.nomerrumah = nomerrumah;
    }

    public void displayWarga(){
        System.out.print("Nama KK: "+ kepalakeluarga +", ");
        System.out.print("Anggota: "+ jumlahanggota + " orang, ");
        System.out.print("alamat: "+ alamat +" ");
        System.out.println("no: "+ nomerrumah);
    }
}