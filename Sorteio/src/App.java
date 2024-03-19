import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Apostador> a = new ArrayList<Apostador>();
        List<Integer> num = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        Apostador apostador = new Apostador(null, null, null);

        System.out.println("digite seu nome");
        apostador.setNome(in.nextLine());
        System.out.println("digite seu cpf");
        apostador.setCpf(in.nextLine());
        System.out.println("Faça a aposta: ");
        
        while()
        num.add(in.nextInt());
        in.close();
        apostador.setNumApostados(num);
        a.add(apostador);
        System.out.println(a);
        apostador.toString();

        
        



    }
}
