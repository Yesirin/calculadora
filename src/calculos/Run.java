package calculos;

import logica.Operaciones;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = (int) scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Crear una instancia de la clase Operaciones
        Operaciones operaciones= new Operaciones(numero1, numero2); // instanciomos el constructor

        System.out.println("Seleccione la operación que desea hacer: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion = scanner.nextInt();

        double resultado;
        switch (opcion) {
            case 1:
                resultado = operaciones.sumar();
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = operaciones.restar();
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = operaciones.multiplicar();
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                try {
                    resultado = operaciones.dividir();
                    System.out.println("El resultado de la división es: " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Opción no válida, seleccione una opcion correcta.");
        }

        scanner.close();
        scanner.Enter.close();
    }

}
