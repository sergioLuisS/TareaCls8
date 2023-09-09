package pkgPizzaBambi;

class PizzaOriente extends Pizza {
    public PizzaOriente(String name) {
        super(name, new Topping("Salsa Buffalo", 15), new Topping("Queso Especial", 25));
    }

    // Sobrescribir el método prepare para imprimir un mensaje específico
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\nSe ha agregado Salsa Buffalo y Queso Especial a la pizza Oriente.");
    }
}
