package listadoble;

public class ListaDoble {

    private NodoDoble inicio;

    public ListaDoble() {
        inicio = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void insertar(int dato) {

        NodoDoble nuevo = new NodoDoble(dato);

        if (inicio == null) {

            inicio = nuevo;

        } else {

            NodoDoble aux = inicio;

            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }

            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
        }
    }

    public void mostrarAdelante() {

        NodoDoble aux = inicio;

        while (aux != null) {

            System.out.print(aux.getDato() + " <-> ");

            aux = aux.getSiguiente();
        }

        System.out.println("NULL");
    }

    public void mostrarAtras() {

        if (inicio == null) {
            return;
        }

        NodoDoble aux = inicio;

        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();
        }

        while (aux != null) {

            System.out.print(aux.getDato() + " <-> ");

            aux = aux.getAnterior();
        }

        System.out.println("NULL");
    }

    public void eliminar(int dato) {

        if (inicio == null) {
            return;
        }

        NodoDoble actual = inicio;

        while (actual != null &&
                actual.getDato() != dato) {

            actual = actual.getSiguiente();
        }

        if (actual == null) {
            return;
        }

        if (actual == inicio) {

            inicio = actual.getSiguiente();

            if (inicio != null) {
                inicio.setAnterior(null);
            }

            return;
        }

        if (actual.getAnterior() != null) {
            actual.getAnterior()
                    .setSiguiente(actual.getSiguiente());
        }

        if (actual.getSiguiente() != null) {
            actual.getSiguiente()
                    .setAnterior(actual.getAnterior());
        }
    }
}