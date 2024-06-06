public class piramidKebalik {
    public static void main(String[] args) {
        int tinggi = 5;
        for(int s = tinggi; s >= 1; s--){
            //buat spasi
            for(int k = tinggi; k > s; k--){
                System.out.print(" ");
            }
            //cetak 
            for(int h = 1; h <= (2 * s -1); h++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
