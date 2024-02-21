package Actividad8;
//sabino andres manuel alejandro
//20211841

import java.util.Scanner;

public class acti811 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero1, numero2, resultado;
		String opccion;
		Scanner entrada = new Scanner(System.in);

		// ciclo dp-while
		do {
			// entrada de datos
			System.out.println("Ingrese el primer numero: ");
			numero1 = entrada.nextDouble();
			System.out.println("Ingrese el segundo numero: ");
			numero2 = entrada.nextDouble();

			// PROCEDIMIENTO
			resultado = numero1 * numero2;
			
			// imprecion de resultados
			System.out.println("El resultado de la multiplicacion es: " + resultado);
			
			resultado = numero1 / numero2;
			System.out.println("El resultado de la division es: " + resultado);
			
			resultado = numero1 + numero2;
			System.out.println("El resultado de la suma es: " + resultado);
			
			resultado = numero1 - numero2;
			System.out.println("El resultado de la resta es: " + resultado);
			
			

			// preguntamos al usuario si requiere hacer otra operacion
			System.out.println("Desea realizar otra operacion? (si/no)");
			opccion = entrada.next();
		} while (opccion.equals("si") || opccion.equals("SI") || opccion.equals("Si"));
		entrada.close();
		// fin del ciclo do-while
	}

}
