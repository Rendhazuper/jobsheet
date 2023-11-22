package P13;

public class Percobaan524 {
    public static void tampil(String str, int... a) {
        System.out.println("String: " + str);
        System.out.println("Jumlah argumen/parameter: " +a.length);
        
        for (int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        tampil("Daspro 2019", 100,200);
        tampil("tekonologi informasi", 1,2,3,4,5);
        tampil("Polinema");
    }
}
