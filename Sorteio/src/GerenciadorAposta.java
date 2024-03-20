import java.util.*;

public class GerenciadorAposta {
    
    public GerenciadorAposta() {

    }

    int apostaID = 1000;

    public void cadastraApostador(ListaApostadores apostadores) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Cadastro de conta");
            System.out.println("================================================================");
            System.out.println("Digite o nome do apostador: ");
            String nome = in.nextLine();
            System.out.println("Digite o cpf do apostador: ");
            String cpf = in.nextLine();
            Bettor apostador = new Bettor(nome, cpf, null);
            apostadores.addApostador(apostador);
            System.out.println("Apostador cadastrado!");

        } catch (Exception e) {
            System.out.println("Erro: Algo errado");
        }
    }

    public void fazerApostas(ListaApostadores apostadores) {
        try {
            List<Bettor> ap = apostadores.getApostadores();
            if(ap == null){
                System.out.println("Nenhum apostador encontrado!");
                return;
            }

            Scanner in = new Scanner(System.in);
            System.out.println("Fazer aposta");
            System.out.println("================================================================");
            System.out.println("Procurar apostador");
            System.out.println("Digite seu cpf: ");
            String cpf = in.nextLine();
            Bettor bettor = apostadores.getBettorByCpf(cpf);
            if(bettor == null){
            System.out.println("Nenhum apostador encontrado!");
            return;
            }
            else{
                System.out.println("Apostador encontrado!");
                System.out.println("Faça suas apostas:");
                System.out.println("Somente números entre 1 a 50");
                
                Aposta aposta;
                int numeroDigitado = 0;
                while (numeroDigitado < 4) {
                    int numero = in.nextInt();
                    List<Integer> num = new ArrayList<>();
                    num.add(numero);
                    aposta = new Aposta(numero, bettor, num);
                }
            } 
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}