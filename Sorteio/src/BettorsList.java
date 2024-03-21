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

    public List<Integer> fazerSurpresinha() {
        List<Integer> surpresinha = new ArrayList<>();
        Random random = new Random();
        while (surpresinha.size() < 5) {
            int numeroSorteado = random.nextInt(50) + 1;
            if (!surpresinha.contains(numeroSorteado)) {
                surpresinha.add(numeroSorteado);
            }
        }
        return surpresinha;
    }

    public Bet fazerApostacomSurpresinha(String opcao, int apostaID, Bettor newBettor) {
        Scanner in = new Scanner(System.in);
        List<Integer> newAposta = new ArrayList<>();
        Bet newBet = null;

        switch (opcao) {
            case "N":
                System.out.println("Faça sua aposta: ");
                for (int i = 0; i < 5; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    int numero = in.nextInt();
                    newAposta.add(numero);
                }
                newBet = new Bet(apostaID, newBettor, newAposta);
                break;
            case "Y":
                boolean a = true;
                while(a == true){
                    newAposta = fazerSurpresinha();
                    newBet = new Bet(apostaID, newBettor, newAposta);
                    System.out.println("Números sorteados: " + newAposta);
                    System.out.println("Deseja outros números? (Y/N)");
                    String choice = in.nextLine().toUpperCase();
                    switch (choice) {
                        case "Y":
                            a = true;
                            break;
                        case "N":
                            a = false;
                            break;
                        default:
                            break;
                    }
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        return newBet;
    }


}
