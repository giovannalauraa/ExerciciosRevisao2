package src.Aluno;

import java.util.ArrayList;
import java.util.HashMap;

public class Restaurante{

    private HashMap<String, Double> cardapio;
    private ArrayList<Mesa> mesas;

    public Restaurante(){
        mesas = new ArrayList<>();
        cardapio = new HashMap<>();
    }

    public void adicionarPrato(String prato, double preco){
        cardapio.put(prato, preco);
    }

    public void pesquisarPrecoPrato(String prato, double preco){
        if(cardapio.get(prato) == null){
            System.out.println("\nPrato não encontrado!");
        }else{
            System.out.println("\nNome do prato: "+prato+"\nPreço do prato: "+cardapio.get(prato));
            cardapio.put(prato, preco);
        }
    }

    public void mesaIndisponivel(Mesa mesa){
        if(mesa.isAberta()){
            System.out.println("\nA mesa está indisponível.");
        }else{
            System.out.println("\nA mesa não está disponível.");
        }
    }

    public void solicitarConta(Mesa mesa){
        Conta conta = mesa.getConta();
        conta.mostrarPratosSolicitados();
        System.out.println("\nValor total do pedido: "+conta.getValor());
    }
}