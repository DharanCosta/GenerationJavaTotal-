package Repeticao;

import java.util.Scanner;

public class Exercecio2For {
	public static void main(String[] args) {
		
	int  cont, x, im = 0, par = 0;
	Scanner ler= new Scanner(System.in);
	
	
	for(cont=1 ; cont<=10 ; cont++) {
		
		System.out.println("Insira o "+cont+"� numero:");
        x=ler.nextInt();
		
		if(x%2!=0) {
			im++;
			
		}
		if(x%2==0) {
			par++;
		}
	}
	System.out.println("O total de n�meros pares foi de "+par);
	System.out.println("O total de n�meros �mpares foi de "+im);
	}
}
