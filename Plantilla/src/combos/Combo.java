/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combos;
/**
 *
 * @author zachl
 */
public abstract class Combo{
    public String obtenerInfo(){
        return          "El combo que selecciono trae lo siguiente:" +"\n" +        
                        comida() + "\n" +
        		bebida()+ "\n" +
        		"Adicionalmente viene con un " +complemento() + "\n" +
        		"Precio del combo: " +precio()+ "\n";
    }
    public abstract String comida();
    public abstract String bebida();
    public abstract String complemento();
    public abstract String precio();
}
