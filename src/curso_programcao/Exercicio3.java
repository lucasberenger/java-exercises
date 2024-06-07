package curso_programcao;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id, horas;
		double valorHora, salario;
		
		System.out.println("Insira o numero do funcionario: ");
		id = sc.nextInt();
		
		System.out.println("Insira o numero de horas trabalhadas: ");
		horas = sc.nextInt();
		
		System.out.println("Insira o valor/hora: ");
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("NUMBER = " + id);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}
	
}
		
		

