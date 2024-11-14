package javaBasico.tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {

    /** ESTABELECENDO AS VARIÁVEIS:
     * 
     *  String nome = "Matheus";
     *  float nota = 8.5f;
     *  System.out.printf("A nota de %s é: %.2f \n", nome, nota);
     */

    //  SOLICITANDO A ENTRADA DE DADOS:

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String name = teclado.nextLine();
        System.out.print("Digite o valor da nota: ");
        float grade = teclado.nextFloat();
        System.out.printf("A nota de %s é: %.1f \n", name, grade);

        teclado.close();
    }

    

}
