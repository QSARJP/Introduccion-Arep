package edu.escuelaing.arem.introduccion.entities;




public class Nodo {


    private Integer data;
    private Nodo nextNode;
    private Integer idNodo;

    public Nodo(Integer data, Integer nodo, Nodo nextNode) {
        this.data = data;
        this.setNextNode(nextNode);
        this.setIdNodo(nodo);
    }

    public Integer getIdNodo() {
        return idNodo;
    }

    public void setIdNodo(Integer idNodo) {
        this.idNodo = idNodo;
    }

    public Nodo getNextNode() {
        return nextNode;
    }

    public void setNextNode(Nodo nextNode) {
        this.nextNode = nextNode;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }


}