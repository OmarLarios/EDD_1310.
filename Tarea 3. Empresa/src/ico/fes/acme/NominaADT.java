/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.acme;
import adt.Arreglo;
import java.io.*;

/**
 *
 * @author omarl
 */
public class NominaADT {
    String nombreEmpresa;
    Arreglo<Trabajador> nomina;
    String rutaArchivo;

    public NominaADT() {
    }
    
    public NominaADT(String ruta) {
      
        this.rutaArchivo=ruta;
    }
    public void leerArchivo(){
         int cont = 1;
        Trabajador x;
        
        int max= 0;
        int min = 299999;
        int trabMax = 0;
        int trabMin = 0;
        String nombreCo = null;
        String nombreC = null;
        try {
            FileReader fr = new FileReader("\\C:\\Users\\omarl\\Downloads\\junio.csv\\");
            BufferedReader br = new BufferedReader(fr);
            String linea, a[];
            
            while((linea=br.readLine()) != null){
                a=linea.split(",");   //separar
                if(cont !=1){
                
                x = new Trabajador(Integer.parseInt(a[0]), a[1], a[2], a[3],Double.parseDouble(a[5]), Integer.parseInt(a[4]), Integer.parseInt(a[6]));
                System.out.println(x.toString());
                System.out.println("Sueldo total: "+x.calcularSueldo());     
                if(Integer.parseInt(a[6])>max){
                    max = Integer.parseInt(a[6]);
                    nombreCo =a[1]+ " " + a[2]+ " " + a[3];
                } if (Integer.parseInt(a[6])<min){
                    min =Integer.parseInt(a[6]);
                    nombreC = a[1]+ " " + a[2]+ " " + a[3];
                }
                }
            cont ++;
            }
        System.out.println("El empleado con mas antiguedad es: "+ nombreC + " " + min );
        
        System.out.println("El empleado con menor antiguedad es: "+ nombreCo + " " +max);
        } catch (Exception ex) {
            System.out.println(ex);
        }
            
    }
    
    
}