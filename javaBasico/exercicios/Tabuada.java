package javaBasico.exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor que você quer conferir a Tabuada: ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int tabuada = number * i;
            System.out.println(number + " x " + i + " = " + tabuada);
        }

        sc.close();
        
    }
}
