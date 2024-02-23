package ActividadIntegradoraI;
import java.util.Scanner;

public class AI1 {
    private static final double GRAVEDAD = 9.8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona una opción:");
        System.out.println("1. Calcular IMC");
        System.out.println("2. Calcular velocidad");
        System.out.println("3. Calcular altura en caída libre");
        System.out.println("4. Calcular tiempo en caída libre");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Introduce peso en kg:");
                double peso = scanner.nextDouble();
                System.out.println("Introduce estatura en metros:");
                double estatura = scanner.nextDouble();
                System.out.println("El IMC es: " + calcularIMC(peso, estatura));
                break;
            case 2:
                System.out.println("Introduce distancia en metros:");
                double distancia = scanner.nextDouble();
                System.out.println("Introduce tiempo en segundos:");
                double tiempo = scanner.nextDouble();
                System.out.println("La velocidad es: " + calcularVelocidad(distancia, tiempo));
                break;
            case 3:
                System.out.println("Introduce velocidad final en m/s:");
                double velocidadFinal = scanner.nextDouble();
                System.out.println("Introduce velocidad inicial en m/s:");
                double velocidadInicial = scanner.nextDouble();
                System.out.println("La altura es: " + calcularAltura(velocidadFinal, velocidadInicial));
                break;
            case 4:
                System.out.println("Introduce velocidad final en m/s:");
                double velocidadFinal2 = scanner.nextDouble();
                System.out.println("El tiempo es: " + calcularTiempo(velocidadFinal2));
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

        scanner.close();
    }

    public static double calcularIMC(double peso, double estatura) {
        return peso / (estatura * estatura);
    }

    public static double calcularVelocidad(double distancia, double tiempo) {
        return distancia / tiempo;
    }

    public static double calcularAltura(double velocidadFinal, double velocidadInicial) {
        return ((velocidadFinal * velocidadFinal) - (velocidadInicial * velocidadInicial)) / (2 * GRAVEDAD);
    }

    public static double calcularTiempo(double velocidadFinal) {
        return velocidadFinal / GRAVEDAD;
    }
}
