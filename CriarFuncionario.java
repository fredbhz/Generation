package empresaX;

public class CriarFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario(1, "Joao", 1200, "Auxiliar", 15);
		
		System.out.println("Seu id é: " + f1.getId()); 
		f1.aumento();
				
	}

}
