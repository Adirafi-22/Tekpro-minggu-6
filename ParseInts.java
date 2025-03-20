import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0; // Inisialisasi variabel
        Scanner scan = new Scanner(System.in); // Scanner untuk membaca input dari user

        System.out.println("Enter a line of text:");
        String line = scan.nextLine(); // Membaca satu baris input dari user

        Scanner scanLine = new Scanner(line); // Scanner kedua untuk membaca kata per kata dalam baris

        while (scanLine.hasNext()) { // Loop selama masih ada token di dalam baris
            try {
                val = Integer.parseInt(scanLine.next()); // Mencoba mengubah token menjadi integer
                sum += val; // Jika berhasil, tambahkan ke total sum
            } catch (NumberFormatException e) {
                // Jika terjadi kesalahan karena bukan angka, lewati token tersebut
            }
        }

        // Menampilkan hasil jumlah angka yang berhasil diproses
        System.out.println("The sum of the integers on this line is: " + sum);

        // Menutup scanner untuk mencegah kebocoran sumber daya
        scan.close();
        scanLine.close();
    }
}