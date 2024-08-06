import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int  numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int numberOfTries = 0;

        System.out.println("Tebak angka antara 1 sampai 100:");

        while (guess != numberToGuess) {
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Tebakan anda terlalu rendah, Coba lagi");
            } else if (guess > numberToGuess) {
                System.out.println("Tebakan anda terlalu tinggi, Coba lagi");
            }
        }

        System.out.print("Selamat anda menebak angka dengan benar setelah " + numberOfTries + " percobaan");
        scanner.close();



    }
}