package actividad5;
import java.util.Scanner;

public class Act5 {

	public static void main(String[] args) {
		double num1, num2,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		num1 = sc.nextDouble();
		System.out.println("Introduce el segundo número: ");
		num2 = sc.nextDouble();
		
		res = num1 - num2;
		System.out.println("La resta de " + num1 + " y " + num2 + " es: " + res);
		sc.close();
		

	}

}
