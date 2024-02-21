package actividad6;
import java.util.Scanner;

public class act6 {

	public static void main(String[] args) {
		double tabla, res, contador = 0;
		
		System.out.println("Tabla de multiplicar: ");
		tabla= entrada.nextDouble();
		while (contador <= 10) {
			res = tabla * contador;
			System.out.println(tabla + " * " + contador + " = " + res);
			contador++;
		}
		entrada.close();
		

	}

}
