package javaBasico.exercicios;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais!");
        } else if (num1 > num2) {
            System.out.println("Os números são diferentes e o primeiro número é maior");
        } else {
            System.out.println("Os números são diferentes e o segundo número é maior");
        }
        sc.close();
    }
}
