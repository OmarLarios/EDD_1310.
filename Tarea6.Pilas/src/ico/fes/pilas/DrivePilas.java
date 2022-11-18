package ico.fes.pilas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author omarl
 */
public class DrivePilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pila<String> nombres = new Pila<>();
        nombres.isEmpty();
       nombres.push("Omar");
       nombres.push("Santa");
       nombres.push("Daniela");
       nombres.push("Fernanda");
       nombres.push("Erick");
       nombres.push("Diosito");  
       nombres.toString();
       nombres.isEmpty();
      System.out.println("---------");
      nombres.pop();
      nombres.pop();
      nombres.toString();
      
      nombres.peek();
      nombres.lenght();
     
       

       
       
        
    }
    
}
