/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ico.fes.TH;

/**
 *
 * @author omarl
 */
public class DriverTH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashTableADT<Integer, String> animales = new HashTableADT(7);
        animales.add(78125, "perro");
        animales.add(42815, "gato");
        animales.add(18125, "perico");
        animales.add(14528, "ratón");
        animales.add(45941, "leon");
        animales.add(25874, "oso");
        animales.add(73619, "conejo");
        
        animales.valueOf(73619);
        animales.valueOf(18125);
        
        animales.remove(78125);
        animales.remove(14528);
        
    }
    
}
