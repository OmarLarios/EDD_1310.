/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BalanceoConPilas;

package ico.fes.pilas;

import java.util.ArrayList;

public class PilaADT<T>{
    private final ArrayList<T> datos;
    private int tope;

    public PilaADT() {
        datos = new ArrayList<>();
        tope = -1;
    }
        
    public boolean isEmpty(){
        System.out.print("¿La pila está vacía? ");
        System.out.println(this.tope<0);
        return this.tope<0;
    }
    
    public int lenght(){
        System.out.println("Número de elementos en la pila: "+datos.size());
        return datos.size();
    }
    
    public T pop(){
        
        if (tope<0) {
           
            System.out.println("Pila vacia");
            return null;
        }else{
            T sacado = datos.remove(tope);
            tope=datos.size()-1;
            return sacado;
        } 
                  
    }
    
    public T peek(){
        if (tope<0) {
            System.out.println("Pila vacia");
        }
        System.out.println(datos.get(tope));
        return datos.get(tope);
    }
    
    public void push(T dato){
        datos.add(dato);
        tope++;
        
    }
    
    @Override 
    public String toString(){
        String rsl="";
        for (int i = tope; i >= 0; i--) {
            rsl+=("|"+datos.get(i)+"|"+"\n");
        }
        System.out.println(rsl);
        return rsl;
    }
    
    
    
}
