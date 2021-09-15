public class HighArray {

    private int[] arr;
    private int nElemen;

    public HighArray(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        // looping untuk mencari posisi index yang sesuai
        int cariindex = 0;
        while (cariindex < nElemen && value >= arr[cariindex]) {
            cariindex++;
        }
        // looping untuk menggeser value
        for (int i = nElemen; i > cariindex; i--) {
            arr[i] = arr[i - 1];
        }
        // mengisi value input dengan posisi index yang sesuai
        arr[cariindex] = value;
        nElemen++;// nElemen bertambah
        
        // arr[nElemen] = value;
        // nElemen++;
    }

    public boolean find(int key) {
        // int i;
        // for (i = 0; i < nElemen; i++) {
        // if (arr[i] == key) {
        // break;
        // }
        // }
        // if (i == nElemen) {
        // return false;
        // } else {
        // return true;
        // }
        int batasBawah = 0;
        int batasAtas = nElemen - 1;

        while (batasBawah <= batasAtas) {
            int curIn = (batasBawah + batasAtas) / 2;
            if (key < arr[curIn]) {
                batasAtas = curIn - 1;
            } else if (key > arr[curIn]) {
                batasBawah = curIn + 1;
            } else if (key == arr[curIn]) {
                return true;
            }
        }
        return false;
    }

    public boolean delete(int value) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (value == arr[i]) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            for (int j = i; j < nElemen; j++) {
                arr[j] = arr[j + 1];
            }
            nElemen--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public int size() {
        return nElemen;
    }
}