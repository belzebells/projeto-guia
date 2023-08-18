package lojaCha;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import lojaCha.util.Cores;
import lojaCha.model.Produtos;
import java.util.ArrayList;
import lojaCha.model.*;

public class Menu {

	private static Scanner leia = new Scanner(System.in);
	private static ArrayList<Produtos>produtosDisponiveis;
	public static void main(String[] args) {

		int opcao = 0;
		ProdutoController lojaCha = new ProdutoController();
		lojaCha.inicializarprodutos();

		while (true) {
			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_GREEN_BACKGROUND_BRIGHT
			        + "___________________________________________________________");
			System.out.println("___________________________________________________________");
			System.out.println("                                                           ");
			System.out.println("                     é hora do chá!                        ");
			System.out.println("                                                           ");
			System.out.println("***********************************************************");
			System.out.println("                                                           ");
			System.out.println("                     1 - fazer cadastro                    ");
			System.out.println("                     2 - escolher sabores                  ");
			System.out.println("                     3 - pagamento                         ");
			System.out.println("                     4 - sobre nós                         ");
			System.out.println("                     5 - por que consumir?                 ");
			System.out.println("                     6 - sair                              ");
			System.out.println("                                                           ");
			System.out.println("***********************************************************");
			System.out.println("                                                           ");
			System.out.println("    digite a opção desejada e aproveite o seu chá!         ");
			System.out.println("                                                           ");
			System.out.println("___________________________________________________________" + Cores.TEXT_RESET);
			

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\ndigite um valor inteiro!");
				leia.nextLine();
				opcao = 0;
			}
			if (opcao == 6) {
				System.out.println(
						Cores.TEXT_WHITE_BOLD + "\nagradecemos o interesse em conhecer os nossos chás!");
				opcao = leia.nextInt();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				lojaCha.fazerCadastro();
				break;

			case 2:
				System.out.println(Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND
						+ "sabores disponíveis para a sua hora do chá:  \n");
				lojaCha.listarProdutos();
				System.out.println("\ninforme o número do sabor que você vai querer  ");
				int numeroCha = leia.nextInt();
				switch (numeroCha) {
				case 1:
					System.out.println("você escolheu o chá de camomila.  \n"
							 + "sua compra ficou no valor de R$10,00.  ");
				break;
				case 2:
					System.out.println("você escolheu o chá de campim santo.  \n"
							 + "sua compra ficou no valor de R$30,00.   ");
				break;

				case 3: 
					System.out.println("você escolheu o chá de laranja.  \n"
							 + "sua compra ficou no valor de R$40,00.   ");
				break;
				}
				break;

			case 3:
				System.out.println(Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND
						+"escolha a sua forma de pagamento: ");
				System.out.println(" 1 - dinheiro ");
				System.out.println(" 2 - pix ");
				System.out.println(" 3 - cartão ");
				
			int pagamentoCha = leia.nextInt();
			switch(pagamentoCha) {
			case 1:
				System.out.println(" pagamento no dinheiro realizado com sucesso! ");
			break;
			
			case 2:
				System.out.println(" pagamento no pix realizado com sucesso! ");
			break;
			
			case 3:
				System.out.println(" pagamento no cartão realizado com sucesso! ");
			break;
			}
			break;
			
			case 4:
				lojaCha.sobreNos();
				break;

			case 5:
				lojaCha.porQueConsumir();
				break;
							
			case 6:
				System.out.println("encerrando o programa. até logo! ");
				leia.close();
				System.exit(0);

			default:
				System.out.println("opção inválida. tente novamente. ");
				break;
			}
		}
	} 	  	  	
   	
	private static void pressioneEnter() {
		try {
			System.out.println("\npressione enter para continuar... ");
			System.in.read();
		} catch (IOException e) {
			System.out.println("você pressionou uma tecla diferente de enter! ");
		}
	}
	
	}

