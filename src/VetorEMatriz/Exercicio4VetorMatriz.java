package VetorEMatriz;
import java.util.Scanner;

public class Exercicio4VetorMatriz {

	public static void main(String[] args) {
			
		int[][] m= new int[3][3];
		int st=0, sd=0;
		Scanner ler = new Scanner(System.in);
		
		for(int x=0;x<3;x++) {
			for(int y=0;y<3;y++) {
				System.out.println("Digite um valor:");
				m[x][y]= ler.nextInt();
				st=st+m[x][y];
				
			}
		}
		for(int x=0;x<3;x++) {
			sd=sd+m[x][x];
		}
		
		System.out.println("A soma de todos os valores da matriz é: "+st);
		System.out.println("A soma dos valors diagonais da matriz é:" +sd);

	}

}
