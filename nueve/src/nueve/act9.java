package nueve;

import java.util.Scanner;

public class act9 {

	public static void main(String[] args) {
		int opcion = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Manu para calcular area de figuras planas");
		System.out.println("1. Area de un cuadrado");
		System.out.println("2. Area de un triangulo");
		System.out.println("3. Area de un circulo");
		System.out.println("Escribe el numero de la opcion que desees");
		opcion = entrada.nextInt();

		switch (opcion) {
		case 1: {

			double area, lado;
			System.out.println("-----seleccionaste calcular el area de un cuadrado-----");
			System.out.println("Escribe la medida de un lado");
			lado = entrada.nextInt();
			area = lado * lado;
			System.out.println("El area del cuadrado es: " + (lado * lado));

		}
			break;
		case 2: {
			double base, altura, area;
			System.out.println("-----seleccionaste calcular el area de un triangulo-----");
			System.out.println("Escribe la medida de la base");
			base = entrada.nextInt();
			System.out.println("Escribe la medida de la altura");
			altura = entrada.nextInt();
			area = (base * altura) / 2;
			System.out.println("El area del triangulo es: " + (base * altura) / 2);
		}
			break;
		case 3: {
			double radio, area;
			System.out.println("-----seleccionaste calcular el area de un circulo-----");
			System.out.println("Escribe la medida del radio");
			radio = entrada.nextInt();
			area = 3.1416 * (radio * radio);
			System.out.println("El area del circulo es: " + (3.1416 * (radio * radio)));
			}

		}

	}
}
