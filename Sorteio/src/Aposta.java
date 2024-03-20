import java.util.*;

public class Aposta {
    private int id;
    private Bettor apostador;
    private List<Integer> numApostados;

    public Aposta(int id, Bettor apostador, List<Integer> numApostados){
        this.id = id;
        this.apostador = apostador;
        numApostados = new ArrayList<>();
        this.numApostados = numApostados;
    }

    public List<Integer> getNumApostados() {
        return numApostados;
    }

    public int getId() {
        return id;
    }
    public Bettor getApostador() {
        return apostador;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setApostador(Bettor apostador) {
        this.apostador = apostador;
    }
    
    public void setNumApostados(List<Integer> numApostados) {
        this.numApostados = numApostados;
    }



    @Override
    public String toString() {
        return "Apostador [ id = " + id + ", numApostados = " + numApostados + " ]";
    }
    
}
