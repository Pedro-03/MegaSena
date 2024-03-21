import java.util.*;

public class Sorteio {

    public Sorteio() {}   
    
    List<Integer> numerosSorteados = new ArrayList<>();

    public void sortearNumeros() {
        Random random = new Random();
        
        while (numerosSorteados.size() < 5) {
            int numeroSorteado = random.nextInt(50) + 1;
            if (!numerosSorteados.contains(numeroSorteado)) {
                numerosSorteados.add(numeroSorteado);
            }
        }
    }

    public List<Integer> getNumerosSorteados() {
        return numerosSorteados;
    }

    public void setNumerosSorteados(List<Integer> numerosSorteados) {
        this.numerosSorteados = numerosSorteados;
    }

}