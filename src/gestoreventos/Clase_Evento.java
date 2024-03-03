/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestoreventos;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author HP
 */
public class Clase_Evento {
    private int idEvento;
    private int anioEvento;
    private String mesEvento;
    private int diaEvento;
    private String horaEvento;
    private String deporte;
    private String nombreCompetencia;
    private String paisCompetencia;
    private String equipoA;
    private String equipoB;

    // Listas para los dropdowns
    private final List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
    private final List<String> horas = new ArrayList<>();
    private final List<String> deportes = Arrays.asList("Fútbol", "Béisbol", "Voleibol", "Básquetbol", "Fútbol Americano", "Balonmano", "Rugby", "Hockey");


    // Constructor
    public Clase_Evento() {
        // Inicializar lista de horas
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j += 30) {
                String hora = String.format("%02d:%02d", i, j);
                horas.add(hora);
            }
        }
    }

    // Getters y setters
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public int getAnioEvento() {
        return anioEvento;
    }

    public void setAnioEvento(int anioEvento) {
        this.anioEvento = anioEvento;
    }

    public String getMesEvento() {
        return mesEvento;
    }

    public void setMesEvento(String mesEvento) {
        this.mesEvento = mesEvento;
    }

    public int getDiaEvento() {
        return diaEvento;
    }

    public void setDiaEvento(int diaEvento) {
        this.diaEvento = diaEvento;
    }

    public String getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(String horaEvento) {
        this.horaEvento = horaEvento;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getNombreCompetencia() {
        return nombreCompetencia;
    }

    public void setNombreCompetencia(String nombreCompetencia) {
        this.nombreCompetencia = nombreCompetencia;
    }

    public String getPaisCompetencia() {
        return paisCompetencia;
    }

    public void setPaisCompetencia(String paisCompetencia) {
        this.paisCompetencia = paisCompetencia;
    }

    public String getEquipoA() {
        return equipoA;
    }

    public void setEquipoA(String equipoA) {
        this.equipoA = equipoA;
    }

    public String getEquipoB() {
        return equipoB;
    }

    public void setEquipoB(String equipoB) {
        this.equipoB = equipoB;
    }

    public List<String> getMeses() {
        return meses;
    }

    public List<String> getHoras() {
        return horas;
    }
    
    public List<String> getDeportes() {
        return deportes;
    }

    public int obtenerCantidadDiasMes(String mes) {
        switch (mes) {
            case "Enero", "Marzo", "Mayo", "Julio", "Agosto", "Octubre", "Diciembre" -> {
                return 31;
            }
            case "Abril", "Junio", "Septiembre", "Noviembre" -> {
                return 30;
            }
            case "Febrero" -> {
                if (esBisiesto(anioEvento)) {
                    return 29;
                } else {
                    return 28;
                }
            }
            default -> {
                return 0;
            }
        }
    }

    private boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
    
    @Override
    public String toString() {
        return "Evento: [ID=" + idEvento + ", Año=" + anioEvento + ", Mes=" + mesEvento + ", Día=" + diaEvento + ", Hora=" + horaEvento +
               ", Deporte=" + deporte + ", Competencia=" + nombreCompetencia + ", País=" + paisCompetencia + ", Equipo A=" + equipoA +
               ", Equipo B=" + equipoB + "]";
    }
}

