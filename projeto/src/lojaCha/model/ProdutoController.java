package lojaCha.model;

import java.util.ArrayList;
import java.util.Scanner;
import lojaCha.util.Cores;

public class ProdutoController {
	static Scanner leia = new Scanner(System.in);
	
	public ArrayList<Produtos> produtos; 
	public void inicializarprodutos() {
		
		ArrayList<Produtos> produtosDisponiveis = new ArrayList<Produtos>(); 
		
		produtosDisponiveis.add(new Produtos(" 1 - chá de camomila  ", " - o clássico, aquele da massa!  ", 10f  )); 
		produtosDisponiveis.add(new Produtos(" 2 - chá de capim santo  ", " - o queridinho da noite ", 30f  )); 
		produtosDisponiveis.add(new Produtos(" 3 - chá de laranja  ", " - o preferido para dar mais ânimo  ", 40f )); 
		
		produtos=produtosDisponiveis;	
	}
	
	public void listarProdutos(){
	for(Produtos item : produtos)	{
		item.detalhesprodutos();
	}
	}
	public static void porQueConsumir() {
		System.out.println("                   por que consumir os chás?                   ");
		System.out.println("os chás têm diversos benefícios para a sua saúde!");
		System.out.println("auxiliam nas crises de ansiedade, melhoram o seu sono, ");
		System.out.println("contribuem para o bom funcionamento do sistema digestivo");
		System.out.println("e são excelentes para um momento de descontração e socialização!"
				+ "\nbom chá para você! :)\n\n");
				
	}
	public static void sobreNos() {
		System.out.println("                        sobre nós                            ");
		System.out.println("olá, bem-vinde! :)");
		System.out.println("somos uma loja dedicada a proporcionar experiências únicas "
				+ "\ncom uma variedade de chás de alta qualidade.");
		System.out.println("todas as ervas são orgânicas, produzidas com responsabilidade "
				+ "\ne respeito ao meio-ambiente e às pessoas. 🌱");
		System.out.println("\nesperamos que você aproveite cada "
				+ "\nmomento da experiência! e bom chá!\n\n");
	
	}
	public static void fazerCadastro() 
	{
		System.out.print("\ncrie seu cadastro e boas compras! \n");
			
		System.out.print("\nnome: ");
		String nome = leia.nextLine();
		leia.nextLine();
		
		System.out.print("\nendereço: ");
		String endereco = leia.nextLine();
		
		System.out.print("\ntelefone: ");
		String telefone = leia.nextLine();
		
		System.out.print("\ne-mail: ");
		String email = leia.nextLine();
		
		System.out.println("\ncadastro realizado com sucesso!");
	}


	
	}
	
