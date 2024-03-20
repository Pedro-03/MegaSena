import java.util.*;

public class ListaApostadores {
    private List<Bettor> apostadores;


    public ListaApostadores(){

    }

    public List<Bettor> getApostadores() {
        return apostadores;
    }

    public void addApostador(Bettor apostador) {
        if ( apostadores == null) {
            apostadores = new ArrayList<>();
        }
        apostadores.add(apostador);
    
    }

    public Bettor getBettorByCpf(String cpf) {
        for (Bettor a : apostadores) {
            if (a.getCpf().equals(cpf)) {
                return a;
            }
        }
        return null;
    }


}
