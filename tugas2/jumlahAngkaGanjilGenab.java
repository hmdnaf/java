public class jumlahAngkaGanjilGenab {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumOdd = 0;
        int sumEven = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        System.out.println("Jumlah semua angka ganjil: " + sumOdd);
        System.out.println("Jumlah semua angka genap: " + sumEven);
    }
}
