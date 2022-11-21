/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ColasPA;

/**
 *
 * @author omarl
 */
public class ColaPrioridadAcotada<T> {

    private final Colas<T>[] dato;
    private int tamanio = 0;

    public ColaPrioridadAcotada(int niveles) {
        dato = new Colas[niveles];
        for (int i = 0; i < dato.length; i++) {
            dato[i] = new Colas<>();
        }
    }

    public boolean is_empty() {
        return this.tamanio == 0;
    }

    public int length() {
        return this.tamanio;
    }

    public void enqueue(int prioridad, T datos) {
        if (prioridad >= dato.length) {
            System.out.println("Número de prioridad fuera de parametros, intente de nuevo");
        } else {
            dato[prioridad].enqueue(datos);
            tamanio++;
        }

    }

  /*  public void  dequeue() {
        
        for (Colas<T> dato : dato) {
            if (!dato.isEmpty()) {
                tamanio--;
            }
        }
        
    }
*/    
     public T dequeue(){
        for (Colas<T> dato : dato) {
            if (!dato.isEmpty()) {
                tamanio--;
                return dato.dequeue();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String colaPA = "";
        for (int i = 0; i < dato.length; i++) {
            colaPA +="Prioridad "+i+ ": "+dato[i]+"\n";
        }
        return colaPA;
    }

}
