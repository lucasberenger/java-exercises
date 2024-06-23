package curso_programcao;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;


public class Exercicio13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double precoDollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double quantidade = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.calcIof(quantidade, precoDollar));
		
		sc.close();

	}

}
