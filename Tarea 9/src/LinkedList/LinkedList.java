/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author omarl
 */
public class LinkedList <T>{
    Nodo <T> head;
    int tamanio = 0;

    public void LinkedList() {
        head=null;
    }  
    public void LinkedList(T val) {
        head = new Nodo(val);
    }
    public Nodo<T> head(){
        return this.head;
    }
    public boolean estaVacia(){
        //System.out.print("¿La lista está vacía? ");
        return this.head==null;
        }

    public int getTamanio() {
        System.out.print("Tamaño de la lista: ");
        return this.tamanio;
    }
     public void agregarInicio(T dato){
        if (head == null) {
            head = new Nodo(dato);
        }else{
            Nodo <T> nuevo = new Nodo(dato);
            nuevo.setSiguiente(head);
            head=nuevo;
        }
        tamanio ++;
    }
     
    public void agregarFinal(T dato){
    if(this.head == null){
        head= new Nodo <T> (dato);
    }else{
        Nodo <T> nuevo = new Nodo(dato);
        Nodo<T> aux = this.head;
        while(aux.getSiguiente()!=null){
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(nuevo);
        }
      tamanio ++;
    }
 
    public void agregarDespuesDe(T dato, T datoInicial){
         if (head == null) {
             System.out.println("Lista vacía");
        }
        Nodo<T> actual = head;
        boolean band = false;
        while (!actual.getDato().equals(datoInicial) && !band) {
            if (actual.getSiguiente()!= null) {
                actual = actual.getSiguiente();
            } else {
                band = true;
            }
        
        }
        if (!band) {
            Nodo<T> nodo = new Nodo<>(dato);
            nodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nodo);
        } else {
            System.out.println("El nodo dado como referencia no está en la lista");
        }
        tamanio ++;
    }

    public void eliminar(int pos){   
        this.head = null;
          tamanio =0;
    }
    
    public void eliminarPrimero(){
         if (head != null) {
            head = head.getSiguiente();
    }else{
             System.out.println("La lista está vacía...");
         }
           tamanio --;
    }
    
    public void eliminarFinal(){
         Nodo<T> aux = head;
        Nodo<T> aux2 = null;
        if (head.getSiguiente()== null) {
            head = null;
            System.out.println("La lista está vacía");
        } else {
            while (aux.getSiguiente()!= null) {
                aux2 = aux;
                aux = aux.getSiguiente();
            }
            aux2.setSiguiente(null);
        }tamanio --;
       }
    
    public int buscar(T valor){
        int posicion=1;
        Nodo<T> aux= this.head;
        
            while(aux.getDato()!=valor){
            aux= aux.getSiguiente();
            posicion++;
        }
        aux.getDato();   
        System.out.print("El valor ingresado se encuentra en la posición: ");
        if(aux.getDato()==null && aux.getSiguiente()==null){
            System.out.println("El valor ingresado no se encuentra en la lista...");
            posicion=0;
        }
        return posicion;
    }
      
   public void actualizar(){
        Nodo aux = head;
        while(aux.getSiguiente() != null){
        aux = aux.getSiguiente();
    }
       
}
    
    public void transversal(){        
        if (head != null) {
            Nodo aux = this.head;
        while (aux != null) {
            System.out.print(aux.getDato()+" --> ");
            aux = aux.getSiguiente();
        }
        System.out.println("\n");
    }else{
            System.out.println("------------lista vacia------------");
        }
        }

}
