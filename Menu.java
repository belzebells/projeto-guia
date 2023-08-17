package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;


public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaController contas = new ContaController();
				
		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario, numeroDestino; 
		String titular;
		float saldo, limite,valor;
		
		
		System.out.println("\ncriar contas\n");
				
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "joão da silva", 1000f, 100.0f);
		contas.cadastrar(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "maria da silva", 2500f, 900.0f);
		contas.cadastrar(cc2);
		
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 323, 2, "claudinha claudia", 4000f, 225);
		contas.cadastrar(cp1);
		
		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 323, 2, "márcia olívia", 2000f, 250);
		contas.cadastrar(cp2);
		
		contas.listarTodas();
		
		
		// inserir dados do loop, onde ficará o menu

		while (true) {
			
			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_GREEN_BACKGROUND_BRIGHT); 
			
			System.out.println("---------------------------------------------------------");
			System.out.println("                                                         ");
			System.out.println("                                                         ");
			System.out.println("------------------BANCO DO BRAZIL COM Z------------------");
			System.out.println("                                                         ");
			System.out.println("                                                         ");
			System.out.println("               1 - criar conta                           ");
			System.out.println("               2 - listar todas as contas                ");
			System.out.println("               3 - buscar conta por número               ");
			System.out.println("               4 - atualizar dados da conta              ");
			System.out.println("               5 - apagar conta                          ");
			System.out.println("               6 - sacar                                 ");
			System.out.println("               7 - depositar                             ");
			System.out.println("               8 - transferir valores entre contas       ");
			System.out.println("               9 - sair                                  ");
			System.out.println("                                                         ");
			System.out.println("                                                         ");
			System.out.println("---------------------------------------------------------");
			System.out.println("entre com a opção desejada:                              ");
			System.out.println("                                                         " + Cores.TEXT_RESET);
				
				try {
			opcao = leia.nextInt();
				} catch(InputMismatchException e) {
					System.out.println("\ndigite valores inteiros!");
					leia.nextLine();
					opcao=0;
				}
			// opção 9 - saída do loop
			if (opcao == 9) {
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\nbanco do brazil com z - o seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}

		switch (opcao) {
		case 1:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\ncriar conta\n");
				
				System.out.println("\ndigite o número da agência: ");
				agencia = leia.nextInt();
				System.out.println("\ndigite o nome da pessoa titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();
							
			do {
				System.out.println("\ndigite um tipo de conta:(1-CC ou 2-CP) ");
				tipo = leia.nextInt();
				}while(tipo < 1 && tipo > 2);
				
			System.out.println("digite o saldo da conta (R$) ");
			saldo = leia.nextFloat();
				
			switch(tipo) {
				case 1 -> {
					System.out.println("digite o limite do crédito (R$): ");
					limite = leia.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
					System.out.println("digite o dia do aniversário da conta: ");
					aniversario = leia.nextInt();
					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
					}
				} 
				keyPress();
				break;
								
			case 2:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\nlistar todas as contas\n");
				contas.listarTodas();
				keyPress();
				break;

			case 3:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\nconsultar dados da conta - por número\n");
				System.out.println("digite o número da conta: ");
				numero = leia.nextInt();
				contas.procurarPorNumero(numero);
				keyPress();
				break;

			case 4:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\natualizar dados da conta\n");
				
				System.out.println("digite o número da conta: ");
				numero = leia.nextInt();
				
				if(contas.buscarNaCollection(numero) !=null ) {
					System.out.println("digite o número da agência: ");
					agencia = leia.nextInt();
					System.out.println("digite o nome do titular: ");
					leia.skip("\\R?");
					titular = leia.nextLine();
					
					System.out.println("digite o saldo da conta: (R$): ");
					saldo = leia.nextFloat();
					
					tipo = contas.retornaTipo(numero);
					
					
					switch(tipo) {
					case 1-> {
						System.out.println("digite o limite do crédito (R$): ");
						limite = leia.nextFloat();
						contas.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
					} 
					case 2-> {
						System.out.println("digite o dia do aniversário da conta: ");
						aniversario = leia.nextInt();
						contas.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
					}
					default -> {
						System.out.println("tipo de conta inválido!");
					}
										}
			} else 
			System.out.println("\nconta não encontrada!");
			keyPress();
			break; 
						
			case 5:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\napagar conta\n");
				System.out.println("digite o número da conta: ");
				numero = leia.nextInt();	
				contas.deletar(numero);
				keyPress();
				break;

			case 6:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\nsacar\n");
				System.out.println("digite o número da conta: ");
				numero  =leia.nextInt();
				
				do {
					System.out.println("digite o valor do saque (R$): ");
					valor = leia.nextFloat();
				} while(valor <= 0);
				contas.sacar(numero, valor);
				keyPress();
				break;
	
			case 7:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\ndepósito\n");
				System.out.println("digite o número da conta: ");
				numero = leia.nextInt();
				
				do { 
					System.out.println("digite o valor do depósito (R$): ");
					valor = leia.nextFloat();
				}while(valor <= 0);
				contas.depositar(numero, valor);
				keyPress();
				break;

			case 8:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\ntransferir valores entre contas\n");
				
				System.out.println("\ndigite o número da conta de origem: ");
				numero = leia.nextInt();
				System.out.println("\ndigite o número da conta de destino: ");
				numeroDestino = leia.nextInt();
				
				do {
					System.out.println("digite o valor da transferência (R$): ");
					valor = leia.nextFloat();
				}while(valor <= 0);
				
				contas.transferir(numero, numeroDestino, valor);
			
				keyPress();
				break;
				

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nopção inválida!\n" + Cores.TEXT_RESET);
				keyPress();
				break; 
			}
		}
	} 

	private static void keyPress() {
		
		 try {

			System.out.println(Cores.TEXT_RESET + "\npressione enter para continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("você pressionou uma tecla diferente de enter!");
	}
}
		}
	
	