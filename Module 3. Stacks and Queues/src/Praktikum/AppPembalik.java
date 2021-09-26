package Praktikum;

import java.util.Scanner;

public class AppPembalik {
    public static void main(String[] args) {
        Pembalik pembalik;// variable object
        Scanner input = new Scanner(System.in);

        // a
        // String kata = "kasur";
        // pembalik = new Pembalik(kata);
        // System.out.println(">> Katanya...\n\t" + kata);
        // System.out.println(">> dibalik jadi...\n\t" + pembalik.getBalik());

        // b
        while (true) {
            System.out.print("Masukakan kata: ");
            String inputkata = input.nextLine();

            pembalik = new Pembalik(inputkata);

            System.out.println("Kebalikan: " + pembalik.getTerbalik());
        }
    }
}
