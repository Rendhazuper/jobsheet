
package P13;
import java.util.*;
public class UcapanTerimaKasih_24 {
     
    
    public static void main(String[] args) {
        UcapanterimaKasih();
        ucapantambahan("tambahan");
    }

public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
        
    }
    public static void UcapanterimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("thank you "+nama+" for being the best teacher in the world. \n" + "You inspired in me a love for learning and made me feel like i could ask you anything. ");
       
    }
    public static void ucapantambahan(String pesan) {
        System.out.println(pesan);
    }
}
