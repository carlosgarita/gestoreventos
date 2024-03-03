/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestoreventos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Clase_01_RegistrarEventos {
    public static GUI_01_RegistrarEventos ventanaRegistroEventos = new GUI_01_RegistrarEventos();
    // Lista para almacenar los eventos registrados
    private static List<Clase_Evento> listaEventos = new ArrayList<>();
    
        
    public static void mostrar() {
        ventanaRegistroEventos.setVisible(true);
    }

    public static void ocultar() {
        ventanaRegistroEventos.setVisible(false);
    }
   
    public static void guardarEvento(Clase_Evento evento) {
        listaEventos.add(evento);
        System.out.println("Evento registrado: " + evento);
        imprimirListaEventos(); // Llama a la función para imprimir la lista de eventos
    }

    private static void imprimirListaEventos() {
        System.out.println("------ Lista de Eventos Registrados ------");
        for (Clase_Evento evento : listaEventos) {
            System.out.println(evento);
        }
        System.out.println("------------------------------------------");
    }
    
    public static List<Clase_Evento> getListaEventos() {
        return listaEventos;
    } 
    
}
