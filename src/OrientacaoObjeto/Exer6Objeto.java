package OrientacaoObjeto;

public class Exer6Objeto {

	public static void main(String[] args) {
		Exer6Class e6 = new Exer6Class();
		e6.conta= 2835;
		e6.nome="Bruno de Luccas";
		
		e6.valor= -3698.00f;
		if(e6.valor>=1){
		e6.positivo=true;
		}else
			e6.positivo=false;
			
		e6.status();
		e6.escrever();
	}

}
