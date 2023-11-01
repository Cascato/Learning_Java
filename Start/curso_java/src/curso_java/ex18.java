package curso_java;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int a = 0;
        int b = 0;

        for (int i = 0; i < x; i++) {
            x = sc.nextInt();
            
            if (x >= 10 && x <= 20) {
                a += 1;
            } else {
                b += 1;
            }

        }
        System.out.println(a + " In");
        System.out.println(b + " Out");

        sc.close();
    }
}
