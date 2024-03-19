import java.util.*;

public class Apostador {
    private String nome;
    private String cpf;
    private List<Integer> numApostados;

    public Apostador(String nome, String cpf, List<Integer> numApostados){
        this.nome = nome;
        this.cpf = cpf;
        numApostados = new ArrayList<>();
        this.numApostados = numApostados;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Integer> getNumApostados() {
        return numApostados;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNumApostados(List<Integer> numApostados) {
        this.numApostados = numApostados;
    }

    @Override
    public String toString() {
        return "Apostador [ nome = " + nome + ", cpf = " + cpf + ", numApostados = " + numApostados + " ]";
    }

    
}
