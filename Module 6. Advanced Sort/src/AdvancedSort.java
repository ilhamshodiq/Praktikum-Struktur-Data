public class AdvancedSort {

    private int[] arr;
    private int nElemen;

    public AdvancedSort(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public void ShellSort() {
        int in, out;
        int temp;
        // int h = nElemen / 2;
        int h = 1;
        h = 3 * h + 1;

        while (h > 0) {
            for (out = h; out < nElemen; out++) {
                temp = arr[out];
                in = out;
                while (in > h - 1 && arr[in - h] >= temp) {
                    arr[in] = arr[in - h];
                    in -= h;
                }
                arr[in] = temp;
                display();
            }
            // h /= 2;
            h = (h-1)/3;
        }
    }

    public void QuickSort() {
        recQuickSort(0, nElemen - 1);
    }

    public void recQuickSort(int batasKiri, int batasKanan) {
        if (batasKanan - batasKiri <= 0) {
            return;
        } else {
            int pivot = arr[batasKanan];
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            recQuickSort(batasKiri, partisi - 1);
            recQuickSort(partisi + 1, batasKanan);
        }
    }

    public int partitionIt(int batasKiri, int batasKanan, int pivot) {
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan + 1;
        while (true) {
            while (indexKiri < batasKanan && arr[++indexKiri] < pivot)
                ;
            while (indexKanan > batasKiri && arr[--indexKanan] > pivot)
                ;
            if (indexKiri >= indexKanan) {
                break;
            } else {
                swap(indexKiri, indexKanan);
                display();//
            }
        }
        return indexKiri;
    }

    public void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public int size() {
        return nElemen;
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}