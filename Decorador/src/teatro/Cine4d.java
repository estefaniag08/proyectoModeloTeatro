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
public class Cine4d extends CineDecorado {
    public Cine cine;
    public Cine4d(Cine cin){
        cine = cin;
    }
    public String prepararFuncion(){
        return cine.prepararFuncion()+" y se alisto el agua y los ventiladores"+"\n";
    }
}
