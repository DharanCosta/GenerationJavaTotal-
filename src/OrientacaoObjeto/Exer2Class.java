package OrientacaoObjeto;

public class Exer2Class {

	// ATRIBUTOS
	String modelo;
	int idade;
	int viagens;
	boolean checkup;

	
	
	// M�TODO
	public void apto()
	{
		this.checkup=true;
	}
	public void reprovado() {
		this.checkup=false;
	}
	public void escrever() {
		if(this.checkup==true) 
			System.out.println("Est� apto para voar");
		else
			System.out.println("Foi reprovado no checkup");
	}
	public void status() {
		System.out.println("O avi�o � do modelo: "+this.modelo);
		System.out.println("A idade do avi�o � de "+this.idade+" anos");
		System.out.println("O avi�o j� fez " +this.viagens+" viagens");
		System.out.println("O avi�o "+this.modelo+ " est� apto a voar?");
	}
	
	
}
