package compositeteatro;
import productos.*;
import gestorFlujoConsola.*;
public class PruebaCompo {

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Salida salida = new Salida();
        ProductoTeatro bandeja = new Bandeja();
        ProductoTeatro producto;
        int opcion;
        while (true) {
            salida.mostrar("seleccione el producto que desea agregar a la bandeja (para obtener el precio, seleccione cualquier otro numero)");
            salida.mostrar("1. Gaseosa");
            salida.mostrar("2. Hamburguesa");
            salida.mostrar("3. Palomitas");
            salida.mostrar("4. Papas");
            salida.mostrar("5. Perro");
            salida.mostrar("6. Sacar el ultimo producto");
            opcion = entrada.leerEntero();
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
                case 6:
                	bandeja.sacarProducto();
                	break;
            }
            if(opcion>6||opcion<1){
                break;
            }
        }
        salida.mostrar(String.valueOf(bandeja.getPrecio()));
    }
    
}
