    import java.util.*;
    public class DoWhileCuti24 {
        
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            int jatahCuti, jumlahHari, kesempatan = 3;
            String konfirmasi;

            System.out.print("Jatah cuti: ");
            jatahCuti = sc.nextInt();

            do {
                if (jatahCuti > 0) {
                  System.out.println("apakah anda ingin mengambil cuti (y/t)? ");
                konfirmasi = sc.next();
                if (konfirmasi.equalsIgnoreCase("y")) {
                    System.out.print("Jumlah hari: ");
                    jumlahHari = sc.nextInt();
                    if (jumlahHari <= jatahCuti) {
                        jatahCuti -= jumlahHari;
                        System.out.println("Sisa jatah cuti: "+ jatahCuti); 
                    } else if (jumlahHari > jatahCuti) {
                        kesempatan--;
                        System.out.println("silahkan isikan sesuai jatah cuti");
                        continue;
                        
                        
                    }
                    }else if (konfirmasi.equalsIgnoreCase("t")){
                        break;
                    }
                } else {
                    break;
                }
                
            } while (kesempatan  > 0);
        }
    }
