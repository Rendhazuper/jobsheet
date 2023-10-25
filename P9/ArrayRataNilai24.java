package P9;

import java.util.Scanner;

public class ArrayRataNilai24 {
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
      
      double total = 0, totaltidak = 0;
      double rata2,rata2tidaklulus;
      int jumlah = 0, jumlahtidak = 0, jumlahmhs;
System.out.print("masukkan jumlah mahasiswa : ");
jumlahmhs = sc.nextInt();

int [] nilaiMhs= new int[jumlahmhs];
      for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i] = sc.nextInt();
        
      }for (int i = 0; i < nilaiMhs.length; i++) {
        
        if (nilaiMhs[i]  > 70) {
            total += nilaiMhs[i];
            jumlah++;
            
        }else if (nilaiMhs[i] < 70){
        totaltidak += nilaiMhs[i];
        }
        
      }rata2 = total/jumlah;
       System.out.println("Rata-rata nilai lulus = "+rata2);

       rata2tidaklulus = totaltidak/(nilaiMhs.length-jumlah);
       System.out.println("Rata-rata nilai tidak lulus ="+rata2tidaklulus);

       System.out.println("mahasiswa yang lulus ada "+jumlah);
        
      }
        
    }


    
