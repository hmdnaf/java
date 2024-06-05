public class angkaTerbesar {

    public static void main(String[] args) {
        int[] angka = {34, 7, 23, 32, 5, 62}; 

        // Pastikan array tidak kosong
        if (angka.length == 0) {
            System.out.println("Array kosong.");
            return;
        }

        // Inisialisasi nilai max dan min dengan elemen pertama array
        int max = angka[0];
        int min = angka[0];

        // Perulangan untuk mencari nilai max dan min
        for (int number : angka) {
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
