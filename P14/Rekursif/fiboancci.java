package P14.Rekursif;

import java.util.Scanner;

public class fiboancci {
    public class Fibonacci {
    static int fibonacci(int n) {
        if (n <= 1) {
            return (n);
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bulan;
        System.out.print("bulan ke: ");
        bulan = input.nextInt();
        System.out.println("Jumlah pasangan marmut pada  bulan ke-" + bulan + " : " + fibonacci(bulan));
        
    }
}
}
