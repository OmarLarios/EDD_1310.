/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntos;
import ADT.Conjunto;
      
/**
 *
 * @author omarl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conjunto A = new Conjunto();
        for (int i = 1; i <=18; i++) {
            i=i+1;
            A.inserta((Integer)i);
        }
        System.out.println("El conjunto A es: "+A.getA());
        A.inserta(2); // insertar un elemento al conjunto 
        A.inserta(25);
        A.elimina(10); // elimina un elemento del conjunto
        A.elimina(5);
        System.out.println("Conjunto A: "+A.getA());
        System.out.println("-------- Igualdad --------");
         Conjunto B = new Conjunto(); 
         for (int i =-4; i <=23; i++) {
            i=i+3;
            B.inserta((Integer)i);
        }
        System.out.println("Conjunto A: " + A.getA() );
        System.out.println("Conjunto B: "+B.getA());
        System.out.println(A.igualdad(A.a, B.a));
        
        System.out.println("-----Unión-----");
        Conjunto X = new Conjunto(); //Nuevo conjunto
         for (int i = -8; i <=15; i++) {
            i=i+3;
            X.inserta((Integer)i);
        }
        Conjunto Z = new Conjunto(); //Nuevo conjunto
         for (int i = -2; i <=16; i++) {
            i=i+2;
            Z.inserta((Integer)i);
        }
        System.out.println("Conjunto X: " + X.getA() );
        System.out.println("Conjunto Z: "+Z.getA());
        System.out.println("UNION X ∪ Z: "+X.union(X.a, Z.a));
        
        System.out.println("----Intersección-------");
        System.out.println("Conjunto A: "+A.getA());
         System.out.println("Conjunto B: "+B.getA());
        System.out.println("Intersección A ∩ B: "+A.interseccion(A.a, B.a));
        
        System.out.println("------- Diferencia ----------");
        System.out.println("Conjunto B: "+B.getA());
        System.out.println("Conjunto Z: "+Z.getA());
        System.out.println("Diferencia B Z: "+B.diferencia(B.a, Z.a));
        
    }
    
}
