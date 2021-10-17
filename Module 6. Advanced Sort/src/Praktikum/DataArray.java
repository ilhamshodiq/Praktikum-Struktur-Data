package Praktikum;

public class DataArray {
    private Mahasiswa[] mhs;
    private int nElemen;

    public DataArray(int max) {
        mhs = new Mahasiswa[max];
        nElemen = 0;
    }

    public void insert(long nim, String nama, String asal) {
        mhs[nElemen] = new Mahasiswa(nim, nama, asal);
        nElemen++;
    }

    public boolean delete(long searchNim) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (mhs[i].getNim() == searchNim) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            for (int j = i; j < nElemen; j++) {
                mhs[j] = mhs[j + 1];
            }
            nElemen--;
            return true;
        }
    }

    // ===Merge Sort by Name===
    public void mergeSort() {
        Mahasiswa[] workSpace = new Mahasiswa[nElemen];
        recMergeSort(workSpace, 0, nElemen - 1);
    }

    public void recMergeSort(Mahasiswa[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid + 1, upperBound);
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    public void merge(Mahasiswa[] workSpace, int lowIndex, int highIndex, int upperBound) {
        int j = 0;
        int lowerBound = lowIndex;
        int mid = highIndex - 1;
        int nItem = upperBound - lowerBound + 1;

        while (lowIndex <= mid && highIndex <= upperBound) {
            if (mhs[lowIndex].getNama().compareTo(mhs[highIndex].getNama()) < 0) {
                workSpace[j++] = mhs[lowIndex++];
            } else {
                workSpace[j++] = mhs[highIndex++];
            }
        }

        while (lowIndex <= mid) {
            workSpace[j++] = mhs[lowIndex++];
        }

        while (highIndex <= upperBound) {
            workSpace[j++] = mhs[highIndex++];
        }

        for (j = 0; j < nItem; j++) {
            mhs[lowerBound + j] = workSpace[j];
        }
    }

    // ===Shell Sort by NIM===

    public void ShellSort() {
        int in, out;
        Mahasiswa temp;
        int h = nElemen / 2;

        while (h > 0) {
            for (out = h; out < nElemen; out++) {
                temp = mhs[out];
                in = out;
                while (in > h - 1 && mhs[in - h].getNim() >= temp.getNim()) {
                    mhs[in] = mhs[in - h];
                    in -= h;
                }
                mhs[in] = temp;
            }
            h /= 2;
        }
    }

    // === Quick Sort by NAME===
    public void QuickSort() {
        recQuickSort(0, nElemen - 1);
    }

    public void recQuickSort(int batasKiri, int batasKanan) {
        if (batasKanan - batasKiri <= 0) {
            return;
        } else {
            Mahasiswa pivot = mhs[batasKanan];
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            recQuickSort(batasKiri, partisi - 1);
            recQuickSort(partisi + 1, batasKanan);
        }
    }

    public int partitionIt(int batasKiri, int batasKanan, Mahasiswa pivot) {
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan + 1;
        while (true) {
            while (indexKiri < batasKanan && mhs[++indexKiri].getNama().compareTo(pivot.getNama()) < 0)
                ;
            while (indexKanan > batasKiri && mhs[--indexKanan].getNama().compareTo(pivot.getNama()) > 0)
                ;
            if (indexKiri >= indexKanan) {
                break;
            } else {
                swap(indexKiri, indexKanan);                
            }
        }           
        return indexKiri;
    }

    public void swap(int one, int two) {
        Mahasiswa temp;
        temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }

    public void displayArray() {
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
    }
}
