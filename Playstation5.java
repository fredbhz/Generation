package produtoEletronico;

public class Playstation5 {

	private String status;
	private int controle;
	private String nivelBateriaControle;
	private String internet;
	private String acessoPsn;



	public Playstation5(String status, int controle, String nivelBateriaControle, String internet, String acessoPsn) {
		super();
		this.status = status;
		this.controle = controle;
		this.nivelBateriaControle = nivelBateriaControle;
		this.internet = internet;
		this.acessoPsn = acessoPsn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getControle() {
		return controle;
	}

	public void setControle(int controle) {
		this.controle = controle;
	}

	public String getNivelBateriaControle() {
		return nivelBateriaControle;
	}

	public void setNivelBateriaControle(String nivelBateriaControle) {
		this.nivelBateriaControle = nivelBateriaControle;
	}

	public String getInternet() {
		return internet;
	}

	public void setInternet(String internet) {
		this.internet = internet;
	}

	public String getAcessoPsn() {
		return acessoPsn;
	}

	public void setAcessoPsn(String acessoPsn) {
		this.acessoPsn = acessoPsn;
	}

	void ligar() {
		if (status == "off") {
			status = "on";
			System.out.println("Ps5 " + status);
		}
	}
	
	void desligar() {
		if (status == "on") {
			status = "off";
			System.out.println("Ps5 " + status);
		}
	}
	
	void jogar() {
		if(status == "on" && controle > 0) {
			System.out.println("Vamos Jogar!");
			
			if (nivelBateriaControle == "baixo") {
				System.out.println("Aviso: Nivel de bateria baixo. Recarregue o controle.");
			}
		}
	}

}
