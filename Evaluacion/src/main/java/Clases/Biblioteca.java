package Clases;

import java.util.Scanner;

public class Biblioteca {
    private String nombreLibro;
    private String codigo;
    private int numeroDePagina;
    private int numeroDeEjemplares;
    private String autor;

    public Biblioteca() {
    }

    public Biblioteca(String nombreLibro, String codigo, int numeroDePagina, int numeroDeEjemplares, String autor) {
        this.nombreLibro = nombreLibro;
        this.codigo = codigo;
        this.numeroDePagina = numeroDePagina;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.autor = autor;
    }

    public  int ingresar() {
        Scanner leaTeclado = new Scanner(System.in);

        System.out.println("Ingrese nombre del libro: ");
        this.nombreLibro = leaTeclado.nextLine();

        System.out.println("Ingrese codigo del libro: ");
        this.codigo = leaTeclado.nextLine();

        System.out.println("Ingrese el numero de pagina: ");
        this.numeroDePagina= leaTeclado.nextInt();

        System.out.println("Ingrese numero de ejemplares: ");
        this.numeroDeEjemplares= leaTeclado.nextInt();

        System.out.println("Ingrese el nombre del autor: ");
        this.autor = leaTeclado.nextLine();

        return 0;


    }
}
