package org.example;

import Clases.Biblioteca;
import Clases.Empleado;
import Clases.Tienda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empleado empleado= new Empleado();
        Scanner entradaPorTeclado= new Scanner(System.in);

        empleado.setSalario(3500000);
        empleado.setValorComision(1500000);
        empleado.setDeducciones(0.05);

        System.out.println("Digite su identificacion: ");
        String identi=entradaPorTeclado.nextLine();
        empleado.setIdentificacion(identi);

        System.out.println("Digite su identificacion: ");
        String nombre=entradaPorTeclado.nextLine();
        empleado.setIdentificacion(nombre);

        int salario=empleado.getSalario();
        System.out.println("Salario mensual: "+salario);

        int valorComision=empleado.getValorComision();
        System.out.println("Valor comision: "+valorComision);

        double deducciones=empleado.getDeducciones();
        System.out.println("Valor deducciones: "+deducciones);

        System.out.println("Digite su numero de ventas mensuales: ");
        int ventasMensuales=entradaPorTeclado.nextInt();
        empleado.setNumeroVentasMensuales(ventasMensuales);

        double totalSalario=empleado.calcularSalario();
        System.out.println("El salario total de "+ nombre + "es" +totalSalario);


        System.out.println("Trabajo 2: ");

        Tienda carrefour= new Tienda();

        double total= carrefour.CalcularProducto();

        System.out.println("El costo total de la compra del prodcto es: "+total);


        System.out.println("Trabajo 3: ");

        Biblioteca alejandria= new Biblioteca();
        Scanner lea=new Scanner(System.in);

        int observador=100;

        System.out.println("***MENU***");
        System.out.println("1. Ingrese el libro");
        System.out.println("2. consultar libro");
        System.out.println("3. Modificar libro");
        System.out.println("4. Salir");

        while(observador!=4){

            System.out.println("digite una opcion: ");
            observador=lea.nextInt();

            if(observador==1){
                System.out.println("Ingrese el nombre del libro");

            }else if (observador==2){

            }else if (observador==3){

            }else if (observador==4){
                System.out.println("Salir");
            }else{
                System.out.println("opcion invalida");
            }

        }



    }
}