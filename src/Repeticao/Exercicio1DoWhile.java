package Repeticao;
import java.util.Scanner;

public class Exercicio1DoWhile {

	public static void main(String[] args) {

		int x, soma=0;
		Scanner ler= new Scanner(System.in);
		
		do {
			System.out.println("Digite um n�mero do teclado: ");
			x = ler.nextInt();
			soma= soma+x;
			
		}while(x!=0);
		
		System.out.println("A soma dos n�meros digitados foi de: "+soma);
	}

}
