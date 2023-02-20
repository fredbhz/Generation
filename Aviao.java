package aviaoPackage;

public class Aviao {

	private String modelo;
	private int anoFabricacao;
	private String classe;
	private boolean particular;

	public Aviao(String modelo, int anoFabricacao, String classe) {
		super();
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.classe = classe;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public boolean isParticular() {
		return particular;
	}
	
	void voar() {
		System.out.println("Estou Voando");		
	}

}
