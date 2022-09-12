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

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumeroDePagina() {
        return numeroDePagina;
    }

    public void setNumeroDePagina(int numeroDePagina) {
        this.numeroDePagina = numeroDePagina;
    }

    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
}
