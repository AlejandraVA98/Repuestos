//TODO Ejercicio 1 menú de un restaurante


import java.util.Scanner;

public class MenuRestaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Restaurante");
        System.out.println("1. Perro caliente");
        System.out.println("2. Hamburguesa");
        System.out.println("3. Papas fritas");
        System.out.print("Ingrese el número de su elección: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has elegido un perro caliente.");
                break;
            case 2:
                System.out.println("Has elegido una hamburguesa. ");
                break;
            case 3:
                System.out.println("Has elegido papas fritas.!");
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }

        scanner.close();
    }
}

