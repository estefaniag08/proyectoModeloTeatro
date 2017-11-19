/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;
import java.util.Scanner;
/**
 *
 * @author zachl
 */
public class GestorInformacion {
    private Scanner lectura = new Scanner (System.in);
    
    public String leerString(){
        String string = lectura.nextLine();
        return string;
    }
    public int leerInt(){
        int numeroInt = lectura.nextInt();
        return numeroInt;
    }
    public Double leerDouble(){
        double numeroDou = lectura.nextDouble();
        return numeroDou;
    }
    public void muestraTexto(String texto){
        System.out.println(texto);
    }
}
