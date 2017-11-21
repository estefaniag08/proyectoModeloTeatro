/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author zachl
 */
public interface EmpleadoCine {
    public void queja(String reclamo);
    public void setNext(EmpleadoCine nivel);
}
