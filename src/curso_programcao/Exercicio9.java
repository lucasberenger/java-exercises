package curso_programcao;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int entrada, quantidade;		
		double total;
		System.out.println("Insira o código do produto: ");
		entrada = sc.nextInt();
		
		System.out.println("Insira a quantidade: ");
		quantidade = sc.nextInt();
		
		switch(entrada) {
		case 1:
			total = quantidade * 4.0;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		case 2:
			total = quantidade * 4.5;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		case 3:
			total = quantidade * 5.0;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		case 4:
			total = quantidade * 2.0;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		case 5:
			total = quantidade * 1.5;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		}
		
		sc.close();
	}

}
