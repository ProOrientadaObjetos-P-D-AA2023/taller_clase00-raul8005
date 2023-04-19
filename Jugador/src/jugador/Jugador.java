/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jugador;

/**
 *
 * @author UTPL
 */
public class Jugador {

    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;

    public static void caminar() {
        System.out.println(nombre + apellido + cedula + edad + "está caminando.");
    }

    public static void correr() {
        System.out.println(nombre + apellido + cedula + edad + "está corriendo.");
    }

    public static void viajar() {
        System.out.println(nombre + apellido + cedula + edad + "está viajando.");
    }

}
