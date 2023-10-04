import java.util.*;
public class booking {
    
    public static void main(String[] args) {
        //input 
        String nama_pemesan,tipe; 
        double harga,waktu_menginap,nomor_kamar;
        double total_harga;
        Scanner input = new Scanner(System.in);


        //proses sederhana
        System.out.print("masukkan nama pemesan: ");
        nama_pemesan= input.nextLine();
        System.out.println("tipe kamar yang dipesan: ");
        tipe= input.nextLine();
        System.out.println("nomor kamar : ");
        nomor_kamar = input.nextDouble();
         System.out.println("harga kamar: ");
        harga = input.nextDouble();
        System.out.println("lama menginap : ");
        waktu_menginap= input.nextDouble();

        total_harga = harga * waktu_menginap;
        //output
        System.out.println("==========================");
        System.out.println("Nota Hotel");
        System.out.println("==========================");

        System.out.println("nama pemesan : " +nama_pemesan);
        System.out.println("tipe kamar yang dipesan : " +tipe);
        System.out.println("nomor kamar : " +nomor_kamar);
        System.out.println("lama menginap : " +waktu_menginap+ " Hari");
        System.out.println("Total yang harus dibayar : "+total_harga);



    }
}
