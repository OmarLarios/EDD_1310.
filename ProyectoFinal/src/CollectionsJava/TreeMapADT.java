/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CollectionsJava;

import java.util.TreeMap;

/**
 *
 * @author omarl
 */
public class TreeMapADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---------- TreeMap -------------");
        // constructor
        TreeMap nombres = new TreeMap();
        // agregando datos al arbol
        nombres.put(4, "Daniela");
        nombres.put(12, "Omar");
        nombres.put(6,"Iker");
        nombres.put(9, "Uriel");
        nombres.put(2, "Karen");
        nombres.put(10, "Barbara");
        
        // preguntar si el arbol esta vacio
            System.out.println("¿El arbol esta vacío? "+nombres.isEmpty());
        
        // imprimiendo el contenido del arbol
            System.out.println("Nombres: "+nombres);
       
        // devuelve el valor con la clave asociada, en caso de no existir tal llave devuelve el valor con una llave cercana a la solicitada
            System.out.println(nombres.ceilingEntry(5));
        // devuelve unicamente la llave solicitada, en caso de no existir tal llave devuelve la llave cercana a la solicitada
            System.out.println(nombres.ceilingKey(8));
        
        // metdo para saber si X llave se encuentra dentro del arbol
            System.out.println("¿Contiene la llave 15? "+nombres.containsKey(15));
        // metodo para saber si X valor se encuentra dentro del arbol
            System.out.println("¿Contiene el nombre de Iker? "+nombres.containsValue("Iker"));
        
        // metodo que devuelve unicamente las llaves 
            System.out.println("Keys: "+nombres.keySet());
        // metodo que devuelve unicamete los valores
            System.out.println("Values: "+nombres.values());
       
        // imprime el valor con la llave mas 'pequeña' asociada
            System.out.println(nombres.firstEntry());
        // imprime el dato con la llave mas 'alta' asociada
            System.out.println(nombres.lastEntry());
            
        // Devuelve la primera llave (la más baja) actualmente en el arbol.
        System.out.println("La primer llave es: "+nombres.firstKey());
        // recuperar la última llave o la llave más alta presente en el arbol.
        System.out.println("La ultima llave es: "+nombres.lastKey());
        
        //  devuelve la llave mínima estrictamente mayor que la clave dada, o null si no existe tal clave.
        System.out.println(nombres.higherKey(5));
        // devuelve la llave más grande estrictamente menor que la llave dada, pasada como parámetro.
        System.out.println(nombres.lowerKey(2));
        
        //duevuelve la parte o parte del mapa definido por el rango de llaves especificado en el parámetro.
        System.out.println(nombres.subMap(5, 8));
        
        // regresa los valores apartir de la llave especificada en el parametro
        System.out.println("Nombres: "+nombres.tailMap(8));
        
        // devuelve el tamaño del arbol
        System.out.println("El tamaño es de: "+nombres.size());

        // metodo para sacar valores del arbol
        nombres.remove(9);
        System.out.println("Nombres: "+nombres);
        
       
        
    }
    
    
}
