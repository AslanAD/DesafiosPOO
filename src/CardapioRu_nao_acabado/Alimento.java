package CardapioRu_nao_acabado;

import java.util.Scanner;

public class Alimento {
    //atributos
    private String nomeAlimento;
    private String tipoAlimento;

    //metodos
    public void cadastrarNome(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o nome do alimento?");
        this.nomeAlimento = entrada.nextLine();
        System.out.println("Qual o tipo do alimento?");
        this.tipoAlimento = entrada.nextLine();
        entrada.close();
    }

    public String getNomeAlimento() {
        return nomeAlimento;
    }

    public void setNomeAlimento(String nomeAlimento) {
        this.nomeAlimento = nomeAlimento;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }
}
