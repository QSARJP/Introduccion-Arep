package edu.escuelaing.arem.introduccion.entities;



public class LinkedList {

    private Head head;
    

    public LinkedList() {
        this.setHead(null);
        
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }



    
    public void addNode(Nodo nodo){
        Nodo ultimo = null;
        if (head.getUltimoNodo() != null){
            ultimo = head.getUltimoNodo();
            ultimo.setNextNode(nodo);    
        }else{
            ultimo = nodo;
        }
        nodo.setNextNode(null); 
        head.setUltimoNodo(nodo);
        
    }

    public void removeNode (Nodo nodo){
        Nodo nodop = head.getPrimerNodo();
        while (nodop.getIdNodo() != nodo.getIdNodo() && nodop.getNextNode() != null){
            Nodo nodo2 = nodop.getNextNode();
            if (nodo2.equals(nodo)){
                nodop.setNextNode(nodo2.getNextNode());
                nodo2.setNextNode(null);
            }
            nodop = nodo2;
        }
    }

    public Nodo nextNode (Nodo nodo){
        return nodo.getNextNode();
    }

    public Boolean isEmpty(){
        return (head.getPrimerNodo()== null && head.getUltimoNodo()==null);
    }


}