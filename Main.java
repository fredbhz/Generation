package Cliente;

public class Main {

    private String nome;
    private int idade;
    private String endereco;
    private String cpf;
    private String raca;



    public Playstation5(String nome, int idade, String endereco, String cpf, String raca) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.cpf = cpf;
        this.raca = raca;
    }

    public Main(String roberto, int i, String s, String s1, String pardo) {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String internet) {
        this.cpf = cpf;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    void mudar() {
        if (endereco == "BH") {
            endereco = "FORA";
            System.out.println("Residencia " + endereco);
        }
    }

    void verificarCPF() {
        if (cpf == "cadastrado") {
            cpf = "nao Cadastrado";
            System.out.println("CPF " + cpf);
        }
    }

    void raca() {
        if(raca == "pardo"  {
            System.out.println("Raça Pardo");

        }
    }

}