/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Equipos {
    private String nombre,ciudad,pais,estadio;

    public Equipos(String nombre, String ciudad, String pais, String estadio) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.estadio = estadio;
    }

    public Equipos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return "Equipos{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", pais=" + pais + ", estadio=" + estadio + '}';
    }
    
    
}
