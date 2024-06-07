package curso_programcao;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor inteiro:");
		int n1 = sc.nextInt();
		
		System.out.println("Insira outro valor inteiro:");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		System.out.println("SOMA: " + soma);
		
		sc.close();
	}
}
