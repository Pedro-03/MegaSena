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
                    System.out.println("Ocorreu um erro ao processar o apostador.");
            }
        }

        public void makeBets(BettorsList bettorsList) {
            try {
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
                boolean betting = true;
        
                while (betting) {
                    List<Integer> newAposta = new ArrayList<>();
                    Bet newBet = null;
                    
                    System.out.println("Deseja fazer uma aposta aleatória? (Y/N)");
                    String opcao = in.nextLine().toUpperCase();

                    newBet = bettorsList.fazerApostacomSurpresinha(opcao, apostaID, newBettor);
        
                    //in.nextLine(); 
                    
                    apostaID++;
                    newBettor.addAposta(newBet);
                    
                    System.out.println("Deseja continuar apostando? (Y/N)");
                    String choice = in.nextLine().toUpperCase();
                    switch (choice) {
                        case "Y":
                            betting = true;
                            break;
                        case "N":
                            betting = false;
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                 }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao processar a aposta.");
        }
    }
    public void getAllBets(BettorsList bettorsList){
            Scanner in = new Scanner(System.in);
            System.out.println("Procurar apostador que deseja ver as apostas");
            System.out.println("Digite seu cpf: ");
            String cpf = in.nextLine();

            Bettor Bettor = bettorsList.getBettorByCpf(cpf);
                if (Bettor == null) {
                    System.out.println("Nenhum apostador encontrado!");
                    return; 
                } 

            if (Bettor.getApostas() == null){
                System.out.println("apostador nao tem apostas ainda");
                return;
            }

            for (Bet b : Bettor.getApostas()) {
                System.out.println("Aposta" + b.toString() + "\n");
            }
            
        }

        public void apurarNumeros(BettorsList bettorsList){
            
        }

        public void sortearNumeros(){
            
        }

    }