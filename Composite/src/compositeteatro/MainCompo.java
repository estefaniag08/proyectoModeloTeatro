/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeteatro;
import productos.*;
import gestor.*;
/**
 *
 * @author zachl
 */
public class MainCompo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorInformacion gestor = new GestorInformacion();
        ProductoTeatro bandeja = new Bandeja();
        ProductoTeatro producto;
        int opcion;
        while (true) {
            gestor.muestraTexto("seleccione el producto que desea agregar a la bandeja (para obtener el precio, seleccione cualquier otro numero)");
            gestor.muestraTexto("1. Gaseosa");
            gestor.muestraTexto("2. Hamburguesa");
            gestor.muestraTexto("3. Palomitas");
            gestor.muestraTexto("4. Papas");
            gestor.muestraTexto("5. Perro");
            opcion = gestor.leerInt();
            switch (opcion) {
                case 1:
                    producto = new Gaseosa();
                    bandeja.agregarProducto(producto);
                    break;
                case 2:
                    producto = new Hamburguesa();
                    bandeja.agregarProducto(producto);
                    break;
                case 3:
                    producto = new Palomitas();
                    bandeja.agregarProducto(producto);
                    break;
                case 4:
                    producto = new Papas();
                    bandeja.agregarProducto(producto);
                    break;
                case 5:
                    producto = new Perro();
                    bandeja.agregarProducto(producto);
                    break;
            }
            if(opcion>5||opcion<1){
                break;
            }
        }
        gestor.muestraTexto(String.valueOf(bandeja.getPrecio()));
    }
    
}
