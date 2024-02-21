package actividad4;
import java.util.Scanner;

public class act4 {

	public static void main(String[] args) {
		int num1, num2,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		num1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = sc.nextInt();
		
		res = num1 + num2;
		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + res);
		sc.close();

	}

}
