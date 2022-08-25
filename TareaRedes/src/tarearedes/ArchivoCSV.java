/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarearedes;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;


/**
 *
 * @author omarl
 */
public class ArchivoCSV {
    private BufferedReader lector; //leer el archivo
    private String linea;    //recibe la linea de cada fila
    String partes[] = null;  //almacena cada linea leida
    
    public void leerArchivo(String nombreArchivo){
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while((linea = lector.readLine()) != null){
                partes = linea.split(";");
                imprimirLinea();
                System.out.println();
            }
            lector.close();
            linea = null;
            partes = null;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void imprimirLinea(){
        for(int i = 0; i < partes.length; i++){
            System.out.println(partes[i]);
           
    }
     }
    public void difTW(){
        int dif, twEn = 62404, twJn = 67496;
        dif = twJn - twEn;
        
        System.out.println("Diferencia de seguidores en Twitter entre Enero y Junio: " + dif);
        
    }
   
    
    public void creFbyTw(){
        int aFB =660, bFB=480, cFB=3638, dFB =4585, eFB=5308, fFB=7925,tFB;
        tFB = (aFB+bFB+cFB+dFB+eFB+fFB)/6;
        int aTw =863, bTw=828, cTw=917, dTw =1261, eTw=945, fTw=1141,tTw;
        tTw = (aTw+bTw+cTw+dTw+eTw+fTw)/6;
        System.out.println("Promedio de crecimiento de Facebook Enero-Junio: " + tFB ); 
        System.out.println("Promedio de crecimiento de Twitter Enero-Junio: " + tTw  );
    }
}


