package colas;

public class ColaCircular {

    private int[] cola;
    private int frente;
    private int fin;
    private int cantidad;

    public ColaCircular(int tamaño) {

        cola = new int[tamaño];

        frente = 0;
        fin = 0;
        cantidad = 0;
    }

    public boolean estaVacia() {

        return cantidad == 0;
    }

    public boolean estaLlena() {

        return cantidad == cola.length;
    }

    public void enqueue(int dato) {

        if (estaLlena()) {

            System.out.println("Cola llena");
            return;
        }

        cola[fin] = dato;

        fin = (fin + 1) % cola.length;

        cantidad++;
    }

    public void dequeue() {

        if (estaVacia()) {

            System.out.println("Cola vacia");
            return;
        }

        System.out.println("Elemento eliminado: "
                + cola[frente]);

        frente = (frente + 1) % cola.length;

        cantidad--;
    }

    public void mostrar() {

        if (estaVacia()) {

            System.out.println("Cola vacia");
            return;
        }

        int aux = frente;

        for (int i = 0; i < cantidad; i++) {

            System.out.print(cola[aux] + " ");

            aux = (aux + 1) % cola.length;
        }

        System.out.println();
    }
}
