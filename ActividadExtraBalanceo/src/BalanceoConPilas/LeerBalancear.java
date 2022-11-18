/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BalanceoConPilas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author omarl
 */
public class LeerBalancear {

    public static String leerArchivo(String direccionT) throws IOException {
        String texto = "";
        BufferedReader read = new BufferedReader(new FileReader(direccionT));
        String linea;
        while ((linea = read.readLine()) != null) {
            texto += linea + "\n";
        }
        return texto;
    }

    public static boolean balancear(String texto) {

        PilaADT<Character> pila = new PilaADT<>();
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == '{' || c == '[' || c =='(' ) {
                pila.push(c);
            }
            if (c == '}') {
                if (!pila.peek().equals('{')) {
                    return false;
                }
                pila.pop();
                System.out.println("}");
            }
            if (c == ']') {
                if (!pila.peek().equals('[')) {
                    return false;
                }
                System.out.println("]");
                pila.pop();
            }
            if (c == ')') {
                if (!pila.peek().equals('(')) {
                    return false;
                }
                System.out.println(")");
                pila.pop();
            }
        }
        return pila.isEmpty();
    }

}
