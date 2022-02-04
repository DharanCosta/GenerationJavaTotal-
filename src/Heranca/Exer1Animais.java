package Heranca;

public class Exer1Animais {
		
	// ATRIBUTOS
		private String nome;
		private int idade;
		
	// MÉTODOS	
		
		public void som() {
			System.out.println("Os animais emitem som");
		}
		public void movimento() {
			System.out.println("Os animais se movimentam");
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
	
		
}
