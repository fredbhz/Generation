package produtoEletronico;

public class CriarPs5 {
	public static void main(String[] args) {
		Playstation5 ps5001 = new Playstation5("off", 1, "baixo", "sim", "nao");
		
		System.out.println(ps5001.getStatus());
		ps5001.ligar();
		
		ps5001.jogar();
		

	}
	

}
