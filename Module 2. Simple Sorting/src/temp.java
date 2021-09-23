public class temp {
    public static void main(String[] args) {
        int[] test = {3, 5, 1, 6, 2, 10, 9, 8, 7, 4};

        int batas, i;
        for (batas = 10 - 1; batas > 0; batas--) {
            System.out.println("batas " + test[batas]);
            for (i = 0; i < batas; i++) {
                System.out.println(test[i]);
            }
        }
        
    }
}
