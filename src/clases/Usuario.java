/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author usuario
 */
public class Usuario extends Persona{
    private int cantidadPuntos,partidasJugadas;

    public Usuario(int cantidadPuntos, int partidasJugadas, String nombre, String apellido, String usuario, String contrasenia, int edad) {
        super(nombre, apellido, usuario, contrasenia, edad);
        this.cantidadPuntos = cantidadPuntos;
        this.partidasJugadas = partidasJugadas;
    }
    
    
    
    public String toString() {
        return cantidadPuntos + ":" + partidasJugadas + ":" + super.toString();
    }

    
    public int getCantidadPuntos() {
        return cantidadPuntos;
    }

    public void setCantidadPuntos(int cantidadPuntos) {
        this.cantidadPuntos = cantidadPuntos;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }
    
    
}
