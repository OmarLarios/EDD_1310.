/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaclasearreglo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author omarl
 */
public class TareaClaseArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<arreglo> alumno=new ArrayList<arreglo>();
        alumno.add(new arreglo("Omar", 19, 3));
        alumno.add(new arreglo("Daniela", 22, 5));
        alumno.add(new arreglo("Fernanda", 20, 4));
        alumno.add(new arreglo("Braulio", 19, 1));
        alumno.add(new arreglo("Diana", 18, 2));
        alumno.add(new arreglo("Diego", 21, 4));
        
        for (arreglo ar : alumno) {
            System.out.println(ar);
        }
        System.out.println("----------------------");
        System.out.println("El tamaño de la lista es de: "+ alumno.size()+" elementos");
        alumno.set(3, new arreglo("Barbara", 20, 4));
        for (arreglo ar : alumno) {
            System.out.println(ar);
        }
       arreglo ind = alumno.get(4);
        System.out.println("Alumno en index = 4 : "+ind);
        
        alumno.clear();
        System.out.println("El tamaño de la lista es de: "+ alumno.size());
         
        System.out.println(alumno);
       
        }
        /*
          System.out.println("Add con índice");
        grupo2209.add(2, new Alumno("81111", 3, 9.9f));{
            for (Alumno alumno : grupo2209) {
                System.out.println(alumno); 
        }
    
    Alumno tmp3 = grupo2209.set(0, new Alumno("4444", 4, 4.0f));
        System.out.println("El sacado es = "+tmp3);
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }*/
        
        /*
        
                

        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
            
        }
        System.out.println("Add con índice");
        grupo2209.add(2, new Alumno("81111", 3, 9.9f));{
            for (Alumno alumno : grupo2209) {
                System.out.println(alumno); 
        }
        
        
        
        
        arreglo[] alumno = new arreglo[5];
        
        alumno[0]= new arreglo("Omar", 19, 3);
        alumno[1]= new arreglo("Luis", 20, 4);
        alumno[2]= new arreglo("Maria", 26, 6);
        alumno[3]= new arreglo("Braulio", 19, 3);
        alumno[4]= new arreglo("Daniela", 25, 9);
        
        for (int i = 0; i < alumno.length; i++) {
            arreglo elem = alumno[i];
            System.out.println(alumno[i]); 
        }
        arreglo(int tamanio);
        System.out.println("El tamaño del arreglo es de: "+ alumno.length);
      
        
       
         Arreglo( int tamanio ): constructor.
        int getLongitud(): retorna el tamaño.
        setElemento( indice,valor ): establece un elemento en una posición específica.
        getElemento( indice ): regresa el elemento en el índice solicitado.
        limpiar( valor ): establece todos los elementos al valor enviado.
        toString(): regresa en String el estado actual del objeto.
        */
    }
    

