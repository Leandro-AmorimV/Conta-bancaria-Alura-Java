import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        String nome;
        double saldo;
        int opcao;

        System.out.println("Digite seu nome");
        nome = digite.nextLine();
        System.out.println("Digite seu saldo inicial");
        saldo = digite.nextDouble();


        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: Corrente");
        System.out.println("Saldo: " + saldo);
        System.out.println("***********************");
        System.out.println();
        System.out.println("Operações");
        System.out.println();
        System.out.println("1- Consultar saldo");
        System.out.println("2- Receber valor");
        System.out.println("3- Trasferir valor");
        System.out.println("4- sair");
        System.out.println();
        System.out.println("Digite o número da operação desejada");
        opcao = digite.nextInt();

        while(opcao != 4) {

            if (opcao <= 0 || opcao >= 5) {
                System.out.println("Por favor tente novamente");
                System.out.println("");
                System.out.println("***********************");
                System.out.println("Dados iniciais do cliente: ");
                System.out.println("");
                System.out.println("Nome :" + nome);
                System.out.println("Tipo de conta: Corrente");
                System.out.println("Saldo: " + saldo);
                System.out.println("***********************");
                System.out.println("");
                System.out.println("Operações");
                System.out.println("");
                System.out.println("1- Consultar saldo");
                System.out.println("2- Receber valor");
                System.out.println("3- Trasferir valor");
                System.out.println("4- sair");
                System.out.println();
                System.out.println("Digite o número da operação desejada");
                opcao = digite.nextInt();
            } else {
                if (opcao == 1) {

                    System.out.println("Seu saldo é de: " + saldo);

                    System.out.println("");
                    System.out.println("Operações");
                    System.out.println("");
                    System.out.println("1- Consultar saldo");
                    System.out.println("2- Receber valor");
                    System.out.println("3- Trasferir valor");
                    System.out.println("4- sair");
                    System.out.println();
                    System.out.println("Digite o número da operação desejada");
                    opcao = digite.nextInt();

                } else {
                    if (opcao == 2) {
                        System.out.println("Digite o valor que você deseja receber: ");
                        saldo += digite.nextDouble();

                        System.out.println("");
                        System.out.println("Operações");
                        System.out.println("");
                        System.out.println("1- Consultar saldo");
                        System.out.println("2- Receber valor");
                        System.out.println("3- Trasferir valor");
                        System.out.println("4- sair");
                        System.out.println();
                        System.out.println("Digite o número da operação desejada");
                        opcao = digite.nextInt();

                    } else {
                        if (opcao == 3) {
                            System.out.println("Digite o valor que você deseja trasnferir");
                            saldo -= digite.nextDouble();

                            System.out.println("");
                            System.out.println("Operações");
                            System.out.println("");
                            System.out.println("1- Consultar saldo");
                            System.out.println("2- Receber valor");
                            System.out.println("3- Trasferir valor");
                            System.out.println("4- sair");
                            System.out.println();
                            System.out.println("Digite o número da operação desejada");
                            opcao = digite.nextInt();
                        } else {
                            System.out.println("Obrigado por usar nosso sistema!");
                            System.out.println("Saindo...");
                        }
                    }
                }



            }
        }

    }
}
