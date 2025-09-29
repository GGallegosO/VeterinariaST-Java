/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Santo Tomas
 */
public class Cuidador {

    private int id;
    private String nombre;
    private String run;
    private int edad;

    public Cuidador() {
    }

    public Cuidador(int id, String nombre, String run, int edad) {
        this.id = id;
        //this.nombre = nombre;
        setNombre(nombre);
        //this.run = run;
        setRun(run);
        //this.edad = edad;
        setEdad(edad);
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

    // tamaño desde 1 a 15
    // obligatorio
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre es requerido");
        }

        if (nombre.length() >= 1 && nombre.length() <= 15) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no cumple con el rango");
        }
    }

    public String getRun() {
        return run;
    }
    
    // obligatorio
    // tamaño desde 8 a 9
    // que el ultimo valor debe 1 al 9 o K
    public void setRun(String run) {
        //String runNuevo = run.toUpperCase(); // K
        String runNuevo = run.toLowerCase();  // k
        
        if (runNuevo == null || runNuevo.trim().isEmpty()) {
            System.out.println("El run es requerido");
        }
        if (runNuevo.length() >= 8 && runNuevo.length() <= 9) {
            //String ultimaLetra = runNuevo[-1];
            // regla de el ultimo es 0 a 9 o K
            this.run = runNuevo;
        } else {
            System.out.println("El run no cumple con el rango");
        }
    }

    public int getEdad() {
        return edad;
    }

    // el numero 0
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 100) {
           this.edad = edad; 
        } else {
            System.out.println("La edad no esta en los parametros permitidos.");
        }        
    }

    @Override
    public String toString() {
        return "Cuidador{" + "id=" + id + ", nombre=" + nombre + ", run=" + run + ", edad=" + edad + '}';
    }
}
