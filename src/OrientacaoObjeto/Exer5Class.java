package OrientacaoObjeto;

public class Exer5Class {
	// ATRIBUTOS
			String marca;
			String cor;
			int tempoM;
			boolean infantil;
			
		//MÉTODO
		
		public void sim()
		{
			this.infantil=true;
		}
		public void nao() {
			this.infantil=false;
		}
		public void escrever() {
			if(this.infantil==true) 
				System.out.println("O patinete é para crianças");
			else
				System.out.println("O patinete suporta adultos");
		}
		public void status() {
			System.out.println("O patinete é da marca "+this.marca+" e é da cor"+this.cor);
			System.out.println("Tem "+this.tempoM+" meses de uso");
			//System.out.println(");
			System.out.println("O patinete é infantil?");
		}
}
