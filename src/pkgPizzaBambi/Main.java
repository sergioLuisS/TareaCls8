package pkgPizzaBambi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("\t\t Bienvenido a la Pizzería Bambinos 2.0 ");


        System.out.println("\n DATOS CLIENTE");
        System.out.print("\nIngrese un Nombre: ");
        String nombre = scanner.nextLine();


        while (true) {
            System.out.println("\nSeleccione el tipo de pizza que desea crear:");
            System.out.println("1. Pizza Deluxe");
            System.out.println("2. Pizza Oriente");
            System.out.println("3. Pizza Pepperoni");
            System.out.println("4. Pizza Vegan");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción:  ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            if (opcion == 0) {
                break;
            }

            Pizza pizza = null;
            String size;
            double priceMultiplier = 1.0; // Por defecto, tamaño pequeño

            switch (opcion) {
                case 1:
                    pizza = new PizzaDeluxe("Pizza Deluxe");
                    break;
                case 2:
                    pizza = new PizzaOriente("Pizza Oriente");
                    break;
                case 3:
                    pizza = new PizzaPepperoni("Pizza Pepperoni");
                    break;
                case 4:
                    pizza = new PizzaVegan("Pizza Vegan");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    continue; // Continuar con el siguiente ciclo
            }

            System.out.println("\nSeleccione el tamaño de la pizza:");
            System.out.println("1. Pequeña");
            System.out.println("2. Mediana");
            System.out.println("3. Grande");
            System.out.print("Ingrese el tamaño de tu Pizza: ");

            int sizeOption = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (sizeOption) {
                case 1:
                    size = "Pequeña";
                    break;
                case 2:
                    size = "Mediana";
                    priceMultiplier = 1.2; // Aumentar el precio en un 20% para tamaño mediano
                    break;
                case 3:
                    size = "Grande";
                    priceMultiplier = 1.35; // Aumentar el precio en un 35% para tamaño grande
                    break;
                default:
                    size = "Pequeña"; // Tamaño predeterminado en caso de opción no válida
                    break;
            }

            pizza.setSize(size);
            pizza.prepare();
            double pizzaPrice = pizza.getPizzaPrice() * priceMultiplier;
            System.out.println("\n*** DATOS DE LA ORDEN ***");
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio de la Pizza: " + pizzaPrice);
        }

        scanner.close();
    }
}