package javaBasico.exercicios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para calcular a área do quadrado e digite 2 para calcular a área do circulo");
        int area = sc.nextInt();
        if (area == 1) {
            System.out.println("Digite o valor em metros do lado do quadrado");
            double lado = sc.nextDouble();
            double areaq = lado * lado;
            System.out.println("A área do quadrado é igual a " + areaq + " metros ao quadrado");
        }else if (area ==2) {
            System.out.println("Digite o valor em metros do raio do circulo");
            double raio = sc.nextDouble();
            double areac = raio * raio * 3.14;
            System.out.println("A área do circulo é igual a " + areac + " metros ao quadrado");
        }else {
            System.out.println("Erro, Reinicie e Digite 1 ou 2.");
        }

        sc.close();
        
    }
}
