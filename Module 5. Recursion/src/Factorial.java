public class Factorial {

    public static int factorialIterate(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;// dikalikan angka i--
        }
        return result;

    }

    public static int factorialRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;// factorial dari 0 atau satu. yaa satu
        } else {
            return n * factorialRecursion(n - 1);// dikalikan angka n-1
        }
    }

    public static void main(String[] args) {
        System.out.println("Menggunakan Iterasi : " + factorialIterate(5));
        System.out.println("Menggunakan Recursion : " + factorialRecursion(5));
    }
}
