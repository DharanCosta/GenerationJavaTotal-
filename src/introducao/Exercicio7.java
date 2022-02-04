package introducao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		double a, b, c, d, e, f, x, y;
		Scanner calc = new Scanner(System.in);
		
		
		System.out.println("Entre com os valores de A, B, C, D, E e F: ");
		a=calc.nextDouble();
		b=calc.nextDouble();
		c=calc.nextDouble();
		d=calc.nextDouble();
		e=calc.nextDouble();
		f=calc.nextDouble();
		
		x=((c*e)-(b*f))/((a*e)-(b*d));
		y=((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("Os valores de X e Y são respectivamente: "+x+" e "+y);

	}

}
