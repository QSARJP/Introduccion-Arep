package edu.escuelaing.arem.introduccion.entities;

//import java.util.ArrayList;

public class Statistics {
    
    private LinkedList lista;
    private int promedio;
    private int numeroDatos;
    private int resta;
    private float desviacion;
    
    public Statistics (LinkedList lista){
        this.lista = lista;
        this.promedio = promedio();
        this.resta = resta();
        this.desviacion = desviacion();
        
    }
    
    
    private int promedio (){
        int total = 0;
        int num = 0;
        int pro = 0;
        if(!lista.isEmpty()){
           Head head = lista.getHead();
           Nodo nodoActual  = head.getPrimerNodo();
           while (!(nodoActual == null)){
               total += nodoActual.getData();
               num ++;
               nodoActual = nodoActual.getNextNode();
           }
           pro = total / num ;
        }
        numeroDatos = num;
        return pro;
    }
    
    
    private int resta () {
        int total = 0;
        if(!lista.isEmpty()){
           Head head = lista.getHead();
           Nodo nodoActual  = head.getPrimerNodo();
           while (!(nodoActual == null)){
               total += (int) Math.pow(nodoActual.getData() - getPromedio(),2);
               nodoActual = nodoActual.getNextNode();
           }
        }
        return total;
    }
    
    
    private float desviacion(){
        return (float) Math.sqrt(getResta()/getNumeroDatos());
    }
    
    public int getPromedio(){
        return this.promedio;
    }
    
    public int getNumeroDatos(){
        return this.numeroDatos;
    }
    
    public int getResta(){
        return this.resta;
    }
}