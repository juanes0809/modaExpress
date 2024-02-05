package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerDato = new Scanner(System.in);

        String nombreCliente;
        String tipoCliente;
        int cantidadArticulos;
        Double precioTotal;


        System.out.print("Nombre y apellidos del cliente: ");
        nombreCliente = leerDato.nextLine();

        System.out.print("Tipo de cliente (Regular o VIP): ");
        tipoCliente = leerDato.nextLine();

        System.out.print("Cantidad de artículos comprados: ");
        cantidadArticulos = leerDato.nextInt();

        System.out.print("Precio total de la compra (sin descuento): ");
        precioTotal = leerDato.nextDouble();

        double porcentajeDescuento = 0;
        if (tipoCliente.equalsIgnoreCase("Regular")) {
            if (cantidadArticulos >= 1 && cantidadArticulos <= 3) {
                porcentajeDescuento = 0.05;
            } else if (cantidadArticulos >= 4 && cantidadArticulos <= 6) {
                porcentajeDescuento = 0.15;
            } else if (cantidadArticulos > 6) {
                porcentajeDescuento = 0.20;
            }
        } else if (tipoCliente.equalsIgnoreCase("VIP")) {
            if (cantidadArticulos >= 1 && cantidadArticulos <= 3) {
                porcentajeDescuento = 0.10;
            } else if (cantidadArticulos >= 4 && cantidadArticulos <= 6) {
                porcentajeDescuento = 0.15;
            } else if (cantidadArticulos > 6) {
                porcentajeDescuento = 0.20;
            }
        }

        double descuento = precioTotal * porcentajeDescuento;
        double totalPagar = precioTotal - descuento;

        // Mostrar resultados
        System.out.println("\nResumen de la compra:");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Tipo de cliente: " + tipoCliente);
        System.out.println("Cantidad de artículos: " + cantidadArticulos);
        System.out.println("Precio total sin descuento: $" + precioTotal);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);

        leerDato.close();
    }
}