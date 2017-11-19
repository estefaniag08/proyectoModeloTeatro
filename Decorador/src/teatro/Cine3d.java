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
public class Cine3d extends CineDecorado {
    public Cine cine;
    public Cine3d(Cine cin){
        cine = cin;
    }
    public String prepararFuncion(){
        return cine.prepararFuncion()+" y se entregaron las gafas 3d a los clientes"+"\n";
    }
}
