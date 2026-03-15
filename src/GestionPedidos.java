public class GestionPedidos {

    private Pila pilaPrincipal;
    private Pila pilaSecundaria;

    public GestionPedidos() {
        pilaPrincipal = new Pila();
        pilaSecundaria = new Pila();
    }

    public void registrarPizza(Pizza pizza) {

        pilaPrincipal.push(pizza);

        System.out.println("Pizza registrada correctamente.");
    }

    public void deshacer() {

        if (pilaPrincipal.isEmpty()) {
            System.out.println("No hay pedidos para deshacer.");
            return;
        }

        Pizza pizza = pilaPrincipal.pop();
        pilaSecundaria.push(pizza);

        System.out.println("Pedido deshecho.");
    }

    public void rehacer() {

        if (pilaSecundaria.isEmpty()) {
            System.out.println("No hay pedidos para rehacer.");
            return;
        }

        Pizza pizza = pilaSecundaria.pop();
        pilaPrincipal.push(pizza);

        System.out.println("Pedido recuperado.");
    }

    public void mostrarActual() {

        Pizza pizza = pilaPrincipal.peek();

        if (pizza == null) {
            System.out.println("No hay pedidos.");
        } else {
            System.out.println("Pedido actual:");
            pizza.mostrarPizza();
        }
    }
}