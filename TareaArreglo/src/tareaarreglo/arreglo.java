package tareaarreglo;

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