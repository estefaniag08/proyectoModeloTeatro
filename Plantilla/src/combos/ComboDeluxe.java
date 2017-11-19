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
public class ComboDeluxe extends Combo {
    private final double precio = 30000;

    public String comida() {
        return "Hamburguesa "+"\n" +
               "Palomitas medianas";
    }
    public String bebida() {
        return "Gaseosa extra grande";
    }

    public String complemento() {
        return "vaso de la pelicula";
    }

    public String precio() {
        return (String.valueOf(precio));
    }
}
