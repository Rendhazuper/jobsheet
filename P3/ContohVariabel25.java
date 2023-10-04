public class ContohVariabel25 {
    
    public static void main(String[] args) {
        
        String Hobi = "Bermain petak umpet";
        boolean pandai  = true;
        char jeniskelamin = 'L';
        byte Umur = 18; 
        double ipk = 3.85, tinggi = 178;

        System.out.println(Hobi);
        System.out.println("Apakah pandai ?" + pandai);
        System.out.println("Umur saya sekarang adalah " + Umur);
        System.out.println(String.format("saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}
