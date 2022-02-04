package Repeticao;

import java.util.Scanner;

public class Exercicio1While {

	public static void main(String[] args) {

		int idade=0, menor=0, maior=0;
		Scanner ler = new Scanner(System.in);
		
		while(idade!=-99) {
			System.out.println("Informe a sua idade: ");
			idade = ler.nextInt();
			
			if(idade<21) {
				menor++;
			}
			if(idade>50) {
				maior++;
			}
		// para excluir o -99 da contagem
		menor=menor-1;
		}
		System.out.println("O total de pessoas menores de 21 anos é de "+menor+" pessoas");
		System.out.println("O total de pessoas maiores de 50 anos é de "+maior+" pessoas");
	}

}
