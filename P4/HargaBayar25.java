import java.util.*;
public class HargaBayar25 {
 
    public static void main(String[] args) {
        String mrkbuku;
        int harga,jumlah,hal_buku;
        double dis, total, bayar, jmlDis;
        Scanner key = new Scanner (System.in);

        System.out.print("masukkan merk buku yang anda beli :");
        mrkbuku = key.nextLine();
        System.out.print("Masukkan harga barang yang dibeli : ");
        harga = key.nextInt();
        System.out.print("Masukkan jumlah barang yang dibeli :");
        jumlah = key.nextInt();
        System.out.print("masukkan jumlah halaman buku yang anda beli :");
        hal_buku = key.nextInt();
        System.out.println("masukkan diskon : ");
        dis = key.nextDouble();

        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total-jmlDis; 



        System.out.println("===========================================");
        
        System.out.println("merk buku :"+mrkbuku);;
        System.out.println("Jumlah halaman buku : "+hal_buku);
         System.out.println("jumlah diskon : "+jmlDis);
        System.out.println("Total harga : "+bayar);
       
        
    }
}
