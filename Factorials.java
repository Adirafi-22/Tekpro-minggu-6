import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);

        while (keepGoing.equalsIgnoreCase("y")) {
            try {
                System.out.print("Enter an integer: ");
                int val = scan.nextInt();

                // Memanggil metode factorial dan menangani kemungkinan error
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                // Menampilkan pesan error dari pengecualian yang dilempar
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                // Menangani jika input bukan angka
                System.out.println("Invalid input. Please enter an integer.");
                scan.next(); // Membersihkan input yang tidak valid
            }

            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }

        scan.close();
    }
}
