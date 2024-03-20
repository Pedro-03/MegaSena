import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Aposta> apostadores = new ArrayList<>();
        List<Integer> numerosApostados = new ArrayList<>();
        ListaApostadores listaAp = new ListaApostadores();
        GerenciadorAposta gerenciador = new GerenciadorAposta();
        
        boolean cadastro = true;

        while (cadastro == true) {
            
            try {
                
                Scanner in = new Scanner(System.in);

                System.out.println("==============================MENU==============================");
                System.out.println("Digite 1 cadastrar usuário");
                System.out.println("digite 2 para começar as apostas");
                System.out.println("digite 3 para sortear os numeros");
                System.out.println("================================================================");
                System.out.println("digite 0 para sair");
            
                int op = in.nextInt();
                
                
                switch (op) {
                    case 1: 
                        gerenciador.cadastraApostador(listaAp);
                        break;
                    case 2: 
                        gerenciador.fazerApostas(listaAp);
                        break;

                    case 3:
                    
                        break;
                    
                    case 0: 
                        cadastro = false;
                        break;
                    default:
                        break;
                }
                
               
                

            } catch (Exception e) {
                System.out.println("Ocorreu um erro ao processar a aposta.");
                e.printStackTrace();
            }
        }

        
    }   
}