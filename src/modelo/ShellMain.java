/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;

import java.util.Arrays;

class Shell {
    public static void sort(Comparable[] a) {
        int n = a.length;
        int h = n / 2;

        while (h >= 1) {
            System.out.println("TRABAJANDO CON INTERVALO h = " + h);

            for (int i = h; i < n; i++) {
                for (int j = i; j >= h; j -= h) {
                    System.out.println("Comparando pos " + j + " (" + a[j] + ") con pos " + (j - h) + " (" + a[j - h] + ")");

                    if (less(a[j], a[j - h])) {
                        System.out.println("Intercambio: " + a[j] + " con " + a[j - h]);
                        exch(a, j, j - h);
                        System.out.print("Arreglo actual: ");
                        show(a);
                    } else {
                        System.out.println("En orden correcto, no se intercambia.");
                        break;
                    }
                }
            }

            System.out.println("\nResultado tras h = " + h + ":");
            show(a);
            System.out.println();

            h = h / 2;
        }
    }

    // Método auxiliar privado para comparar dos elementos
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    
    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    private static void show(Comparable[] a) {
        System.out.println(Arrays.toString(a));
    }
}

public class ShellMain {

    public static void main(String[] args) {
        Integer[] arreglo = {23, 4, 5, 12, 65, 2, 9, 7};

        System.out.println("            ORDENAMIENTO SHELL            ");
        System.out.print("Arreglo Inicial: ");
        System.out.println(Arrays.toString(arreglo));
        System.out.println();

        Shell.sort(arreglo);

        System.out.println("              ARREGLO ORDENADO              ");
        System.out.println(Arrays.toString(arreglo));
    }
}
