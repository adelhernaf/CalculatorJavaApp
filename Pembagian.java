import java.util.Scanner;

public class KalkulatorPembagian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input bilangan dari pengguna
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();

        // Menghitung hasil pembagian
        double hasilPembagian = (double) bilangan1 / bilangan2;

        // Menampilkan hasil pembagian
        System.out.println("Hasil pembagian " + bilangan1 + " dan " + bilangan2 + " adalah " + hasilPembagian);
    }
}