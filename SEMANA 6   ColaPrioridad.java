package colas;

import java.util.PriorityQueue;

public class ColaPrioridad {

    private PriorityQueue<Integer> cola;

    public ColaPrioridad() {

        cola = new PriorityQueue<>();
    }

    public void insertar(int dato) {

        cola.add(dato);
    }

    public void atender() {

        if (cola.isEmpty()) {

            System.out.println("Cola vacia");
            return;
        }

        System.out.println(
                "Atendido: "
                + cola.poll());
    }

    public void mostrar() {

        System.out.println(cola);
    }
}
