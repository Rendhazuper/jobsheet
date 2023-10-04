package P6;
import java.util.*;
public class Pemilihan2Percobaan124 {

    public static void main(String[] args) {
        int tahun;
        Scanner input24 = new Scanner (System.in);

        System.out.println("masukkan tahun");
        tahun = input24.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 400) == 0){
                System.out.println("tahun kabisat");
            }else
            System.out.println("bukan tahun kabisat");
            
        }else if ((tahun % 100) != 0){
                System.out.println("tahun kabisat");
        }else {
            System.out.println("bukan tahun kabisat");
        }


    }
}
