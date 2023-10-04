package P6;
import java.util.*;
public class Pemilihan2Percobaan224 {
   

    public static void main(String[] args) {
    float sudut1, sudut2, sudut3, totalsudut;
    Scanner input24 = new Scanner (System.in);
    
        System.out.print("masukkan sudut 1 :  ");
        sudut1 = input24.nextFloat();  
        System.out.print("masukkan sudut 2 :  ");
        sudut2 = input24.nextFloat();  
        System.out.print("masukkan sudut 3 :  ");   
        sudut3 = input24.nextFloat();  

        totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
                
            }else if ((sudut1 == 70)||(sudut2 == 70) || (sudut3 == 70)){
                System.out.println("Segitiga tersebut adalah bukan segitiga sama kaki");
            } else if ((sudut1 == 60)||(sudut2 == 60) || (sudut3 == 60)){
                System.out.println("Segitiga tersebut adalah bukan segitiga sama sisi");
              }else
              System.out.println("segitiga sembarang");
            
            
        }else
        System.out.println("Bukan segitiga");
    }
    
}
