import java.util.Scanner; 
public class PemilihanPercobaan125 {
    
    public static void main(String[] args) {
        
        Scanner input25 = new Scanner (System.in);
        String hasil;

        System.out.println("Masukkan angka : ");
        int angka = input25.nextInt();

        hasil = (angka %2 == 0) ?  "Bilangan Genap" : "Bilangan negatif";
        System.out.println(angka + " adalah " + hasil);
    }
}
