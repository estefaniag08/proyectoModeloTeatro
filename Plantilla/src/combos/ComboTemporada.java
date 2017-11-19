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
public class ComboTemporada extends Combo {
    private final double precio = 25000;

    public String comida() {
        return "Hamburguesa"+"\n" +
               "Palomitas Medianas";
    }
    public String bebida() {
        return "Gaseosa mediana";
    }

    public String complemento() {
        return "Muñeco de temporada";
    }

    public String precio() {
        return (String.valueOf(precio));
    }
}
