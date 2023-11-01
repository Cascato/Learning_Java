package curso_java;

import java.util.Scanner;

public class ex17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            int impar = i += 1;
            System.out.println(impar);

        }
        sc.close();
    }
}
