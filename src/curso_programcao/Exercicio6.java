package curso_programcao;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int entrada;
		
		System.out.println("Insira um número inteiro: ");
		entrada = sc.nextInt();
		if(entrada < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("POSITIVO");
		}
	}

}
