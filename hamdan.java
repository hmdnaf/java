public class hamdan {
    // Deklarasi konstanta warna untuk digunakan di terminal
    public static final String RESET = "\u001B[0m";
    public static final String HITAM  = "\u001B[30m";
    public static final String MERAH  = "\u001B[31m";
    public static final String HIJAU  = "\u001B[32m";
    public static final String KUNING = "\u001B[33m";
    public static final String BIRU   = "\u001B[34m";
    public static final String UNGU   = "\u001B[35m";
    public static final String PUTIH = "\u001B[37m";
    public static void main(String[] args) {

    int tinggi = 5; 
    int lebar = 40; 

     for (int baris = 1; baris <= tinggi; baris++) { // loop untuk Membentuk baris atas

        for (int merah = 1; merah <= 2 * baris - 1; merah++) {
            System.out.print(MERAH + "*" + RESET); // loop untuk Membuat/mencetak bintang merah
        }
        if (baris <= 3) {
            for (int hitam = 1; hitam <= lebar - (2 * baris - 1); hitam++) {
                System.out.print(HITAM + "*" + RESET); // loop untuk Mencetak bintang hitam/putih
            }
        } else {
            for (int putih = 1; putih <= lebar - (2 * baris - 1); putih++) {
                System.out.print(PUTIH + "*" + RESET);
            }
        }
        System.out.println(); // Baris baru
    }

    for (int baris = tinggi; baris >= 1; baris--) { //loop untuk Membuat baris bawah
        for (int merah = 1; merah <= 2 * baris - 1; merah++) {
            System.out.print(MERAH + "*" + RESET); // loop untuk mencetak bintang meraj pada bagian baris bawah
        }
        if (baris <= 3) {
            for (int hijau = 1; hijau <=lebar - (2 * baris - 1); hijau++) {
                System.out.print(HIJAU + "*" + RESET); // loop untuk Mencetak bintang hijau/putih pada garis bawah
            }
        } else {
            for (int putih = 1; putih <= lebar - (2 * baris - 1); putih++) {
                System.out.print(PUTIH + "*" + RESET);
            }
        }

        System.out.println(); // Baris baru
 }
}
}