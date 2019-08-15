/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.introduccion.entities;

import java.io.*;

/**
 *
 * @author 2100448
 */
public class Programa {
    
    private LinkedList list ;
    
    
    public LinkedList readFile(){
        
        File file = new File("file.txt");
        BufferedReader reader = null;
        int num = 0;
        Nodo primario = null ;
        Nodo secundario = null ;
        Head head;
        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;
                
            while ((text = reader.readLine()) != null) {
                if (num == 0){
                    primario  = new Nodo(Integer.parseInt(text),num+1,null);
                    head = new Head(primario,null);
                }else{
                    secundario = primario;
                    secundario.setNextNode(primario);
                    primario  = new Nodo(Integer.parseInt(text),num+1,null);
                }
                num++;
                list.addNode(primario);
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
        return list;
    }
    
    
}
