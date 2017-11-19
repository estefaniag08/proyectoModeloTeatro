/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;
import teatro.Cine;
import teatro.Cine3d;
import teatro.Cine4d;
import teatro.Cine6d;
import teatro.Sala;
import teatro.CineDecorado;
import gestor.*;
import java.util.Scanner;
/**
 *
 * @author zachl
 */
public class MainDeco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorInformacion gestor = new GestorInformacion();
        Sala sala = new Cine();
        CineDecorado dec = null;
        int opcion;
        while (true) {
            System.out.println("digite el numero correspondiente a como desea organizar la sala de cine");
            System.out.println("1.preparar para cine 2d");
            System.out.println("2.preparar para cine 3d");
            System.out.println("3.preparar para cine 4d");
            System.out.println("4.preparar para cine 6d");
            System.out.println("5.Desabilitar el cine");
            opcion = gestor.leerInt();
            switch (opcion) {
                case 1:
                    gestor.muestraTexto(sala.prepararFuncion());
                    break;
                case 2:
                    dec = new Cine3d((Cine) sala);
                    gestor.muestraTexto(dec.prepararFuncion());
                    break;
                case 3:
                    dec = new Cine4d((Cine) sala);
                    gestor.muestraTexto(dec.prepararFuncion());
                    break;
                case 4:
                    dec = new Cine6d((Cine) sala);
                    gestor.muestraTexto(dec.prepararFuncion());
                    break;
            }
            if(opcion==5){
                break;
            }
        }
    }
}
