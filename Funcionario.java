package empresaX;

public class Funcionario {
	
	int id;
	String nome;
	float salario;
	String cargo;
	int tempoDeCasa;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getTempoDeCasa() {
		return cargo;
	}
	public void setTempoDeCasa(int tempoDeCasa) {
		this.cargo = cargo;
	}
	
	
	public Funcionario(int id, String nome, float salario, String cargo, int tempoDeCasa) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		this.tempoDeCasa = tempoDeCasa;

	}
	

	void aumento() {
		if (tempoDeCasa <= 12) {
			System.out.println("Você ainda não tem tempo suficiente de casa.");
		} else {
			System.out.println("Salário: R$ " + salario);
			salario = salario + 300;
			System.out.println("Aumento concedido. Converse com o seu Gerente. Salário atual: R$" + salario);
		}
	}
}
