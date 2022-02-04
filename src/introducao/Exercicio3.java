package introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		int ev, h, m, s, r;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite o tempo de duração em segundos: ");
		ev = calc.nextInt();
		
		h=ev/3600;
		r=ev%3600;
		m=r/60;
		s=r%60;
		
		System.out.println("O tempo de duração é "+h+" horas "+m+" minutos e "+s+" segundos");
				

	}

}
