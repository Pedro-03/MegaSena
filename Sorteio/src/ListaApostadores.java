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

    public void addAposta(Aposta aposta, Bettor b, int apostaID) {
        int numeroDigitado = 0;
        Scanner in = new Scanner(System.in);
                while (numeroDigitado < 5) {
                    int numero = in.nextInt();
                    List<Integer> num = new ArrayList<>();
                    num.add(numero);
                    aposta = new Aposta(apostaID, b, num);
                    numeroDigitado++;
                    
                }
    }

}
