package aviaoPackage;

public class CriarAviao {
	
	public static void main(String[] args) {
	
		Aviao aviao1 = new Aviao("A3FB4",2012,"Exec221");
		
		
		System.out.println("Modelo: " + aviao1.getModelo());
		System.out.println("Amo de Fabricação: " + aviao1.getAnoFabricacao());
		System.out.println("Classe: " + aviao1.getClasse());
		
		aviao1.voar();

		
	}

	
}
