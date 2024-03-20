import java.util.*;

public class Bettor {
    private String nome;
    private String cpf;
    List<Integer> numerosApostados;
     
    public Bettor(String nome, String cpf, List<Integer> numerosApostados) {
        this.nome = nome;
        this.cpf = cpf;
        this.numerosApostados = numerosApostados;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Integer> getNumerosApostados() {
        return numerosApostados;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNumerosApostados(List<Integer> numerosApostados) {
        this.numerosApostados = numerosApostados;
    }

    @Override
    public String toString() {
        return "Apostador: [ Nome: " + nome + ", Cpf: " + cpf + " ]";
    
    }
}
