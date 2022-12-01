/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author usuario
 */
public class SuperUsuario extends Persona{
   private String rango;

    public SuperUsuario(String rango, String nombre, String apellido, String usuario, String contrasenia, int edad) {
        super(nombre, apellido, usuario, contrasenia, edad);
        this.rango = rango;
    }

    
    
    public String toString() {
        return  super.toString() + ":" + rango ;
    }
   
   
    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    
   
   
}
