import java.util.Scanner;

public class PizzaMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona los elementos de tu pizza:");
        System.out.println("1. Masa de pizza (40 dólares)");
        System.out.println("2. Salsa de tomate");
        System.out.println("3. Queso rallado");
        System.out.println("4. Champiñones");
        System.out.println("5. Salchicha");
        System.out.println("6. Pepperoni");
        System.out.println("7. Verduras (p. ej., cebolla, pimiento, tomate)");
        System.out.println("8. Especias (p. ej., orégano, albahaca)");

        int selection = scanner.nextInt();

        switch (selection) {
            case 1:
                // Selección de masa de pizza
                System.out.println("Masa de pizza: $40");
                break;
            case 2:
                // Selección de salsa de tomate
                System.out.println("Salsa de tomate: +$5");
                break;
            case 3:
                // Selección de queso rallado
                System.out.println("Queso rallado: +$8");
                break;
            case 4:
                // Selección de champiñones
                System.out.println("Champiñones: +$10");
                break;
            case 5:
                // Selección de salchicha
                System.out.println("Salchicha: +$12");
                break;
            case 6:
                // Selección de pepperoni
                System.out.println("Pepperoni: +$15");
                break;
            case 7:
                // Selección de verduras
                String veggies = scanner.nextLine();
                System.out.println("Verduras: +$" + (veggies.equals("cebolla") ? 5 : veggies.equals("pimiento") ? 8 : veggies.equals("tomate") ? 10 : 0));
                break;
            case 8:
                // Selección de especias
                String spices = scanner.nextLine();
                System.out.println("Especias: +$" + (spices.equals("orégano") ? 2 : spices.equals("albahaca") ? 3 : 0));
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        double totalPrice = 40 + (selection == 1 ? 0 : selection * 2);
        System.out.println("Precio total: " + totalPrice);
    }
}

