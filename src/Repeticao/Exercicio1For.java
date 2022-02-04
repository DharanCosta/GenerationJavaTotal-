package Repeticao;

import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {
		int cont ; 
		Scanner leia= new Scanner(System.in);
		
		for(cont=1000; cont<=1999; cont++) {
			if(cont%11==5) {
				System.out.println(cont);
			}
			
			
		}
		
		
	
	}

}
