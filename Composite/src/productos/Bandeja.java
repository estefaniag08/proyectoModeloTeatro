/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;
import java.util.ArrayList;
/**
 *
 * @author zachl
 */
public class Bandeja extends ProductoTeatro {
    double precio=0;
    ArrayList<ProductoTeatro> producto = new ArrayList<>();
    @Override
    public double getPrecio(){
        for(int i=0;producto.size()>i;i++){
            precio=precio+producto.get(i).getPrecio();
        }
        return precio;
    }
    @Override
    public void agregarProducto(ProductoTeatro produ){
        producto.add(produ);
    }
    @Override
    public void sacarProducto(){
        producto.remove(producto.size()-1);
    }
    public ProductoTeatro obtenerProducto(int eleccion){
        return producto.get(eleccion);
    }
    
}
