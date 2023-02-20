package clientePackage;

public class Cliente {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private String email;
	private String cadastro;
	
	
	public Cliente(String nome, String sobrenome, int idade, String email, String cadastro) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.email = email;
		this.cadastro = cadastro;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCadastro() {
		return cadastro;
	}
	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}
	
	void comprar() {
		System.out.println("Estou comprando ...");
	}
	
	void cadastrar() {
		
		if(cadastro == "s") {
			System.out.println("usuário já cadastrado!");
			comprar();
		} else System.out.println("Usuário Não possui cadastro. Cadastro feito com sucesso.");
	}

}
