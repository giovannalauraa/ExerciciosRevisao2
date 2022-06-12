package src.Aluno;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        Conta conta = new Conta();
        Restaurante restaurante = new Restaurante();
        Mesa mesa = new Mesa();

        // Adicionando garçons
        mesa.setGarcom("Cloud Strife");
        mesa.setGarcom("Loid Forger");

        // Adicionando conta
        mesa.setConta(conta);

        // Adicionando mesa
        restaurante.adicionarMesa(mesa);

        // Adicionando pratos
        restaurante.adicionarPrato("Ratatouille", 30.99);
        restaurante.adicionarPrato("Fettuccine", 32.99);


        // Adicionando pedidos
        conta.adicionarPedido(2, "Ratatouille", 30.99);
        conta.adicionarPedido(1, "Fettuccine", 32.99);

        // Alterando o status da mesa
        mesa.setAberta(true);

        int escolha = 0;

        do{
            System.out.println("\n Escolha uma opção: \n 1. Buscar mesa livre; \n 2. Ver o menu \n 3. Fechar a conta \n
            4. Sair.\n");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    restaurante.mesaDisponivel(mesa);
                    
                    break;
                
                case 2:
                    restaurante.pesquisarPrecoPrato("Ratatouille", 30.99);
                    restaurante.pesquisarPrecoPrato("Fettuccine", 32.99);

                    break;
                case 3:
                restaurante.solicitarConta(mesa);
                break;
            }


        } while (escolha != 4);

        if(escolha==4){
            System.out.println("\nAté logo!");
        }

        entrada.close();

    }
}
