/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatro;

/**
 *
 * @author zachl
 */
public class Cine6d extends CineDecorado {
    public Cine llamada;
    public Cine6d(Cine llama){
        llamada = llama;
    }
    public String prepararFuncion(){
        return llamada.prepararFuncion()+"y se prepararon las sillas mobiles";
    }
}
