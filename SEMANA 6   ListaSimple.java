package listasimple;

public class ListaSimple {

    private Nodo cabeza;

    public ListaSimple() {
        cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertar(int dato) {

        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {

            cabeza = nuevo;

        } else {

            Nodo aux = cabeza;

            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }

            aux.setSiguiente(nuevo);
        }
    }

    public void mostrar() {

        if (cabeza == null) {

            System.out.println("Lista vacia");
            return;
        }

        Nodo aux = cabeza;

        while (aux != null) {

            System.out.print(aux.getDato() + " -> ");

            aux = aux.getSiguiente();
        }

        System.out.println("NULL");
    }

    public void eliminar(int dato) {

        if (cabeza == null) {
            System.out.println("Lista vacia");
            return;
        }

        if (cabeza.getDato() == dato) {

            cabeza = cabeza.getSiguiente();

            System.out.println("Dato eliminado");
            return;
        }

        Nodo actual = cabeza;

        while (actual.getSiguiente() != null &&
                actual.getSiguiente().getDato() != dato) {

            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {

            actual.setSiguiente(
                    actual.getSiguiente().getSiguiente()
            );

            System.out.println("Dato eliminado");

        } else {

            System.out.println("Dato no encontrado");
        }
    }
public void invertir() {

    Nodo anterior = null;
    Nodo actual = cabeza;
    Nodo siguiente;

    while (actual != null) {

        siguiente = actual.getSiguiente();

        actual.setSiguiente(anterior);

        anterior = actual;

        actual = siguiente;
    }

    cabeza = anterior;
}
public boolean tieneCiclo() {

    Nodo lento = cabeza;
    Nodo rapido = cabeza;

    while (rapido != null &&
           rapido.getSiguiente() != null) {

        lento = lento.getSiguiente();

        rapido = rapido.getSiguiente()
                       .getSiguiente();

        if (lento == rapido) {

            return true;
        }
    }

    return false;
}
public ListaSimple fusionar(ListaSimple otra) {

    ListaSimple nueva = new ListaSimple();

    Nodo a = this.cabeza;
    Nodo b = otra.cabeza;

    while (a != null && b != null) {

        if (a.getDato() <= b.getDato()) {

            nueva.insertar(a.getDato());

            a = a.getSiguiente();

        } else {

            nueva.insertar(b.getDato());

            b = b.getSiguiente();
        }
    }

    while (a != null) {

        nueva.insertar(a.getDato());

        a = a.getSiguiente();
    }

    while (b != null) {

        nueva.insertar(b.getDato());

        b = b.getSiguiente();
    }

    return nueva;
}

}
