/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiquetes;
/**
 *
 * @author zachl
 */
public class ComboPareja extends Combo {
    private final double precio = 40000;

    public String comida() {
        return "Dos perros calientes"+"\n" +
               "Palomitas pequeñas";
    }
    public String bebida() {
        return "Dos gaseosas medianas";
    }

    public String complemento() {
        return "Nada";
    }

    public String precio() {
        return (String.valueOf(precio));
    }
}
