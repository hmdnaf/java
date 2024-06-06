public class piramid {
    public static void main(String[] args){

        // for(int i = 0; i < 5; i++){
        //     for(int j = 0; j < 5; j++){
        //         System.out.print("* ");
        //         if(i == j){
        //             break;
        //         }
        //     }
        //     System.out.print("\n");
        // }
        int tinggi = 5;
        for(int s = 1; s <= tinggi; s++){
            for(int k = tinggi; k > s; k--){
                System.out.print(" ");//ini adalah spasi
            }
            //bentuk piramidnya
            for(int h = 1; h <= (2 * s - 1); h++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
