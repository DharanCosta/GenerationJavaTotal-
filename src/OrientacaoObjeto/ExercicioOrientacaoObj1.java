package OrientacaoObjeto;

import java.util.Scanner;

public class ExercicioOrientacaoObj1 {
		public static void main(String[] args) {
			
			int x;
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite a idade: ");
			x=ler.nextInt();
			
			System.out.println("\n");
			ExercicioOrientacaoObj1Class e1= new ExercicioOrientacaoObj1Class(x);
		
			e1.nome="Dharan Costa";
			e1.cidade="São Paulo";
			e1.nota=10;
			e1.status();
			e1.checkarIdade();
					
			
			
			
			
		}
}
