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
public class HasHMapADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.println("----------- HashMap ------------");
        Map <Integer, String> animalesMap = new HashMap<>();
          // metodo para preguntar si está vacía
            System.out.println("¿El HashMap está vacío? "+animalesMap.isEmpty());
          //se agrega y se asocia la llave con el valor 
            animalesMap.put(4312, "Perro");
            animalesMap.put(5981, "Lobo");
            animalesMap.put(3164, "León");
            animalesMap.put(1249, "Tigre");
            animalesMap.put(3794, "Gato");
          //imprimir el contenido del HashMap
            System.out.println("Animales: "+animalesMap);
          //preguntar si está vacía
            System.out.println("¿El HashMap está vacío? "+animalesMap.isEmpty());
         
          // preguntar si contiene X clave con una clave inexistente
            System.out.println(animalesMap.containsKey(54612));
          // preguntar si contiene X clave con una clave existente
            System.out.println(animalesMap.containsKey(4312));
          // pregunta si contiene X valor, con un valor inexistente
            System.out.println(animalesMap.containsValue("Pato"));
          // pregunta si contiene X valor, con un valor existente
            System.out.println(animalesMap.containsValue("León"));
          
          // devuelve el valor asosciado con la clave X, con clave inexistente
            System.out.println(animalesMap.get(1234));
          // devuelve el valor asociado con la clave X, con clave existente
             System.out.println(animalesMap.get(1249));
          // devuelve un conjunto con las llaves el HashMap
            System.out.println("Claves: "+animalesMap.keySet());
         // devuelve un conjunto con los valores del HashMap
            System.out.println("Valores: "+animalesMap.values());
            
         // devuelve el tamaño del HashMap   
            System.out.println("Tamaño del HashMap: "+animalesMap.size());
         
         // remueve X clave con su valor del HashMap
            animalesMap.remove(3794);
            animalesMap.remove(3164);
            System.out.println("Animales: "+animalesMap);
         // elimina todo el contenido del HashMap  
            animalesMap.clear();
            System.out.println(animalesMap);
 
}}
