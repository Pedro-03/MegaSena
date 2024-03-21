import java.util.*;

public class Sorteio {
    
    
    public static List<Integer> sortearNumeros() {
        List<Integer> numerosSorteados = new ArrayList<>();
        Random random = new Random();
        
        while (numerosSorteados.size() < 5) {
            int numeroSorteado = random.nextInt(50) + 1; // Gera um número aleatório entre 1 e 50
            if (!numerosSorteados.contains(numeroSorteado)) {
                numerosSorteados.add(numeroSorteado);
            }
        }
        
        return numerosSorteados;
    }
}