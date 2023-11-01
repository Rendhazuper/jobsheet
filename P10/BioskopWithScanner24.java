import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("-----------------------------");
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu: ");

            int menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    nama = sc.nextLine();

                    System.out.print("Masukkan Baris: ");
                    baris = sc.nextInt();

                    System.out.print("Masukkan Kolom: ");
                    kolom = sc.nextInt();

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Maaf, kursi sudah terisi");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        sc.nextLine(); 
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (String[] barisPenonton : penonton) {
                        for (String namaPenonton : barisPenonton) {
                            if (namaPenonton == null) {
                                System.out.print("****\t");
                            } else {
                                System.out.print(namaPenonton+"\t");
                            }

                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Anda keluar dari program");
                    return;

                default:
                    System.out.println("unvalid");
            }

        }
    }
}
