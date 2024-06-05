public class FindMaxMi {

    public static void main(String[] args) {
        int[] numbers = {34, 7, 23, 32, 5, 62}; // Contoh array

        // Pastikan array tidak kosong
        if (numbers.length == 0) {
            System.out.println("Array kosong.");
            return;
        }

        // Inisialisasi nilai max dan min dengan elemen pertama array
        int max = numbers[0];
        int min = numbers[0];

        // Perulangan untuk mencari nilai max dan min
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Angka terbesar dalam array: " + max);
        System.out.println("Angka terkecil dalam array: " + min);
    }
}
