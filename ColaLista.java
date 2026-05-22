package colas;

public class ColaLista {

    private Nodo frente;
    private Nodo fin;

    private class Nodo {

        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    public ColaLista() {

        frente = null;
        fin = null;
    }

    public void enqueue(int dato) {

        Nodo nuevo = new Nodo(dato);

        if (frente == null) {

            frente = nuevo;
            fin = nuevo;

        } else {

            fin.siguiente = nuevo;

            fin = nuevo;
        }
    }

    public void dequeue() {

        if (frente == null) {

            System.out.println("Cola vacia");
            return;
        }

        System.out.println(
                "Elemento eliminado: "
                + frente.dato);

        frente = frente.siguiente;

        if (frente == null) {

            fin = null;
        }
    }

    public void mostrar() {

        Nodo aux = frente;

        while (aux != null) {

            System.out.print(aux.dato + " ");

            aux = aux.siguiente;
        }

        System.out.println();
    }
}