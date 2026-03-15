public class Pila {

    private Nodo tope;

    public Pila() {
        tope = null;
    }

    public void push(Pizza pizza) {

        Nodo nuevo = new Nodo(pizza);

        nuevo.siguiente = tope;

        tope = nuevo;
    }

    public Pizza pop() {

        if (isEmpty()) {
            return null;
        }

        Pizza dato = tope.dato;

        tope = tope.siguiente;

        return dato;
    }

    public Pizza peek() {

        if (isEmpty()) {
            return null;
        }

        return tope.dato;
    }

    public boolean isEmpty() {
        return tope == null;
    }
}