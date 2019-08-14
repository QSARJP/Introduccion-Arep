package edu.escuelaing.arem.introduccion.entities;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    private Head head;
    private List<Nodo> nodes;

    public LinkedList() {
        this.setHead(null);
        this.nodes = new ArrayList<Nodo>();
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public List<Nodo> getNodes() {
        return nodes;
    }

    public void setNodes(List<Nodo> nodes) {
        this.nodes = nodes;
    }

    
    public void addNode(Nodo nodo){
        Nodo ultimo = null;
        if (head.getUltimoNodo() != null){
            ultimo = head.getUltimoNodo();    
        }else{
            ultimo = nodo;
        }
        ultimo.setNextNode(nodo.getNodo());
        nodo.setNextNode(null); 
        if (!nodes.isEmpty()){
            nodo.setNodo(nodes.size());
        }else{
            nodo.setNodo(1);
        }
        nodes.add(nodo);
        
    }

    public void removeNode (Integer numNode){
        Nodo ultimo = nodes.get(numNode-1);
        if (nodes.size() == numNode){
            ultimo.setNextNode(null);
        }else{
            ultimo.setNextNode(numNode+1);
        }
        nodes.remove(nodes.get(numNode));
    }

}