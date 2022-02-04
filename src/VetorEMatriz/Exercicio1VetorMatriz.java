package VetorEMatriz;

import java.util.Scanner;

public class Exercicio1VetorMatriz {
		
	public static void main(String[] args) {
	
		int  maior=0;
		int[] vet= new int[5];
		Scanner ler= new Scanner(System.in);
		
		for(int x=0;x<5;x++) {
			
			System.out.println("Digite um valor: ");
			vet[x]= ler.nextInt();
			if(vet[x]>maior) {
				maior=vet[x];
			}			
		}
		System.out.println("Os valores digitados foram");
		for(int x=0;x<5;x++) {
			System.out.print(vet[x]+"\t");
		}
		System.out.println("\nO maior valor digitado foi: "+maior);
	
	}
}
