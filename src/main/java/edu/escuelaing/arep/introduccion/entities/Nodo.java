package edu.escuelaing.arep.introduccion.entities;


/**
 * clase Nodo, es la clase mas pequeña del LinkedList y tiene como objetivo guardar los datos del nodo y la informacion del proximo nodo
 *
 * @author Ospina
 * 
 * @version (a version 15/8/19)
 */

public class Nodo {


    private float data;
    private Nodo nextNode;
    private Integer idNodo;

    public Nodo(float data, Integer nodo, Nodo nextNode) {
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

    public float getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    /**
     * poder mostrar los datos de mejor manera 
     */
    public void displayLink(){
		
		System.out.println("["+idNodo+", "+data+"]");
	}


}