import java.util.*;

public class Bettor {
    private String name;
    private String cpf;
    List<Bet> betList;
     
    public Bettor(String name, String cpf, List<Bet> betList) {
        this.name = name;
        this.cpf = cpf;
        this.betList = betList;
    }

     public boolean isBetRepeted(Bet bet) {
      for(Bet b : betList){
        if (b.equals(bet)){
            return true;
        }
      }
      return false;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Bet> getApostas() {
        return betList;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setApostas(List<Bet> betList) {
        this.betList = betList;
    }

    public void addAposta(Bet aposta) {
        if (betList == null) {
             betList = new ArrayList<>();
        }
        betList.add(aposta);
    }


    @Override
    public String toString() {
        return "Apostador: [ Name: " + name + ", Cpf: " + cpf + "Apostas: " + betList + " ]";
    
    }
}
