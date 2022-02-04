package OrientacaoObjeto;
public class Exer7Objeto {

	public static void main(String[] args) {
		Exer7Class e7 = new Exer7Class();
		e7.idade= 45;
		e7.nome="Bruno Castanhari";
		e7.ar=true;
		e7.dor=false;
		e7.febre=true;
		e7.muscular=false;
		e7.tosse=false;
		e7.vomito=true;
		
		e7.status();
		e7.escrever();
	}

}
