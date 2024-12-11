import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("*".repeat(30));

        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo + "\n");
        System.out.println("*".repeat(30));

        String menu = """
        \nDigite sua opção \n 
        1 - Consultar saldo
        2 - Transferir valor
        3 - Receber valor
        4 - Sair
        
        """;

        Scanner sc = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = sc.nextInt();
            
            if (opcao==1){
                System.out.println("\nO saldo atualizado é " + saldo);
            } else if (opcao==2){
                System.out.println("\nQual o valor que deseja transferir:  \n");
                double valor = sc.nextDouble();
                if (valor > saldo) {
                    System.out.println("\nNão há saldo para realizar a transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo+ "\n");
                }
            } else if (opcao==3){
                System.out.println("\nQual o valor recebido: \n");
                double valor = sc.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo + "\n");
            } else if (opcao != 4) {
                System.out.println("\nOpção Inválida");
            }
        }
    }
}
