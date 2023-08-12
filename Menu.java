package conta;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// teste da classe conta
		Conta c1 = new Conta(0, 666, 9, "antônia", 50000.0f);
		c1.visualizar();
		c1.sacar(24000.0f);
		c1.visualizar();
		c1.depositar(8000.0f);
		c1.visualizar();
		
		// teste da classe conta corrente
		ContaCorrente cc1 = new ContaCorrente(8, 323, 4, "jorge", 90000.0f);
		cc1.visualizar();
		cc1.sacar(35000.0f);
		cc1.visualizar();
		cc1.depositar(9000.0f);
		cc1.visualizar();
				
		// teste da classe conta poupança
		ContaPoupanca cp1 = new ContaPoupanca(7, 606, 1, "brigitte do pedal", 890000.0f, 04);
		cp1.visualizar();
		cp1.sacar(88000.0f);
		cp1.visualizar();
		cp1.depositar(3000.0f);
		cp1.visualizar();

		Scanner leia = new Scanner(System.in);

		int opcao;

		// inserir dados do loop, onde ficará o menu

		while (true) {

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
			System.out.println("                                                         ");

			opcao = leia.nextInt();

			// opção 9 - saída do loop
			if (opcao == 9) {
				System.out.println("\nbanco do brazil com z - o seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\ncriar conta\n\n");
				break;

			case 2:
				System.out.println("\nlistar todas as contas\n\n");
				break;

			case 3:
				System.out.println("\nbuscar conta por número\n\n");
				break;

			case 4:
				System.out.println("\natualizar dados da conta\n\n");
				break;

			case 5:
				System.out.println("\napagar conta\n\n");
				break;

			case 6:
				System.out.println("\nsacar\n\n");
				break;

			case 7:
				System.out.println("\ndepositar\n\n");
				break;

			case 8:
				System.out.println("\ntransferir valores entre contasn\n");
				break;

			default:
				System.out.println("\nopção inválida!\n");
				break;

			}

		}
	}
}