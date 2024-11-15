package javaBasico.exercicios;

public class Desconto {
    
    public static void main(String[] args) {
        
        double precoOriginal = 140;
        double percentualDesconto = 20;
        double descontoNoValor = (precoOriginal * percentualDesconto)/100;
        double precoNovo = precoOriginal - descontoNoValor;

        System.out.println("O valor com desconto é igual a R$ " + precoNovo);
    }
}
