/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaarreglo;

import java.util.ArrayList;

/**
 *
 * @author omarl
 */
public class TareaArreglo {

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
    
}
