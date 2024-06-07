package curso_programcao;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double valor1, valor2, total;
		
		System.out.println("Insira o codigo da primeira peça: ");
		cod1 = sc.nextInt();
		
		System.out.println("Insira a quantidade: ");
		qtd1 = sc.nextInt();
		
		System.out.println("Insira o valor por unidade: ");
		valor1 = sc.nextDouble();
		
		System.out.println("Insira o codigo da segunda peça: ");
		cod2 = sc.nextInt();
		
		System.out.println("Insira a quantidade: ");
		qtd2 = sc.nextInt();
		
		System.out.println("Insira o valor por unidade: ");
		valor2 = sc.nextDouble();
		
		total = valor1 * qtd1 + valor2 * qtd2;
		System.out.printf("VALOR A PAGAR: %.2f%n", total);
		
		sc.close();
	}

}
