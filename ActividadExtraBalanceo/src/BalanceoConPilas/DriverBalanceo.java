package BalanceoConPilas;

import java.io.IOException;


public class DriverBalanceo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String urlTxt1="C:\\Users\\omarl\\OneDrive\\Documentos\\TareasEDD\\ActividadExtraBalanceo\\texto1.txt";
        String urlTxt2 = "C:\\Users\\omarl\\OneDrive\\Documentos\\TareasEDD\\ActividadExtraBalanceo\\texto2.txt";
        String txt1 = LeerBalancear.leerArchivo(urlTxt1);
        String txt2 = LeerBalancear.leerArchivo(urlTxt2);
        
        
        if (LeerBalancear.balancear(txt1)) {
            System.out.println("EL texto 1 se encuentra balanceado correctamente");
        } else {
            System.out.println("El texto 1 no está balanceado ");
        }
        
        System.out.println("----------------------------");
        
       
        if (LeerBalancear.balancear(txt2)) {
            System.out.println("EL texto 2 se encuentra balanceado correctamente");
        }else{
            System.out.println("El texto 2 no está balamceado");
        }
             
    }      
        
}
