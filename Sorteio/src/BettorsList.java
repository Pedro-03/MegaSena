import java.util.*;

public class BettorsList {
    private List<Bettor> listaDeApostadores;

    public BettorsList(){

    }

    public List<Bettor> getBettors() {
        return listaDeApostadores;
    }

    public void addBettor(Bettor apostador) {
        if ( listaDeApostadores == null) {
            listaDeApostadores = new ArrayList<>();
        }
        listaDeApostadores.add(apostador);
    
    }

    public Bettor getBettorByCpf(String cpf) {
        for (Bettor a : listaDeApostadores) {
            if (a.getCpf().equals(cpf)) {
                return a;
            }
        }
        return null;
    }

    public void addBet(Bet aposta, Bettor b, int apostaID) {
        int numeroDigitado = 0;
        Scanner in = new Scanner(System.in);
                while (numeroDigitado < 5) {
                    int numero = in.nextInt();
                    List<Integer> num = new ArrayList<>();
                    num.add(numero);
                    aposta = new Bet(apostaID, b, num);
                    numeroDigitado++;
                }
    }

}
