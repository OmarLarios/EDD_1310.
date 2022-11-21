/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ColasPA;

import java.util.ArrayList;

/**
 *
 * @author omarl
 */
public class Colas<T> {
     private ArrayList<T> datos;

    public Colas() {
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
    
    public T dequeue(){
        if (datos.isEmpty()) {
            System.out.println("La cola está vacía");
        }
       return datos.remove(0);   
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
