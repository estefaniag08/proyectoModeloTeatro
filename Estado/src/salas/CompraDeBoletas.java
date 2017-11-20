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
public class CompraDeBoletas {
    public Silla[][] silla = new Silla[7][7];
    int x;
    int y;
    public void reservarSilla(){
        silla[x][y]= new SillaOcupada(); //cambia el estado de la silla 
    }
    public void pedirReserva(int x, int y){ //utiliza la accion del estado del objeto
        this.x=x;
        this.y=y;
        silla[x][y].pedirReserva();
    }
    
}
