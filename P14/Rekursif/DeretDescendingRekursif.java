package P14.Rekursif;
import java.util.*;

/**
 * DeretDescendingRekursif
 */
public class DeretDescendingRekursif {

    static int descending (int n){
        if (n == 0){
            return(0);

        }else{
            System.out.print(n + " - ");
            return(descending( n- 1));
        }

    }

static  void iteratif(int n){
for (int i = n ; i >= 0; i--) {
            System.out.print(i + " - ");
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int bilangan;

        System.out.print("masukkan bilangan yang ingin di descend :");
        bilangan = sc.nextInt();
        System.out.print(descending(bilangan));
        System.out.println();
        iteratif(bilangan);
        
    }
}