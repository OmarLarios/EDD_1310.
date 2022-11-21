/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colas;

import java.util.ArrayList;

/**
 *
 * @author omarl
 */
public class ColasADT<T>{
    
    private ArrayList<T> datos;
    
    public ColasADT() {
        datos = new ArrayList<>();
        
    }

    public int lenght() {
        return datos.size();
    }
    
    public boolean isEmpty(){      
        return datos.isEmpty();
    }
    
    public void enqueue(T dato){
        datos.add(dato);
    }
    
    public void dequeue(){
        if (datos.isEmpty()) {
            System.out.println("La cola está vacía");
        }else{
            datos.remove(0);
        }
        
    }
    
    @Override 
    public String toString(){
        String cola="";
        
        for (int i = 0; i < datos.size(); i++) {
            cola+=("["+datos.get(i)+"]"+"<--");
        }
        return cola;
    }
}
