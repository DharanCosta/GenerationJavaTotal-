package OrientacaoObjeto;

public class Exer5Class {
	// ATRIBUTOS
			String marca;
			String cor;
			int tempoM;
			boolean infantil;
			
		//M�TODO
		
		public void sim()
		{
			this.infantil=true;
		}
		public void nao() {
			this.infantil=false;
		}
		public void escrever() {
			if(this.infantil==true) 
				System.out.println("O patinete � para crian�as");
			else
				System.out.println("O patinete suporta adultos");
		}
		public void status() {
			System.out.println("O patinete � da marca "+this.marca+" e � da cor"+this.cor);
			System.out.println("Tem "+this.tempoM+" meses de uso");
			//System.out.println(");
			System.out.println("O patinete � infantil?");
		}
}
