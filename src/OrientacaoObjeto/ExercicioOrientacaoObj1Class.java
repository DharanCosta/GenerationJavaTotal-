package OrientacaoObjeto;

public class ExercicioOrientacaoObj1Class {

	// ATRIBUTOS
	String nome;
	int idade;
	String cidade;
	float nota;
	boolean a18;

	
	
	// M�TODO
	
	public ExercicioOrientacaoObj1Class(int x){
		this.idade=x;
		
	}
	
	public void checkarIdade(){
		if(this.idade>=18) {
			System.out.println("Pode cursar Generation");
		}else {
				System.out.println("Volte quando for maior de 18 anos");			
		}
	}	
	
	public void status() {
		System.out.println("O nome do cliente � : "+this.nome);
		System.out.println("A idade �: "+this.idade);
		System.out.println("A cidade natal �" +this.cidade);
		System.out.println("A nota para o curso � "+this.nota);
	}
	
}
