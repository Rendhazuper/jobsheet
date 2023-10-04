import java.util.*;
public class Bank25 {
    public static void main(String[] args) {
        int jml_tabungan_awal, lama_menabung;
        double jml_tabungan_akhir, bunga;
        double presentase_bunga = 0.02;

        Scanner key = new Scanner(System.in);

        System.out.println("masukkan jumlah tabungan awal anda");
        jml_tabungan_awal = key.nextInt();
        System.out.println("masukkan lama menabung anda");
        lama_menabung = key.nextInt();

        bunga = lama_menabung*presentase_bunga*jml_tabungan_awal;

        jml_tabungan_akhir= bunga+jml_tabungan_awal;

        System.out.println("jumlah tabungan akhir anda adalah "+ jml_tabungan_akhir);
    }
}
