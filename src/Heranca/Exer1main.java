package Heranca;

public class Exer1main {
	public static void main(String[] args) {
		
		Exer1Animais a= new Exer1Animais();
		Exer1Cachorro c= new Exer1Cachorro();
		Exer1Cavalo  v= new Exer1Cavalo();
		Exer1Preguica p=new Exer1Preguica();
		
		a.som();
		c.som();
		v.som();
		p.som();
		
		System.out.println("\n");
		
		a.movimento();
		c.movimento();
		v.movimento();
		p.movimento();
		
		
	}
}
