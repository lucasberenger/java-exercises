package curso_programcao;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int entrada;
		
		System.out.println("Insira um valor: ");
		entrada = sc.nextInt();
		if(entrada % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
	}

}
