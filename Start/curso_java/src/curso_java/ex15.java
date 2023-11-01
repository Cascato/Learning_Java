package curso_java;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor para o eixo X: ");
        double x = sc.nextDouble();

        System.out.print("Digite o valor para o eixo Y: ");
        double y = sc.nextDouble();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("1º Quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("2º Quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("3º Quadrante");
            } else {
                System.out.println("4º Quadrante");
            }
            x = sc.nextDouble();
            y = sc.nextDouble();

        }
        System.out.println("done");
        sc.close();

    }
};
