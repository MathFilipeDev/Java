package javaBasico.exercicios;

public class Concatenar {
    
    public static void main(String[] args) {
        
        char letra = 'E';
        String palavra = "STUDO";

        String mensagem = "A letra é " + "E a palavra é " + palavra;
        String completa = letra + palavra;

        System.out.println(mensagem);
        System.out.println("A palavra completa é " + completa);
    }
}
