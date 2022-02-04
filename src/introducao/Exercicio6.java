package introducao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double x1, x2, x12, y1, y2, y12, d;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Entre as coordenadas do ponto de partida: ");
		x1=calc.nextDouble();
		x2=calc.nextDouble();
		System.out.println("Entre as coordenadas do ponto de destino: ");
		y1=calc.nextDouble();
		y2=calc.nextDouble();
		
		x12=x2-x1;
		y12=y2-y1;
		
		d=Math.sqrt((Math.pow(x12, 2))+(Math.pow(y12,2)));
		
		
		System.out.println("A distância entre dois pontos é: " +d);
			

	}

}
