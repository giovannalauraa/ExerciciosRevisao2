package src.Aluno;

public class Mesa{
    
    private String garcom;
    private Conta conta;
    private boolean aberta;

    public Mesa(){

    }

    public boolean isAberta(){
        return aberta;
    }

    public void setAberta(boolean aberta){
        this.aberta = aberta;
    }

    public String getGarcom() {
        return garcom;
    }

    public void setGarcom(String garcom) {
        this.garcom = garcom;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
    
}