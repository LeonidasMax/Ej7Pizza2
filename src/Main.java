import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al menú de pizzas!");
        System.out.println(" Por favor, seleccione una opción:");
        System.out.println(" 1. Crear una nueva pizza");
        System.out.println(" 2. Ver lista de pizzas");
        System.out.println(" 3. Salir");

        int selection = scanner.nextInt();

        switch (selection) {
            case 1:
                createNewPizza();
                break;
            case 2:
                viewPizzaList();
                break;
            case 3:
                exitProgram();
                break;
            default:
                System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                break;
        }
    }

    private static void createNewPizza() {
        System.out.print("Ingrese el tamaño de la pizza: ");
        Scanner scanner2 = new Scanner(System.in);
        int size = scanner2.nextInt();

        System.out.print("Ingrese el tipo de masa: ");
        String crust = scanner2.nextLine();
        System.out.print("Ingrese los ingredientes: ");
        String ingredients = scanner2.nextLine();

        Pizza pizza = new Pizza(size, crust, ingredients);
        System.out.println("Pizza creada con éxito!");
    }

    private static boolean validatePizzaValues(int size, String crust, String ingredients) {
        // Aquí puedes agregar la lógica para validar los valores
        // Por ejemplo, podrías verificar si el tamaño es mayor que cero y menor o igual que el tamaño máximo,
        // si la corteza es una de las opciones permitidas, etc.
        return true; // Si los valores son correctos, devuelve true
    }

    private static void viewPizzaList() {
        System.out.println("Lista de pizzas:");
        for (Pizza pizza : Pizza.getAllPizzas(validatePizzaValues(14, "integral", "queso, tomate, champiñones"))) {
            System.out.println(pizza.toString());
        }
    }

    private static void exitProgram() {
        System.out.println("Adiós!");
    }
}