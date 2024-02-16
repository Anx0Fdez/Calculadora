package com.DAM2024.librerias;

import javax.swing.*;
import java.util.Scanner;


public class Entrada {

    public static int datos;
    final static int VENTANA = 1;
    final static int CONSOLA = 2;

    public static int Seleccion_entrada(String msg, int opcion) {
        /**
         * @param String msg mensaje de la pregunta
         * @param int option
         * @return número entero
         *
         */

        if (opcion == VENTANA) {
            return Integer.parseInt(JOptionPane.showInputDialog(msg));

        }
        else {
            Scanner sc = new Scanner(System.in);
            System.out.println(msg);
            return sc.nextInt();


        }
    }
}