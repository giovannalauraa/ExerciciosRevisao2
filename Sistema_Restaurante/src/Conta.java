
import java.util.ArrayList;
import java.util.Iterator;

public class Conta{
    private ArrayList <String> pratos;
    private double valor;

    public Conta(){
        pratos = new ArrayList<>();

    }

    public void mostrarPratosSolicitados(){
        Iterator<String>  iterator = pratos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void adicionarPedido(int quantidade, String prato, double valor){
        pratos.add(prato);
        atualizarValorTotal(valor * quantidade);
    }

    private void atualizarValorTotal(double valor){
        this.valor = this.valor + valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
