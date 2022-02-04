package OrientacaoObjeto;

public class Exer2Class {

	// ATRIBUTOS
	String modelo;
	int idade;
	int viagens;
	boolean checkup;

	
	
	// MÉTODO
	public void apto()
	{
		this.checkup=true;
	}
	public void reprovado() {
		this.checkup=false;
	}
	public void escrever() {
		if(this.checkup==true) 
			System.out.println("Está apto para voar");
		else
			System.out.println("Foi reprovado no checkup");
	}
	public void status() {
		System.out.println("O avião é do modelo: "+this.modelo);
		System.out.println("A idade do avião é de "+this.idade+" anos");
		System.out.println("O avião já fez " +this.viagens+" viagens");
		System.out.println("O avião "+this.modelo+ " está apto a voar?");
	}
	
	
}
