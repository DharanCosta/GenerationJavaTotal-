package OrientacaoObjeto;

public class Exer7Class {
	// ATRIBUTOS
			String nome;
			int idade;
			boolean febre;
			boolean dor;
			boolean vomito;
			boolean tosse;
			boolean ar;
			boolean muscular;
		//MÉTODO
	
		public void escrever() {
			if(this.febre==true) 
				System.out.print("Febre / ");
			if(this.dor==true) 
				System.out.print("Dor / ");
			if(this.vomito==true) 
				System.out.print("Vómito / ");
			if(this.tosse==true) 
				System.out.print("Tosse / ");
			if(this.ar==true) 
				System.out.print("Falta de ar / ");
			if(this.muscular==true) 
				System.out.print("Dor muscular");
		}
		public void status() {
			System.out.println("O paciente "+this.nome+" de "+this.idade+" anos, apresentou os seguintes sintomas");
			System.out.println("Os sintomas apresentados foram: ");
		}
	
	
}
