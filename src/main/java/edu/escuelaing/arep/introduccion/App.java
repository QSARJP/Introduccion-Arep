package edu.escuelaing.arep.introduccion;

import edu.escuelaing.arep.introduccion.entities.LinkedList;
import edu.escuelaing.arep.introduccion.entities.Programa;
import edu.escuelaing.arep.introduccion.entities.Statistics;

/**
 * Main class con un ejemplo de lectura de datos y sus respectivas impresiones
 *
 * @author Ospina
 * 
 * @version (a version 15/8/19)
 */
public class App 
{

    public static void main( String[] args ){
        Programa pro = new Programa();
        LinkedList list = pro.readFile("file.txt");
        Statistics stat = new Statistics(list);
        list.showList();
        System.out.println(stat.getPromedio());
        System.out.println(stat.getDesviacion());
        
        

    }
}
