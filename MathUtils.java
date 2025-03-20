public class MathUtils {
    public static int factorial(int n) {
        // Memeriksa apakah angka negatif
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        // Memeriksa apakah angka lebih dari 16 untuk mencegah overflow
        if (n > 16) {
            throw new IllegalArgumentException("Factorial is too large to be calculated with int (max 16).");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
