import java.util.Scanner;
public class Lingkaran25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double phi = 3.14;
        double keliling,luas;

        System.out.println("Masukkan Jari-jari lingkaran : ");
        r = input.nextInt();

        keliling = 2*phi*r;
        luas = phi*r*r;

        System.out.println(keliling);
        System.out.println(luas);
    }
}