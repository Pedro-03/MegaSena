import java.util.*;

public class BetManager {
    
    public BetManager() {

    }

    int apostaID = 1000;
    List<Bet> listaDeAposta = new ArrayList<Bet>();
    List<Bettor> bettores = new ArrayList<Bettor>();
    BettorsList bettorsList = new BettorsList();

    public void registerBettor(BettorsList bettorsList) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Cadastro de conta");
            System.out.println("================================================================");
            System.out.println("Digite o nome do apostador: ");
            String nome = in.nextLine();
            System.out.println("Digite o cpf do apostador: ");
            String cpf = in.nextLine();
            Bettor Bettor = new Bettor(nome, cpf, null);
            bettorsList.addBettor(Bettor);
            System.out.println("Apostador cadastrado!");
            System.out.println(Bettor);

        } catch (Exception e) {
            System.out.println("Erro: Algo errado");
        }
    }

public void makeBets(BettorsList bettorsList) {
    try {
        List<Bettor> ap = bettorsList.getBettors();
        if (ap == null) {
            System.out.println("Nenhum apostador encontrado!");
            return;
        }
        
        Scanner in = new Scanner(System.in);
        System.out.println("Fazer aposta");
        System.out.println("================================================================");
        System.out.println("Procurar apostador");
        System.out.println("Digite seu cpf: ");
        String cpf = in.nextLine();
        Bettor newBettor = bettorsList.getBettorByCpf(cpf);
        if (newBettor == null) {
            System.out.println("Nenhum apostador encontrado!");
            return; 
        } 
            System.out.println("Apostador encontrado!");
            newBettor.toString();
            boolean betting = true;

            while (betting) {
                System.out.println("Faça suas apostas:");
                System.out.println("Somente números entre 1 a 50");
                
                int numeroDigitado = 0;
                List<Integer> newAposta = new ArrayList<>();

                while (numeroDigitado < 5) {
                    int numeroParaAposta = in.nextInt();
                    newAposta.add(numeroParaAposta);
                    numeroDigitado++;
                }

                in.nextLine();

                apostaID++;
                Bet newBet = new Bet(apostaID, newBettor, newAposta);
                newBettor.addAposta(newBet);
                // if (newBettor.isBetRepeted(newBet) == true){
                //     System.out.println("bet repetida");
                //     break;
                // }
                

                System.out.println("Deseja continuar betting? (Y/N)");
                String choice = in.nextLine().toUpperCase();


                switch (choice) {
                    case "Y":
                        betting = true;
                        break;
                    case "N":
                        betting = false;
                        break;
                    // default:
                    //     System.out.println("Opção inválida!");
                    //     break;
                }
        
        }
    } catch (Exception e) {
        // TODO: handle exception
    }
}
}