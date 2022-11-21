/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ColasPA;

/**
 *
 * @author Omar Larios
 * Tarea 8: Colas de prioridad acotada
 */
public class DriverCPA {

  
    public static void main(String[] args) {
        ColaPrioridadAcotada<String> tripulacion = new ColaPrioridadAcotada<>(7);
        System.out.println("¿La cola está vacía? "+ tripulacion.is_empty());
        System.out.println("El tamaño de la cola es de: "+tripulacion.length()+"\n");
        tripulacion.enqueue(4, "Maestre");
        tripulacion.enqueue(2, "Niños");
        tripulacion.enqueue(4, "Mecánico");
        tripulacion.enqueue(3, "Mujeres");
        tripulacion.enqueue(2, "Viejit@s");
        tripulacion.enqueue(1, "Niñas");
        tripulacion.enqueue(3, "Hombres");
        tripulacion.enqueue(4, "Vigia");
        tripulacion.enqueue(5, "Capitán");
        tripulacion.enqueue(4, "Timonel");
        System.out.println(tripulacion.toString());
        
        System.out.println("Antes de empezar a abordar los botes salvavidas se descubre que hay 'colados', por lo que se añaden a la cola de prioridad...\n");
        
        tripulacion.enqueue(0, "Bad Bunny");
        tripulacion.enqueue(1,"Santa");
        tripulacion.enqueue(6, "Chabelo");
        tripulacion.enqueue(5, "Graue");
        tripulacion.enqueue(0, "Shrek");
        System.out.println(tripulacion.toString());
      
        System.out.println("Empieza el abordaje a los botes salvavidas de las prioridades 1 y 2...\n");
        tripulacion.dequeue();
        tripulacion.dequeue();
        tripulacion.dequeue();
        System.out.println(tripulacion.toString());
        
        tripulacion.dequeue();
        tripulacion.dequeue();
        tripulacion.dequeue();
        tripulacion.dequeue();
        tripulacion.dequeue();
        tripulacion.dequeue();
        tripulacion.dequeue();
        tripulacion.dequeue();
        tripulacion.dequeue();
        tripulacion.dequeue();
        System.out.println("Por suerte abordaron casi todos antes de que se hundiera el barco...\n");
        System.out.println(tripulacion.toString());
       
        System.out.println("¿La cola está vacía? "+ tripulacion.is_empty());
        System.out.println("El tamaño de la cola es de: "+tripulacion.length()+"\n");
       
        
    }
    
}
