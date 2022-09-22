/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT;
import java.util.*;


/**
 *
 * @author omarl
 */
public class Conjunto <T>{
    int tamanio;
    public SortedSet a;
       
    public Conjunto() {
        a= new TreeSet();
        
    }   
    
    public SortedSet getA() {
        return a;
    }
    
    public void setA(SortedSet a) {
        this.a = a;
    }

    public void inserta(Object e){
        if(a.add(e)==false){
        System.out.println("No se puede agregar el elemento " +e+ ", ya existe en el conjunto ");
    }
    }
     public int getTamanio() {
        return tamanio;
    }
    public void elimina(Object e){
        if(a.remove(e)){
            System.out.println("El elemento "+e+" ha sido eliminado");
        }else{
            System.out.println("El elemento a eliminar ("+e+ ") no existe en el conjunto");
        }
    }
    
    public SortedSet union(SortedSet a, SortedSet b){
        a.addAll(b);
        return a;
    }
    
    public SortedSet interseccion(SortedSet a, SortedSet b){
        a.retainAll(b);
        return a;
    }
    
    public SortedSet diferencia(SortedSet a, SortedSet b){
        a.removeAll(b);
        return a;
    }
    
    public SortedSet complemento(SortedSet a, SortedSet b){
        a.retainAll(b);
        return a;
    }
    
    public SortedSet igualdad(SortedSet a, SortedSet b){
        if (a == b) {
            System.out.println("Iguales");
        }else{
            System.out.println("No son iguales");
        }
        SortedSet c = new TreeSet();

        return c;
    }
}