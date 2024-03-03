/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestoreventos;

/**
 *
 * @author HP
 */
public class Clase_00_MenuPrincipal {
    public static GUI_00_MenuPrincipal ventanaPrincipal = new GUI_00_MenuPrincipal();
        
    public static void mostrar() {
        ventanaPrincipal.setVisible(true);
    }

    public static void ocultar() {
        ventanaPrincipal.setVisible(false);
    }
    
    public static void mostrarVentanaRegistroEventos() {
        ocultar();
        Clase_01_RegistrarEventos.mostrar();
    }
    
    public static void mostrarVentanaMostrarEventos() {
        ocultar();
        Clase_02_MostrarEventos.mostrar();
    }
    
    public static void mostrarVentanaBuscarEventos() {
        ocultar();
        Clase_03_BuscarEventos.mostrar();
    }
    
    public static void mostrarVentanaEncontrarEnRangoDeHoras() {
        ocultar();
        Clase_04_EncontrarEnRangoDeHoras.mostrar();
    }
    
    public static void mostrarVentanaOrdenarEventos() {
        ocultar();
        Clase_05_OrdenarEventos.mostrar();
    }
}
