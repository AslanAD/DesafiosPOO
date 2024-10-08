package CardapioRu_nao_acabado;

import java.util.Scanner;

public class CardapioSemanal {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Alimento alimento = new Alimento();
        Refeicao refeicao = new Refeicao();
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nBem-vindo à Máquina de Estacionamento!");
            System.out.println("1. Emitir Ticket");
            System.out.println("2. Receber Pagamento");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:


                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);

        entrada.close();
    }
    }
}
