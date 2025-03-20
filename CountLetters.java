import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26]; // Array untuk menyimpan jumlah kemunculan huruf

        Scanner scan = new Scanner(System.in);

        // Meminta input dari user
        System.out.print("Enter a word or phrase: ");
        String word = scan.nextLine();

        // Mengonversi input menjadi huruf besar
        word = word.toUpperCase();

        // Menghitung frekuensi tiap huruf dalam string
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++; // Bisa menyebabkan ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not a letter: " + word.charAt(i)); // Menampilkan karakter yang menyebabkan error
            }
        }

        // Menampilkan hasil perhitungan huruf
        System.out.println("\nLetter Frequencies:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}
