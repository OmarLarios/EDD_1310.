/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaclasearreglo;

/**
 *
 * @author omarl
 */
public class arreglo {
private String nombre;
private int edad;
private int semestre;
 

    public arreglo(String nombre, int edad, int semestre) {
        this.nombre = nombre;
        this.edad = edad;
        this.semestre = semestre;
        
        
    }

    public arreglo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    

   

    @Override
    public String toString() {
        return "Alumno{" + "Nombre: " + nombre + ", Edad= " + edad + ", Semestre= " + semestre + '}';
    }
    
    
    
    
}




/*Crear una clase en Java llamada Arreglo que tenga los siguientes métodos:
Arreglo( int tamanio ): constructor.
int getLongitud(): retorna el tamaño.
setElemento( indice,valor ): establece un elemento en una posición específica.
getElemento( indice ): regresa el elemento en el índice solicitado.
limpiar( valor ): establece todos los elementos al valor enviado.
toString(): regresa en String el estado actual del objeto.*/