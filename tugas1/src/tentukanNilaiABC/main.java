package tentukanNilaiABC;

//Tentukan bilangan terbesar dari a, b, c

public class main {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 150;
        int c = 200;

        int cari = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Bilangan terbesar dari a, b, c adalah: " + cari);
    }
}
    
    
