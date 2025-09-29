/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Santo Tomas
 */
public class Mascota {
    private int id;
    private String nombre;
    private String tipo;
    private Cuidador cuidador;

    public Mascota() {
    }

    public Mascota(int id, String nombre, String tipo, Cuidador cuidador) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cuidador = cuidador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", cuidador=" + cuidador + '}';
    }
    
    
}
