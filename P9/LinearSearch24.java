package P9;
import java.util.*;

public class LinearSearch24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayint ;
        int key ;
        int hasil = 0; 

        System.out.println("Masukkan jumlah elemen array : ");
        arrayint = sc.nextInt();
        int [] elemen = new int[arrayint];

        for (int i = 0; i < elemen.length; i++) {
            System.out.println("masukkan elemen array ke-"+(i+1)+ ": ");
            elemen[i] = sc.nextInt();

        }
        System.out.println("masukkan key yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < elemen.length; i++) {
            if(elemen[i] == key ){
                hasil = i+1;
                break; 
            }else{
                System.out.println("key tidak ditemukan");
            }
        }
        System.out.println("key ada dalam array pada posisi indeks ke-"+hasil);
    }
}
