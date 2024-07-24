package FactoryMethod;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Sliced Pepperoni");
    }

    void cut() {
        System.out.println("Cutting the pizza into triangular slices");
    }
}

//GONZÁLEZ HERNÁNDEZ YAEL GUILLERMO
//PATRONES DE DISEÑO DE SOFTWARE