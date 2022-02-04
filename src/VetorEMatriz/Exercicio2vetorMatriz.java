package VetorEMatriz;
import java.util.Scanner;

public class Exercicio2vetorMatriz 
{
	public static void main(String[] args)
	{
		int maior=0, cont=0, x;
		double s=0.0, media=0.0;
		int[] vet= new int[10];
		Scanner ler= new Scanner(System.in);
		
		
		for(x=0;x<10;x++)
		{
			System.out.println("Digite um valor: ");
			vet[x]= ler.nextInt();
			if(vet[x]>maior) {
				maior=vet[x];
			}
			s=s+vet[x];
		}
		System.out.println("Os valores digitados foram: ");
		for(x=0;x<10;x++) {
			if(vet[x]==maior){
				cont++;
			}
			System.out.println(vet[x]+"\t");
		}
		media=s/10;
		System.out.println("A média dos valores lançados é: "+media);
		System.out.println("A maior pontuação ocorreu "+cont+" vezes");

	}
}
