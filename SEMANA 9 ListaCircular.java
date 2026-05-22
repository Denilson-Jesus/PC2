package listacircular;

public class ListaCircular {

    private NodoCircular ultimo;

    public ListaCircular() {
        ultimo = null;
    }

    public boolean estaVacia() {
        return ultimo == null;
    }

    public void insertar(int dato) {

        NodoCircular nuevo = new NodoCircular(dato);

        if (ultimo == null) {

            ultimo = nuevo;
            ultimo.setSiguiente(ultimo);

        } else {

            nuevo.setSiguiente(ultimo.getSiguiente());

            ultimo.setSiguiente(nuevo);

            ultimo = nuevo;
        }
    }

    public void mostrar() {

        if (ultimo == null) {

            System.out.println("Lista vacia");
            return;
        }

        NodoCircular aux = ultimo.getSiguiente();

        do {

            System.out.print(aux.getDato() + " -> ");

            aux = aux.getSiguiente();

        } while (aux != ultimo.getSiguiente());

        System.out.println("(inicio)");
    }

    public void eliminar(int dato) {

        if (ultimo == null) {
            return;
        }

        NodoCircular actual = ultimo.getSiguiente();
        NodoCircular anterior = ultimo;

        do {

            if (actual.getDato() == dato) {

                if (actual == ultimo &&
                    actual == ultimo.getSiguiente()) {

                    ultimo = null;
                }

                else {

                    anterior.setSiguiente(
                            actual.getSiguiente());

                    if (actual == ultimo) {
                        ultimo = anterior;
                    }
                }

                return;
            }

            anterior = actual;
            actual = actual.getSiguiente();

        } while (actual != ultimo.getSiguiente());

        System.out.println("Dato no encontrado");
    }
}
