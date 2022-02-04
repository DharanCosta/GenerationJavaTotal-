package introducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int anos, meses, dias, resp;
		Scanner calc = new Scanner(System.in);
				
		System.out.println("Quantos anos você tem?");
		anos = calc.nextInt();
		
		System.out.println("Quantos meses você tem?");
		meses = calc.nextInt();
		
		System.out.println("Quantos dias você tem?");
		dias = calc.nextInt();
		
		resp=(anos * 365)+ (meses * 30)+ dias;
		System.out.println("Sua idade em dias é: "+ resp + " dias");
		
		
	}

}
