import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Apostador> apostadores = new ArrayList<>();
        List<Integer> numerosApostados = new ArrayList<>();
       
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("MENU");
            System.out.println("================================================");
            System.out.println("digite 1 para começar as apostas");
            System.out.println("digite 2 para finalizar as apostas");
            System.out.println("digite 3 para sortear os numeros");
            System.out.println("================================================");
            System.out.println("digite 0 para sair");

            
            System.out.println("Digite seu nome:");
            String nome = in.nextLine();
            
            System.out.println("Digite seu CPF:");
            String cpf = in.nextLine();
            
            System.out.println("Faça a aposta (digite 5 números):");

            
            int numerosDigitados = 0;
            
            while (in.hasNextInt() && numerosDigitados < 4) {
                int numero = in.nextInt();
                numerosApostados.add(numero);
                numerosDigitados++;
            }
            
           
            Apostador apostador = new Apostador(nome, cpf, numerosApostados);
            apostadores.add(apostador);
            System.out.println("Aposta registrada com sucesso!");
            System.out.println(apostador);
            
            in.close();

        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao processar a aposta.");
            e.printStackTrace();
        }
    }
}