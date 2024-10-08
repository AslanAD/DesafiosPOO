package Estacionamento;

import java.util.Scanner;

public class MaquinaDeEstacionamento {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        Ticket ticket = new Ticket();
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
                    // Gera um ticket
                    ticket.gerarTicket();
                    // Define o valor do ticket
                    ticket.setValor(6.00f);
                    System.out.println("Ticket gerado: Número " + ticket.getNumeroTicket() + ", Valor: R$" + ticket.getValor());
                    break;

                case 2:
                    System.out.print("Digite o valor recebido: R$");
                    float valorRecebido = entrada.nextFloat();
                    // define o valor recebido
                    ticket.setValorRecebido(valorRecebido);
                    // verifica se o pagamento foi realizado
                    ticket.verificarPagamento();
                    // registra o pagamento
                    estacionamento.registrarPagamentoTicket(ticket);
                    break;

                case 3:
                    // consulta saldo
                    System.out.println("Saldo atual: R$" + estacionamento.consultarSaldo());
                    break;

                case 4:
                    //encerra o programa
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);

        entrada.close();
    }
}
