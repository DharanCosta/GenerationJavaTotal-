package introducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double a, b, ab, c, bc, r, s, d;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = calc.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = calc.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = calc.nextDouble();
		
		ab=a+b;
		bc=b+c;
		r= ab*ab;
		s=bc*bc;
		d=(r+s)/2;
		
		System.out.println("O resultado é: "+ d);
		
	}

}
