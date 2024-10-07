package Estacionamento;

import java.util.Random;

public class Ticket {
    // Atributos
    private int numeroTicket;
    private float valorRecebido;
    private float valor;
    private boolean pagamento;

    //metodos
    public void gerarTicket() {
        Random aleatorio = new Random();
        this.numeroTicket = aleatorio.nextInt(1000);
        this.pagamento = false;
        this.valorRecebido = 0.00f;
    }

    public void verificarPagamento() {
        if (this.valorRecebido - this.valor == 0) {
            this.pagamento = true;
            System.out.println("O valor foi pago e não possui troco");
        } else if (this.valorRecebido - this.valor > 0) {
            this.pagamento = true;
            System.out.println("O valor foi pago e possui troco de R$" + (this.valorRecebido - this.valor));
        } else {
            this.pagamento = false;
            System.out.println("Valor ainda não foi pago");
        }
    }

    // Getters e setters
    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public boolean isPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }

    public float getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(float valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}

