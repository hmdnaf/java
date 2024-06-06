public class bubbleSort { // deklarasi class bubbleSort
    public static void main(String[] args){ // titik masuknya program
        int[] data = {5,2,4,1,7,6,9,3,8}; // deklarasi dan inisialisasi array data yang akan di urutkan

        for (int i = 0; i < data.length; i++){ // loop luar untuk proses pengurutan
            for (int j = 0; j < data.length-1; j++){ //loop dalam untuk proses pengurutan
                boolean isiUrutanSesuai = data[j] < data[j+1]; //  Jika data[j] kurang dari data[j + 1], maka isiUrutanSesuai akan bernilai true, artinya elemen-elemen tersebut sudah dalam urutan yang benar untuk pengurutan menurun.
                if (!isiUrutanSesuai){ // menukar element jika urutan tidak sesuai
                    int baru = data[j];
                    data[j] = data [j+1];
                    data[j+1] = baru;
                }
            }
        }
        for (int i = 0; i < data.length; i++){ // mencetak hasil array yang telah di urutkan
            System.out.println(data[i]);
        }
    }
}
