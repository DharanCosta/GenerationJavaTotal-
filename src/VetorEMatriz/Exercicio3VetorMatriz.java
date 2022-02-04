package VetorEMatriz;

public class Exercicio3VetorMatriz {

	public static void main(String[] args) {
		
		int[][] n1={{1,2,3,4,5,6},{6,5,4,3,2,1},{1,2,3,4,5,6},{6,5,4,3,2,1}};
		int[][] n2={{1,2,3,4,5,6},{6,5,4,3,2,1},{1,2,3,4,5,6},{6,5,4,3,2,1}};
		int[][] m1= new int[4][6];
		int[][] m2= new int[4][6];
		
		for(int x=0;x<4;x++) {
			for(int y=0;y<6;y++) {
				
				m1[x][y]=n1[x][y]+n2[x][x];
				m2[x][y]=n1[x][y]-n2[x][x];
			}
		}
		System.out.println("\nMatriz da soma:");	
		for(int x=0; x<4;x++) {
			for(int y=0;y<6;y++) {
				System.out.print(m1[x][y]+"\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("\nMatriz da subtração:");	
		for(int x=0; x<4;x++) {
			for(int y=0;y<6;y++) {
				System.out.print(m2[x][y]+"\t");
			}
			System.out.println("\n");
		}
		
		
	}

}
