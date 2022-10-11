/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ico.fes.LSL;

/**
 *
 * @author omarl
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        ADTListasSL <Integer> lista = new ADTListasSL();
        System.out.println(lista.estaVacia());
        lista.agregarInicio(52);       
        lista.agregarFinal(159);
        lista.agregarInicio(89);      
        lista.agregarFinal(19);
        lista.agregarInicio(26);
        lista.agregarDespuesDe(29,89);
        lista.agregarFinal(42);
        lista.agregarFinal(73);     
        lista.transversal();
        System.out.println(lista.getTamanio());         
        System.out.println(lista.estaVacia());
        
        System.out.println(lista.buscar(19));
        
        lista.eliminarFinal();  
        lista.transversal();
       // lista.buscar(73);
        lista.eliminarPrimero();
        lista.transversal();
        System.out.println(lista.getTamanio());
        lista.eliminar();
        lista.transversal();
        System.out.println(lista.getTamanio());
    }
    
}
