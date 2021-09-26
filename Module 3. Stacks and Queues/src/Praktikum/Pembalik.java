package Praktikum;

public class Pembalik {
    private Stack theStack;
    private String terbalik = "";

    Pembalik(String inputKarakter) {
        theStack = new Stack(100);
        // Push String input ke char
        for (int i = 0; i < inputKarakter.length(); i++) {
            theStack.push(inputKarakter.charAt(i));
        }
        // pop taruk di var balik
        while (!theStack.isEmpty()) {
            terbalik += theStack.pop();
        }
    }

    public String getTerbalik() {
        return terbalik;
    }

    public void setTerbalik(String terbalik) {
        this.terbalik = terbalik;
    }
}
