package curso_programcao;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Insira o valor de A: ");
		A = sc.nextDouble(); 
		System.out.println("Insira o valor de B: ");
		B = sc.nextDouble(); 
		System.out.println("Insira o valor de C: ");
		C = sc.nextDouble(); 
		
		triangulo = A * C /2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		
		
		sc.close();
		
	}

}
