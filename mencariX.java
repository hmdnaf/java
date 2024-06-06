import java.util.Scanner;

public class mencariX {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Contoh array
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Meminta pengguna memasukkan angka yang ingin dicari
        System.out.print("Masukkan angka yang ingin dicari: ");
        int x = scanner.nextInt();

        // Mencari angka dalam array
        int index = cariAngka(array, x);

        // Menampilkan hasil
        if (index != -1) {
            System.out.println("Angka " + x + " ditemukan pada indeks: " + index);
        } else {
            System.out.println("Angka " + x + " tidak ditemukan dalam array.");
        }

        scanner.close();
    }

    // Fungsi untuk mencari angka dalam array
    public static int cariAngka(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1; // Mengembalikan -1 jika angka tidak ditemukan
    }
}

