package Estacionamento;

public class Estacionamento {
    //atributos
    private float saldo;
    private static final float VALOR_TICKET = 6.00f;  // botar um valor fixo

    // metodo construtor
    public Estacionamento() {
        this.saldo = 0.0f;
    }

    //metodos especiais
    public void adicionarAoSaldo(float valor) {
        this.saldo += valor;
    }

    public float consultarSaldo() {
        return this.saldo;
    }

    public void registrarPagamentoTicket(Ticket ticket) {
        if (ticket.isPagamento()) {
            adicionarAoSaldo(VALOR_TICKET);
            System.out.println("Pagamento registrado. Saldo atualizado.");
        } else {
            System.out.println("Ticket ainda não foi pago.");
        }
    }

    // Getters e Setters
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}


