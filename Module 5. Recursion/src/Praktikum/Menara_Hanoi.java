package Praktikum;

public class Menara_Hanoi {
    static int i = 1;

    public static void main(String[] args) {
        // doMenara(3, 'A', 'B', 'C');
        // doMenara(5, 'A', 'B', 'C');
        int jumlahcakram = 4;
        doMenara(jumlahcakram, 'A', 'B', 'C');
    }

    public static void doMenara(int cakram, char tiangawal, char tiangbantu, char tiangfinish) {
        if (cakram == 1) {
            System.out.println((i++) + "\tPindahkan cakram 1 dari tiang " + tiangawal + " ke tiang " + tiangfinish);
            return;
        } else {
            doMenara(cakram - 1, tiangawal, tiangfinish, tiangbantu);
            System.out.println((i++) + "\tpindahkan cakram " + cakram + " dari tiang " + tiangawal + " ke tiang " + tiangfinish);
            doMenara(cakram - 1, tiangbantu, tiangawal, tiangfinish);
        }
    }

}
