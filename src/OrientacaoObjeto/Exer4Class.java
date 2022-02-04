package OrientacaoObjeto;

public class Exer4Class {
	
	// ATRIBUTOS
		String nome;
		int idade;
		int tempoM;
		boolean meta;
		
	//MÉTODO
	
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
			System.out.println("Não atingiu a meta");
	}
	public void status() {
		System.out.println("O funcionário se chama "+this.nome);
		System.out.println("Ele tem "+this.idade+" anos");
		System.out.println("Está na empresa a " +this.tempoM+" meses");
		System.out.println("Conseguiu atingir a meta mensal?");
	}
}