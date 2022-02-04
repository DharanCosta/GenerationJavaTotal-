package introducao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	
		double n1, n2, n3, m;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Entre com as médias: ");
		n1=calc.nextDouble();
		n2=calc.nextDouble();
		n3=calc.nextDouble();
		
		m=((n1*2)+(n2*3)+(n3*5))/10;
		
		System.out.println("A média ponderada é: "+ m);

	}
}
