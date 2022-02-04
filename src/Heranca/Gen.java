package Heranca;

public class Gen {

	public static void main(String[] args) {
				Pessoa p1 = new Pessoa();
				Aluno p2 = new Aluno();
				
				
				p1.setNome("Dharan");
				p1.setIdade(26);
				
				p2.setNome("Caio");
				p2.setIdade(36);
				p2.aniversario();

				System.out.println(p1.getNome()+"\t"+p1.getIdade());
				System.out.println(p2.getNome()+"\t"+p2.getIdade());
				
	}

}
