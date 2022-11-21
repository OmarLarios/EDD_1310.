
package Colas;

/**
 *  Tarea 7: Colas
 * @author Omar Larios
 */
public class DriverColas {

    public static void main(String[] args) {
       
        ColasADT<String> hero = new ColasADT<>(); 
        System.out.println("¿Está vacía? "+hero.isEmpty());
        System.out.println("Tamaño de la la cola: "+hero.lenght());
        hero.enqueue("Woverine");
        hero.enqueue("Iron-Man");
        hero.enqueue("Spider-Man");
        hero.enqueue("Chapulin Colorado");
        hero.enqueue("Batman");
        System.out.println(hero.toString());
        
        System.out.println("¿Está vacía? "+hero.isEmpty());
        System.out.println("Tamaño de la la cola: "+hero.lenght());
        System.out.println("------------------------");
        hero.dequeue();
        hero.dequeue();
        System.out.println(hero.toString());
        System.out.println("Tamaño de la la cola: "+hero.lenght());
    }
    
}
