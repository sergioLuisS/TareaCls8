package pkgPizzaBambi;

class PizzaVegan extends Pizza {
    public PizzaVegan(String name) {
        super(name, new Topping("Zanahoria", 10), new Topping("Tomate", 8));
    }

    // Sobrescribir el método prepare para imprimir un mensaje específico
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\nSe han agregado zanahoria y tomate a la Pizza Vegan.");
    }
}