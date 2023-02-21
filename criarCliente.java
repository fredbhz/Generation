package Cliente;

public class criarCliente {
    public static void main(String[] args) {
        Main Roberto = new Main ("Roberto", 18, "Rua dos Medicos, 501", "18122935255", "Pardo");

        System.out.println(Roberto.getNome());

        Roberto.raca();

        Roberto.verificarCPF();


    }


}