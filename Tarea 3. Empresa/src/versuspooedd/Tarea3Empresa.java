/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package versuspooedd;

/**
 *
 * @author omarl
 */
import adt.Arreglo;
import ico.fes.acme.NominaADT;
import ico.fes.acme.Trabajador;

/**
 *
 * @author Cabrera
 */
public class Tarea3Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro1 = new Perro("Fido", "Poddle", 5);
        Perro perro2 = new Perro("castroso", "Chichuahua", 2);
        Perro perro3 = new Perro("Firulais", "Akita", 3);
        
        Arreglo<Perro> lista = new Arreglo(5);
        System.out.println( lista );
        lista.setElemento(0, perro1);
        lista.setElemento(1, perro2);
        lista.setElemento(2, perro3);
        
        
        System.out.println(lista);
        lista.limpiar(new Perro());
        System.out.println(lista);
       
        
        System.out.println("-----llenar todos los campos de la lista con unos solos datos-------");
        lista.limpiar(new Perro("Odin","Chihuaha",6));
        System.out.println(lista);
        
        System.out.println("--------------- Tarea 3: Empresa ---------------");
        NominaADT archivo= new NominaADT();//crear objeto
        archivo.leerArchivo();
      
            }
    
}
