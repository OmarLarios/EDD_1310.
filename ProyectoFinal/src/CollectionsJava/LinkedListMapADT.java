/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CollectionsJava;

import java.util.*;

/**
 *
 * @author omarl
 */
public class LinkedListMapADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---------- Linked Hash Map ------------");
        //constructor
        Map comida = new LinkedHashMap();
        
        // metodo para agregar llaves con valores asociados
        comida.put(22, "Picadillo");
        comida.put(13, "Consomé");
        comida.put(41,"Mole");
        comida.put(24,"Tacos");
        comida.put(16,"Pizza");
        comida.put(11,"Longaniza");
        comida.put(32,"Pollo");
        comida.put(39,"Milanesas");
        
        // metodo para saber si la lista esta vacia
        System.out.println("¿La lista esta vacía? "+comida.isEmpty() );
        
        // imprimir el contenido de la lista
        System.out.println("Comida: "+comida);
        
        // Devuelve el tamaño de la listta
        System.out.println("El tamaño de la lista es de: "+comida.size());
        
        // Pregunta si existe X llave o X valor en la lista
        System.out.println("¿Esta la llave 19 en la lista? "+comida.containsKey(19));
        System.out.println("¿Hay milanesas? "+comida.containsValue("Milanesas"));
    
        // devuelve unicamente las llaves de la lista
        System.out.println("Keys: "+comida.keySet());
        
        // devuelve unicamente los valores de la lista
        System.out.println("Values "+comida.values());
        
        //metodo que elimina el valor asociado a la llave dada
        comida.remove(13);
        comida.remove(41);
        
        System.out.println("Comida: "+comida);
        
        //metodo que vacia la lista
        comida.clear();
        System.out.println("Comida " +comida);
        }
    
}
