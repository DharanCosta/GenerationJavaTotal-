package GenSnackBar;
// Funções de Biblioteca
import java.util.ArrayList; 
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class SnackBarMain {

	public static void main(String[] args) {
		// Variáveis
		Scanner leia = new Scanner(System.in);
		int contaPedido=0, escolhaL=0, escolhaB=0, escolhaS=0, escolhaP=0;
		int contXb=0, contXs=0, contXBa=0, contXv=0, contRef=0, contSu=0, contMI=0, contTL=0, contMC=0;
		double somaTotal=0.0;
		
		//Criando nossa tabela de produtos
		
		Lanches l1 = new Lanches(1,"X-Burger",25.00);
		Lanches l2 = new Lanches(2,"X-Salada",26.00);
		Lanches l3 = new Lanches(3,"X-Bacon",27.00);
		Lanches l4 = new Lanches(4,"X-Veggie",25.00);
		Bebidas b1 = new Bebidas(1,"Refrigerante",6.00);
		Bebidas b2 = new Bebidas(2,"Sucos Naturais",8.00);
		Bebidas b3 = new Bebidas(3,"Milk-shake",16.00);
		Sobremesas s1 = new Sobremesas(1,"Torta de limão",13.00);
		Sobremesas s2 = new Sobremesas(2,"Mouse de chocolate",12.00);
		
		Pedidos p1 = new Pedidos(1,"X-Burger",25.00);
		Pedidos p2 = new Pedidos(2,"X-Salada",26.00);
		Pedidos p3 = new Pedidos(3,"X-Bacon",27.00);
		Pedidos p4 = new Pedidos(4,"X-Veggie",25.00);
		Pedidos p5 = new Pedidos(1,"Refrigerante",6.00);
		Pedidos p6 = new Pedidos(2,"Sucos Naturais",8.00);
		Pedidos p7 = new Pedidos(3,"Milk-shake",16.00);
		Pedidos p8 = new Pedidos(1,"Torta de limão",13.00);
		Pedidos p9 = new Pedidos(2,"Mouse de chocolate",12.00);
		
		//Arrays vazias onde inserimos os nossos dados
		ArrayList<Lanches> lanche = new ArrayList<>();
		ArrayList<Bebidas> bebida = new ArrayList<>();
		ArrayList<Sobremesas> sobremesa = new ArrayList<>();
		ArrayList<Pedidos> pedido = new ArrayList<>();
		
		//Teste de implementação dos dados nas Arrays
		lanche.add(l1);
		lanche.add(l2);
		lanche.add(l3);
		lanche.add(l4);
		bebida.add(b1);
		bebida.add(b2);
		bebida.add(b3);
		sobremesa.add(s1);
		sobremesa.add(s2);
		//System.out.println(lanche);
		
		//Início do programa
		System.out.println("═══════════════════════════════════════════════════════");
		System.out.println("Bem-vindes ao Snack Bar Generation!");
		System.out.println("Os melhores snacks para os melhores devs");
		System.out.println("═══════════════════════════════════════════════════════");	
		
		//Mostrar opções e imput do usuário
				
			do {
					// Escolha o lanche
					System.out.println("Escolha um lanche: (digite o código)");
					System.out.println(l1+""+l2+""+l3+""+l4);
				
					try {
						escolhaL=leia.nextInt();	// 	Entrada em inteiro e deixamos o case em string
					}catch(InputMismatchException erro){
							do{
									System.out.println("ERRO!! Você deve digitar uma opção válida"+ erro);
										escolhaL=leia.nextInt();
								}while(escolhaL!=1 || escolhaL!=2 || escolhaL!=3 || escolhaL!=4 );
					
							switch(escolhaL)
								{
									case 1:
									{
										//pedido.add(setNome());
										pedido.add(p1);
										contXb++;
										break;
									}
									case 2:{
										pedido.add(p2);
										contXs++;
										break;}
									case 3:{
										pedido.add(p3);
										contXBa++;
										break;}
									case 4:{
										pedido.add(p4);
										contXv++;
										break;}
									//default:{
									//escolhaL=leia.nextInt();
									}
						
					
				
					
					System.out.println("═══════════════════════════════════════════════════════");
					System.out.println("Escolha uma bebida: (digite o código)");
					System.out.println(b1+""+b2+""+b3);
					escolhaB=leia.nextInt();
					switch(escolhaB) {
						case 1:
							{
								pedido.add(p5);
								contRef++;
								break;
							}
						case 2:{
								pedido.add(p6);
								contSu++;
								break;}
						case 3:{
								pedido.add(p7);
								contMI++;
								break;}
							//default'':
								//pedido.add("--");
					}
					System.out.println("═══════════════════════════════════════════════════════");
					System.out.println("Escolha uma sobremesa: (digite o código)");
					System.out.println(s1+""+s2);
					escolhaS=leia.nextInt();
					
					switch(escolhaS) {
					case 1:
						{
							pedido.add(p8);
							contTL++;
							break;
						}
					case 2:{
							pedido.add(p9);
							contMC++;
							break;}
						//default'':
							//pedido.add("--");
					}
					System.out.println("═══════════════════════════════════════════════════════");
					System.out.println("Gostaria de realizar outro pedido?");
					System.out.println("1 - SIM | 2 - NÃO ");
					escolhaP=leia.nextInt();
					
				}while(escolhaP!=2);
		
		
		System.out.println("══════════════════════RECIBO═════════════════════");
		System.out.println("/n");
		System.out.println("O pedido final foi:" );
		

		somaTotal=(contXb*25)+(contXs*26)+(contXBa*27)+(contXv*25)+(contRef*6)+(contSu*8)+(contMI*16)+(contTL*13)+(contMC*12);
		
		System.out.println(pedido);
		System.out.println("══════════════════════RECIBO═════════════════════");
		System.out.println("O valor total do pedido foi de R$"+somaTotal);
		
	
		
		/*
		linhaDetalhe()
		public static void linhaDetalhe() {
			System.out.println("═══════════════════════════════════════════════════════");
		}
		*/
		
		/*linhaDetalhe();
		System.out.println("Bem-vindes ao Snack Bar Generation!");
		System.out.println("Mundando vidas, acessando conhecimento!!!");
		linhaDetalhe();
		System.out.println();
		// menu inicial
		System.out.println("[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		System.out.println();
		System.out.print("DIGITE A OPÇÃO: ");
		char opcaoMenu = leia.next().charAt(0);
		switch (opcaoMenu) 
			public static void linhaDetalhe() {
				System.out.println("═══════════════════════════════════════════════════════");
		*/
	}

		
}
