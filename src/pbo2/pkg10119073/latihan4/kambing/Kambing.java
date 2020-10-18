package pbo2.pkg10119073.latihan4.kambing;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk mendeklarasi dan
 * pengaksesan variabel lokal
 *
 */
public class Kambing {
    
    public void tambahKambing() {
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }

    
    public static void main(String[] args) {
       Kambing kambingJantan = new Kambing();
       kambingJantan.tambahKambing();
    }
    
}
