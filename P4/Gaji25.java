
import java.util.*;
public class Gaji25 {
    
    public static void main(String[] args) {
        int jmlMasuk,JmlTdkMasuk,TotGaji;
        int gaji, potgaji;
        float coba =  2F;

        Scanner i = new Scanner(System.in);
        
        System.out.println("Masukkan Jumlah hari masuk kerja anda");
        jmlMasuk = i.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk kerja anda : ");
        JmlTdkMasuk = i.nextInt();
        System.out.println("Masukkan gaji : ");
        gaji=i.nextInt();
        System.out.println("masukkan potongan gaji : ");
        potgaji=i.nextInt();

        TotGaji = (jmlMasuk*gaji) - (JmlTdkMasuk*potgaji);
        
        System.out.println(TotGaji);


    }
}
