package curso_programcao;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		System.out.println("Insira um valor: ");
		A = sc.nextInt();
		
		System.out.println("Insira outro valor: ");
		B = sc.nextInt();
		
		if(A % 2 == 0 && B % 2 == 0) {
			System.out.println("SÃO MÚLTIPLOS!");
		}
		else {
			System.out.println("NÃO SÃO MÚLTIPLOS!");
		}
		
		sc.close();

	}

}
