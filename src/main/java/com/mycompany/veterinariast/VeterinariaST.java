/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veterinariast;

import modelo.Cuidador;
import modelo.Mascota;
import vista.VistaLogin;

/**
 *
 * @author Santo Tomas
 */
public class VeterinariaST {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Cuidador c1 = new Cuidador();
        c1.setNombre("Hola");
        
        System.out.println("***********************");
        System.out.println("");
        // instancias
        Cuidador cuidador1 = new Cuidador(1, "Mario", "111111", 500);
        Cuidador cuidador2 = new Cuidador(2, "Esteban", "22222", 32);
        Cuidador cuidadorSinMascota = new Cuidador(3, "Maria", "33333", 44);
        
        // 5 mascotas 
        
        // 3 con dueño
        Mascota mascota1 = new Mascota(1, "Felix", "Gato", cuidador1);
        Mascota mascota2 = new Mascota(2, "Tom", "Gato", cuidador1);

        Mascota mascota3 = new Mascota(3, "Jerry", "Ratón", cuidador2);

        // 2 sin dueño
        Mascota mascota4 = new Mascota(4, "Mordelon", "Perro", null);
        Mascota mascota5 = new Mascota(5, "Nemo", "Pez", null);

        
        System.out.println("nombre mascota 1 " + mascota1.getNombre());
        // puedo acceder al cuidado de la mascota 1
        System.out.println("nombre cuidador mascota 1 " + mascota1.getCuidador().getNombre());
        
        // el cuidador1 le regalo su mascota al cuidador sin mascota
        mascota1.setCuidador(cuidadorSinMascota);
        System.out.println("nombre cuidador mascota 1 " + mascota1.getCuidador().getNombre());
        
        
        // Instanciar Clase Tradicional
        VistaLogin vista = new VistaLogin();
        vista.setVisible(true);
        
        
        
        
        //otra forma de instanciar (Instancia anónima)
        //(new VistaLogin()).setVisible(true);
        
    }
}
