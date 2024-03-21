import java.util.*;

public class Bettor {
    private String name;
    private String cpf;
    List<Bet> Betlist;
     
    public Bettor(String name, String cpf, List<Bet> Betlist) {
        this.name = name;
        this.cpf = cpf;
        this.Betlist = Betlist;
    }

     public boolean isBetRepeted(Bet bet) {
      for(Bet b : Betlist){
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
        return Betlist;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setApostas(List<Bet> Betlist) {
        this.Betlist = Betlist;
    }

    public void addAposta(Bet aposta) {
        if (Betlist == null) {
             Betlist = new ArrayList<>();
        }
        Betlist.add(aposta);
    }


    @Override
    public String toString() {
        return "Apostador: [ Name: " + name + ", Cpf: " + cpf + " ]";
    
    }
}
