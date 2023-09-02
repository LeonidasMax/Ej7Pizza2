import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public int size;
    public String crust;
    public String ingredients;

    public static List<Pizza> getAllPizzas() {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza(14, "integral", "queso, tomate, champiñones"));
        pizzas.add(new Pizza(16, "pan", "queso, espinacas, jamón"));
        pizzas.add(new Pizza(18, "stone", "queso, tomate, anchovies"));
        return pizzas;



    public Pizza( int size, String crust, String ingredients){
            this.size = size;
            this.crust = crust;
            this.ingredients = ingredients;


        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}