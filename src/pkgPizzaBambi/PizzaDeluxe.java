package pkgPizzaBambi;

class PizzaDeluxe extends Pizza {
    public PizzaDeluxe(String name) {
        super(name, new Topping("Carne", 25), new Topping("Tocino", 15));
    }

    // Sobrescribir el método prepare para imprimir un mensaje específico
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\n Ha agregado carne y tocino a la Pizza Deluxe .");
    }
}
