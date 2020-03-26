package util;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import entidades.Cliente;
import entidades.FormaPagamento;

public class Leitor {
	
	private static String nome, endereco;
	private static int pagamento;
	static Integer repetir = 1;
	private static List<Cliente> cliente = new ArrayList<>();
	
	public static void leitura () {
		Scanner sc = new Scanner(System.in);
		
		do {
			
				try {
				
					System.out.println("\nCadastro de Clientes");
					System.out.println("Nome: ");
					nome = sc.nextLine();
					sc.nextLine();
					System.out.println("Endereço: ");
					endereco = sc.nextLine();
					sc.nextLine();
					System.out.println("Selecione uma das Formas de Pagamento Disponiveis\n20-Visa \n50-MasterCard \n30-Boleto \nDigite o Código da Forma de Pagamento: ");
					pagamento = sc.nextInt();
					sc.nextLine();
					
					
					cliente.add(new Cliente(nome, endereco, FormaPagamento.ValorDe(pagamento)));
				System.out.println("Deseja Cadastrar Outro Cliente? 1-Sim, 2-Não: ");
				repetir = sc.nextInt();
			/*}catch (NullPointerException e) {
				System.out.println("Dado Nulo! Tente Novamente! ");
				continue;*/
			}catch (InputMismatchException e) {
				System.out.println("Entrada Invalida! Tente Novamente!" );
				continue;
			}catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				continue;
			
			}
		}while (repetir != 2 );		
		
		sc.close();
			
	}
	
	public static void Dados () {
		for (Cliente cl: cliente) {
			System.out.println(cl.toString());
		
		}
	
	
	}
	
}
