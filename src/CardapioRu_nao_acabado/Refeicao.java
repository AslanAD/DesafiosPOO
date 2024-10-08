package CardapioRu_nao_acabado;

public class Refeicao extends Alimento{
    //atributos
    private String salada;
    private String pratoPrincipal;
    private String acompanhamento;

    //metodos
    public void montarReficao(){
        System.out.println("A refeiçao do dia é: ");
        System.out.println("Salada: " + this.salada);
        System.out.println("Prato principal: " + this.pratoPrincipal);
        System.out.println("Acompanhamento: " + this.acompanhamento);
    }

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }
}
