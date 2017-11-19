/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantilla;
import tiquetes.*;
import gestor.*;
/**
 *
 * @author zachl
 */
public class Plantilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Combo combo = null;
        GestorInformacion gestor = new GestorInformacion();
        int eleccion;
        gestor.muestraTexto("bienvenido a la seccion de comidas del cine, seleccione el combo que desee ver");
        gestor.muestraTexto("1.Combo Deluxe");
        gestor.muestraTexto("2.Combo Pareja");
        gestor.muestraTexto("3.Combo de Temporada");
        eleccion = gestor.leerInt();
        switch(eleccion){
            case 1:
                combo= new ComboDeluxe();
                break;
            case 2:
                combo= new ComboPareja();
                break;
            case 3:
                combo= new ComboTemporada();
                break;
        }
        gestor.muestraTexto(combo.obtenerInfo());
    }
    
}
