/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.TH;

import LinkedList.*;
import java.util.Map;

/**
 *
 * @author omarl
 */
public class HashTableADT <K, V>{
   // private K key;
   // private V value;  
    private final LinkedList<Map.Entry>[] tablaHash;
    private final int size;
     
    
    public HashTableADT(int size) {
        this.size = size;
        tablaHash = new LinkedList[size];
        for (int i = 0; i < tablaHash.length; i++) {
            tablaHash[i] = new LinkedList();
        }
    }
    
    public int hash(K key){
        return key.hashCode()%size;
    }
    
    public void add(K key, V value){
       int pos = hash(key);
       tablaHash[pos].agregarFinal(Map.entry(key, value));
    }
    
    public V valueOf(K key){
        int pos = hash(key);
        if (tablaHash[pos]==null) {
            System.out.println("Tabla vacía");
        }
        Nodo<Map.Entry> aux = tablaHash[pos].head();
        while (aux != null && !aux.getDato().getKey().equals(key)) {
            aux = aux.getSiguiente();
        }
        if (aux == null) {
            return null;
        }
        System.out.println("El dato con la llave "+key+" es "+"'"+aux.getDato().getValue()+"'");
        return (V) aux.getDato().getValue();
        
    }
    
    public V remove(K key){
        int pos = hash(key);
        if (tablaHash[pos]==null) {
            System.out.println("Tabla vacía...");
        }
        Nodo<Map.Entry> aux = tablaHash[pos].head();
        int aux2 = 0;
        while (aux != null && !aux.getDato().getKey().equals(key)) {
            aux = aux.getSiguiente();
            aux2++;
        }
 
        V eliminado = (V) aux.getDato().getValue();
        tablaHash[pos].eliminar(aux2);
         System.out.println("El dato eliminado con la llave "+key+" es "+"'"+eliminado+"'");
        return eliminado;
    }
    
}
