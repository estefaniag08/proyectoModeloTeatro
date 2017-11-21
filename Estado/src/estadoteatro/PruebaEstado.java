/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadoteatro;
import gestor.*;
import salas.*;
/**
 *
 * @author zachl
 */
public class PruebaEstado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorInformacion gestor = new GestorInformacion();
        CompraDeBoletas boleta = new CompraDeBoletas();
        int fila;
        int columna = -1;
        String colum;
        for (int x = 0; x < 7; x++) { //inicializa la matriz de silla a sillaLibre
                for (int y = 0; y < 7; y++) {
                    boleta.silla[x][y]=new SillaLibre();
                }
            } 
        while (true) {
            gestor.muestraTexto("Porfavor seleccione la columna de la silla que desee (escriba la letra en mayusculas)");
            gestor.muestraTexto(" ABCDEFG");
            for (int x = 0; x < 7; x++) { //imprime la matriz de objetos de tipo silla 7x7
                System.out.print(String.valueOf(x));
                for (int y = 0; y < 7; y++) {
                    System.out.print(boleta.silla[x][y].verEstado());
                }
                System.out.println();
            }
            colum = gestor.leerString();
            switch (colum) { // "convierte" la seleccion en letras, a numeros
                case "A":
                    columna = 0;
                    break;
                case "B":
                    columna = 1;
                    break;
                case "C":
                    columna = 2;
                    break;
                case "D":
                    columna = 3;
                    break;
                case "E":
                    columna = 4;
                    break;
                case "F":
                    columna = 5;
                    break;
                case "G":
                    columna = 6;
                    break;    
            }
            gestor.muestraTexto("Porfavor seleccione la fila de la silla que desee (digite el numero correspondiente)");
            fila = gestor.leerInt();
            boleta.pedirReserva(fila, columna); //hace la peticion del lugar de la silla
        }
    }
    
}
