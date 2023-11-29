package P14.Rekursif;
import java.util.*;

public class PenjumlahanRekursif {
    static int jumlah(int awal, int n, int tot) {
        if (awal == n + 1) {
            System.out.print(" = " + tot);
            return (1);
        } else {
            System.out.print(awal);
            if (n >= awal + 1) {
                System.out.print(" + ");
            }
            return (jumlah(awal + 1, n, tot + awal));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int f;
        System.out.print("Masukkan angka: ");
        f = input.nextInt();
        jumlah(1, f, 0);


}
}
