/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salas;

/**
 *
 * @author zachl
 */
public class SillaOcupada extends Silla {
    
    public int verEstado(){ //le permite al cliente saber que la silla esta ocupada
        return 1;
    }
    public void pedirReserva(){ // planeado para decir que no se puede cambiar el estado de la silla
        
    }
}
