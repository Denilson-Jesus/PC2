package com.mycompany.pc2_algoritmos;
import java.util.Scanner;
import listasimple.ListaSimple;
import listadoble.ListaDoble;
import listacircular.ListaCircular;
import colas.ColaCircular;
import colas.ColaLista;
import colas.ColaPrioridad;
public class PC2_ALGORITMOS {
public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaSimple listaSimple = new ListaSimple();
        ListaDoble listaDoble = new ListaDoble();
        ListaCircular listaCircular = new ListaCircular();

        ColaCircular colaCircular = new ColaCircular(5);
        ColaLista colaLista = new ColaLista();
        ColaPrioridad colaPrioridad = new ColaPrioridad();

        int opcionPrincipal;

        do {

            System.out.println("\n============================");
            System.out.println("      MENU PRINCIPAL");
            System.out.println("============================");
            System.out.println("1. Lista Simple");
            System.out.println("2. Lista Doble");
            System.out.println("3. Lista Circular");
            System.out.println("4. Operaciones Lista Simple");
            System.out.println("5. Colas");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcionPrincipal = sc.nextInt();

            switch(opcionPrincipal){

                case 1:

                    menuListaSimple(sc, listaSimple);
                    break;

                case 2:

                    menuListaDoble(sc, listaDoble);
                    break;

                case 3:

                    menuListaCircular(sc, listaCircular);
                    break;

                case 4:

                    menuOperaciones(sc, listaSimple);
                    break;

                case 5:

                    menuColas(sc,
                            colaCircular,
                            colaLista,
                            colaPrioridad);
                    break;

                case 0:

                    System.out.println("Programa finalizado");
                    break;

                default:

                    System.out.println("Opcion incorrecta");
            }

        } while(opcionPrincipal != 0);
    }

    // ==========================================
    // LISTA SIMPLE
    // ==========================================

    public static void menuListaSimple(
            Scanner sc,
            ListaSimple lista) {

        int op;
        int dato;

        do {

            System.out.println("\n--- LISTA SIMPLE ---");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("0. Volver");

            op = sc.nextInt();

            switch(op){

                case 1:

                    System.out.print("Dato: ");
                    dato = sc.nextInt();

                    lista.insertar(dato);
                    break;

                case 2:

                    System.out.print("Dato a eliminar: ");
                    dato = sc.nextInt();

                    lista.eliminar(dato);
                    break;

                case 3:

                    lista.mostrar();
                    break;
            }

        } while(op != 0);
    }

    // ==========================================
    // LISTA DOBLE
    // ==========================================

    public static void menuListaDoble(
            Scanner sc,
            ListaDoble lista){

        int op;
        int dato;

        do{

            System.out.println("\n--- LISTA DOBLE ---");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar Adelante");
            System.out.println("4. Mostrar Atras");
            System.out.println("0. Volver");

            op = sc.nextInt();

            switch(op){

                case 1:

                    System.out.print("Dato: ");
                    dato = sc.nextInt();

                    lista.insertar(dato);
                    break;

                case 2:

                    System.out.print("Dato: ");
                    dato = sc.nextInt();

                    lista.eliminar(dato);
                    break;

                case 3:

                    lista.mostrarAdelante();
                    break;

                case 4:

                    lista.mostrarAtras();
                    break;
            }

        }while(op != 0);
    }

    // ==========================================
    // LISTA CIRCULAR
    // ==========================================

    public static void menuListaCircular(
            Scanner sc,
            ListaCircular lista){

        int op;
        int dato;

        do{

            System.out.println("\n--- LISTA CIRCULAR ---");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("0. Volver");

            op = sc.nextInt();

            switch(op){

                case 1:

                    System.out.print("Dato: ");
                    dato = sc.nextInt();

                    lista.insertar(dato);
                    break;

                case 2:

                    System.out.print("Dato: ");
                    dato = sc.nextInt();

                    lista.eliminar(dato);
                    break;

                case 3:

                    lista.mostrar();
                    break;
            }

        }while(op != 0);
    }

    // ==========================================
    // OPERACIONES AVANZADAS
    // ==========================================

    public static void menuOperaciones(
            Scanner sc,
            ListaSimple lista){

        int op;

        do{

            System.out.println("\n--- OPERACIONES LISTA ---");
            System.out.println("1. Invertir");
            System.out.println("2. Detectar Ciclo");
            System.out.println("0. Volver");

            op = sc.nextInt();

            switch(op){

                case 1:

                    lista.invertir();

                    System.out.println("Lista invertida");
                    break;

                case 2:

                    if(lista.tieneCiclo()){

                        System.out.println("Existe ciclo");

                    }else{

                        System.out.println("No existe ciclo");
                    }

                    break;
            }

        }while(op != 0);
    }

    // ==========================================
    // COLAS
    // ==========================================

    public static void menuColas(
            Scanner sc,
            ColaCircular colaCircular,
            ColaLista colaLista,
            ColaPrioridad colaPrioridad){

        int op;

        do{

            System.out.println("\n--- COLAS ---");
            System.out.println("1. Cola Circular");
            System.out.println("2. Cola Lista");
            System.out.println("3. Cola Prioridad");
            System.out.println("0. Volver");

            op = sc.nextInt();

            switch(op){

                case 1:

                    colaCircular.enqueue(10);
                    colaCircular.enqueue(20);
                    colaCircular.enqueue(30);

                    colaCircular.mostrar();
                    break;

                case 2:

                    colaLista.enqueue(10);
                    colaLista.enqueue(20);
                    colaLista.enqueue(30);

                    colaLista.mostrar();
                    break;

                case 3:

                    colaPrioridad.insertar(30);
                    colaPrioridad.insertar(10);
                    colaPrioridad.insertar(20);

                    colaPrioridad.mostrar();
                    break;
            }

        }while(op != 0);
    }
}
}
