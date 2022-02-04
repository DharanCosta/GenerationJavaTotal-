package introducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int anos, meses, dias, resp, resto;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade em dias: ");
		resp = calc.nextInt();
		
		anos=resp/365;
		resto=resp%365;
		meses=resto/30;
		dias=resto%30;
		
		System.out.println("Sua idade é: "+ anos +" anos, "+ meses+" meses e "+ dias +" dias.");

	}

}
