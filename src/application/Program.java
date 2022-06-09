package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Cofre;
import model.exception.DomainException;
import model.entities.Menu;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cofre cofre = new Cofre();
		Menu menu = new Menu();

		int escolher;
		
		System.out.println("Você entrou no cofre \n");

		int loop;
		do {

			try {
				System.out.println(menu);
				System.out.print("O que você deseja? ");
				escolher = sc.nextInt();

				switch (escolher) {

				case 1:
					System.out.print("\nDigite a quantia para depositar: ");
					double depositar = sc.nextDouble();
					cofre.depositarDinheiro(depositar);
					break;
				
				case 2:
					System.out.print("\nDigite a quantia para sacar: ");
					double sacar = sc.nextDouble();
					cofre.sacarDinheiro(sacar);
					break;

				case 3:
					System.out.printf("\nDinheiro guardado: R$%.2f%n", cofre.getDinheiroGuardadoNoCofre());
					break;
					
				default:
					
					System.out.println("\nEssa opção não existe");
				}
				
			}catch (DomainException e) {
				System.out.println("Erro ao sacar: " + e.getMessage());
			} catch (RuntimeException e) {
				System.out.println("Opção indisponível" + e.getMessage());
			}
			System.out.println();
			System.out.print("Digite 0 para retornar ao menu: ");
			loop = sc.nextInt();
		} 
		while(loop == 0);
			
		sc.close();
	}

}
