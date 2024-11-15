package javaBasico.exercicios;

public class Dolares {
    
    public static void main(String[] args) {
        
        double valorEmDolares = 5;
        double taxaDeConversao = 4.94;
        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.printf("O valor da conversão é igual a %.2f\n", valorEmReais);
    }
}
