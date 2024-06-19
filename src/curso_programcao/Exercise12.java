package curso_programcao;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;


public class Exercise12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Insert student's name: ");
		student.name = sc.nextLine();
		System.out.println("Insert first grade: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Insert second grade: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Insert third grade: ");
		student.grade3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + student.finalGrade());
		
		if(student.missingPoints() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
		
	}
	
}
		
		
		
		
		
		
		
