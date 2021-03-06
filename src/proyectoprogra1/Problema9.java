/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;

import javax.swing.JOptionPane;

/**
 *
 * @author fbriceno
 */
public class Problema9 {

    static int tamArreglo =10;
    static int[] notas = new int[tamArreglo];
    static int[] carne = new int[tamArreglo];
    static int posicion = 0;

    public static void main(String[] args) {

        int opcion;
        llenarArreglos();
        boolean salir = true;

        do {
            //do while para elegir opcion del meny
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite la operacion que desea realizar: " + "\n"
                        + "1- agregar nota" + "\n"
                        + "2- eliminar nota " + "\n"
                        + "3- mostrar nota" + "\n"
                        + "4- salir" + "\n"
                ));
            } while (opcion < 1 || opcion > 4);

            switch (opcion) {
                case 1:
                    agregarNotaCarne();
                    break;
                case 2:
                    eliminarNota();
                    break;
                case 3:
                    imprimirArreglo();
                    break;
                case 4:
                    salir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcion invalida");
            }
        } while (salir);

    }

    public static void llenarArreglos() {
        for (int i = 0; i < tamArreglo; i++) {
            notas[i] = 0;
            carne[i] = 0;
        }
    }

    public static void imprimirArreglo() {
        if (posicion > 0) {
            System.out.println("registro de notas y carne: ");
            for (int i = 0; i < posicion; i++) {
                System.out.println("Carne de estudiante: " + carne[i] + ", nota: " + notas[i]);
            }
        } else {
            System.out.println("No hay regitros en el sistema");
        }
    }

    public static void agregarNotaCarne() {
        if (posicion < tamArreglo) {
            notas[posicion] = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota"));
            carne[posicion] = Integer.parseInt(JOptionPane.showInputDialog("Digite el carne del estudiante"));
            posicion++;
        } else {
            System.out.println("Ya no hay espacios disponibles");
        }
    }

    public static void eliminarNota() {
        notas[posicion-1] = 0;
        carne[posicion-1] = 0;
        posicion--;
    }
}
