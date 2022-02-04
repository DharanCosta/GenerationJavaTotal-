package OrientacaoObjeto;

public class Exer3Class {
	// ATRIBUTOS Produto Eletrônico
		String modelo;
		int validade;
		float espessura;
		boolean novo;

				
		// MÉTODO
		public void novo()
		{
			this.novo=true;
		}
		public void usado() {
			this.novo=false;
		}
		public void escrever() {
			if(this.novo==true) 
				System.out.println("Este produto é novo");
			else
				System.out.println("Este produto já foi usado");
		}
		public void status() {
			System.out.println("O modelo do produto é "+this.modelo);
			System.out.println("A validade é de "+this.validade+" anos");
			System.out.println("A espessura da caixa é de " +this.espessura+" centimetros");
			System.out.println("O produto "+this.modelo+ " é novo?");
		}
		
}
