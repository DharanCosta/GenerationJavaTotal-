package Repeticao;
import java.util.Scanner;

public class Exercicio2DoWhile {

	public static void main(String[] args) {

		double x, cont=0.0, soma=0.0;
		double media=0.0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número inteiro: ");
			x= ler.nextInt();
				
			if(x%3==0){
					soma=soma+x;
					cont++;					
				}	
		}while(x!=0);
		
		media=soma/(cont-1);
		System.out.println("A média dos números mútiplos de 3 foi de: "+media);
		
	}

}
