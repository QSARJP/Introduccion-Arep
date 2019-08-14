package edu.escuelaing.arem.introduccion.entities;



public class Head {

    private Nodo primerNodo;
    private Nodo ultimoNodo;

    public Head(Nodo primerNodo, Nodo ultimoNodo) {
        this.primerNodo = primerNodo;
        this.ultimoNodo = ultimoNodo;
    }

    public Nodo getUltimoNodo() {
        return ultimoNodo;
    }

    public void setUltimoNodo(Nodo ultimoNodo) {
        this.ultimoNodo = ultimoNodo;
    }

    public Nodo getPrimerNodo() {
        return primerNodo;
    }

    public void setPrimerNodo(Nodo primerNodo) {
        this.primerNodo = primerNodo;
    }
}