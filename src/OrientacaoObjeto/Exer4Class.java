package OrientacaoObjeto;

public class Exer4Class {
	
	// ATRIBUTOS
		String nome;
		int idade;
		int tempoM;
		boolean meta;
		
	//M�TODO
	
	public void atingiu()
	{
		this.meta=true;
	}
	public void natingiu() {
		this.meta=false;
	}
	public void escrever() {
		if(this.meta==true) 
			System.out.println("Atingiu a meta mensal");
		else
			System.out.println("N�o atingiu a meta");
	}
	public void status() {
		System.out.println("O funcion�rio se chama "+this.nome);
		System.out.println("Ele tem "+this.idade+" anos");
		System.out.println("Est� na empresa a " +this.tempoM+" meses");
		System.out.println("Conseguiu atingir a meta mensal?");
	}
}