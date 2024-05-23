import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan dalam array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai x yang ingin dicari: ");
        int x = input.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Angka " + x + " ditemukan pada index ke-" + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Angka " + x + " tidak ditemukan dalam array.");
        }
    }
}
