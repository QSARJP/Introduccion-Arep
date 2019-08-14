package edu.escuelaing.arem.introduccion.entities;




public class Nodo {


    private Integer data;
    private Integer nextNode;
    private Integer nodo;

    public Nodo(Integer data,Integer nodo, Integer nextNode) {
        this.data = data;
        this.nextNode = nextNode;
        this.nodo = nodo;
    }

    public Integer getNodo() {
        return nodo;
    }

    public void setNodo(Integer nodo) {
        this.nodo = nodo;
    }

    public Integer getNextNode() {
        return nextNode;
    }

    public void setNextNode(Integer nextNode) {
        this.nextNode = nextNode;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }


}