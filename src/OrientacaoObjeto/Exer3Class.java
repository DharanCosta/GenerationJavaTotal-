package OrientacaoObjeto;

public class Exer3Class {
	// ATRIBUTOS Produto Eletr�nico
		String modelo;
		int validade;
		float espessura;
		boolean novo;

				
		// M�TODO
		public void novo()
		{
			this.novo=true;
		}
		public void usado() {
			this.novo=false;
		}
		public void escrever() {
			if(this.novo==true) 
				System.out.println("Este produto � novo");
			else
				System.out.println("Este produto j� foi usado");
		}
		public void status() {
			System.out.println("O modelo do produto � "+this.modelo);
			System.out.println("A validade � de "+this.validade+" anos");
			System.out.println("A espessura da caixa � de " +this.espessura+" centimetros");
			System.out.println("O produto "+this.modelo+ " � novo?");
		}
		
}
