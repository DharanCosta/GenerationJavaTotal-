package OrientacaoObjeto;

public class Exer6Class {
		// ATRIBUTOS
			
			String nome;
			int conta;
			float valor;
			boolean positivo;
			
		//M�TODO
		
		public void atingiu()
		{
			this.positivo=true;
		}
		public void natingiu() {
			this.positivo=false;
		}
		public void escrever() {
			if(this.positivo==true) 
				System.out.println("A conta est� positivada");
			else
				System.out.println("A conta est� negativada");
		}
		public void status() {
			System.out.println("O dono da conta "+this.conta+" se chama "+this.nome);
			System.out.println("Ele possui R$ "+this.valor+" reais na sua conta");
			System.out.println("A conta est� positiva ou negativa?");
}
}
