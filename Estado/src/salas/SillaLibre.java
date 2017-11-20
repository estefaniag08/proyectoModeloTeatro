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
public class SillaLibre extends Silla{
    public int verEstado(){ //le permite al cliente saber que la silla esta libre
        return 0;
    }
    @Override
    public void pedirReserva(){ //le pide a Compra Boleta que cambie el estado de la silla
        CompraDeBoletas boleta = new CompraDeBoletas();
        boleta.reservarSilla();
    }
}
