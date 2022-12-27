/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

// TODO code application logic here
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        int[][] ventas = new int[2][5];
        String reporte = "";
        int venta_dia;
        int suma = 0;

        for (int i = 0; i < ventas.length; i++) {
            System.out.printf("Ingrese las ventas de: %s\n\n",vendedores[i]);
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.printf("Ingrese el numero de ventas del dia\n");
                venta_dia = entrada.nextInt();
                suma = suma + venta_dia;
                venta_dia = ventas[i][j];

            }
        }
        System.out.printf("Vendedor(a) %s\nVendedor(a) %s\nHa realizado un total"
                + " de %d en ventas.", vendedores[0], vendedores[1], suma);

    }
}
