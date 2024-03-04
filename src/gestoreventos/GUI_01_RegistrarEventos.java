/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestoreventos;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class GUI_01_RegistrarEventos extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRegistroEventos
     */
    public GUI_01_RegistrarEventos() {
        initComponents();
        combobox_EventoMes.setSelectedIndex(-1); // Establecer el índice seleccionado como -1 para que no haya nada seleccionado
        combobox_EventoDia.setSelectedIndex(-1);
        combobox_EventoHora.setSelectedIndex(-1);
        combobox_EventoDeporte.setSelectedIndex(-1);
        
        idConsecutivo = generarIDConsecutivo();
        label_EventoID.setText(idConsecutivo);
        
    }
    
    private static int contadorID = 0; // Iniciar el contador en cero
    
    // Método para generar un ID consecutivo de 4 dígitos
    public static String generarIDConsecutivo() {
        String id = String.format("%04d", contadorID); // Formatear el ID como un número de 4 dígitos con ceros a la izquierda
        contadorID++; // Incrementar el contador
        return id;
    }
    
    // Método para reiniciar el contador de IDs
    public static void reiniciarContador() {
        contadorID = 0; // Reiniciar el contador a cero
    }
    
    String idConsecutivo = generarIDConsecutivo();
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        label_EventoID = new javax.swing.JLabel();
        text_EventoAnio = new javax.swing.JTextField();
        combobox_EventoMes = new javax.swing.JComboBox<>();
        combobox_EventoDia = new javax.swing.JComboBox<>();
        combobox_EventoHora = new javax.swing.JComboBox<>();
        combobox_EventoDeporte = new javax.swing.JComboBox<>();
        txt_NombreCompeticion = new javax.swing.JTextField();
        txt_EventoPais = new javax.swing.JTextField();
        txt_EventoEquipoA = new javax.swing.JTextField();
        text_EventoEquipoB = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registro de Eventos");

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        jLabel3.setText("Año:");

        jLabel4.setText("Mes:");

        jLabel5.setText("Día:");

        jLabel6.setText("Hora:");

        jLabel7.setText("Deporte:");

        jLabel8.setText("Nombre de competición:");

        jLabel9.setText("Pais:");

        jLabel10.setText("Equipo A:");

        jLabel11.setText("Equipo B:");

        label_EventoID.setText("0000");

        combobox_EventoMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" }));

        combobox_EventoDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        combobox_EventoHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0000", "0030", "0100", "0130", "0200", "0230", "0300", "0330", "0400", "0430", "0500", "0530", "0600", "0630", "0700", "0730", "0800", "0830", "0900", "0930", "1000", "1030", "1100", "1130", "1200", "1230", "1300", "1330", "1400", "1430", "1500", "1530", "1600", "1630", "1700", "1730", "1800", "1830", "1900", "1930", "2000", "2030", "2100", "2130", "2200", "2230", "2300", "2330", " " }));

        combobox_EventoDeporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fútbol", "Béisbol", "Voleibol", "Básquetbol", "Fútbol Americano", "Balonmano", "Rugby", "Hockey" }));

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Salir)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Guardar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_EventoID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(text_EventoAnio)
                                    .addComponent(combobox_EventoMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combobox_EventoDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combobox_EventoHora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combobox_EventoDeporte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_NombreCompeticion)
                                    .addComponent(txt_EventoPais)
                                    .addComponent(txt_EventoEquipoA)
                                    .addComponent(text_EventoEquipoB, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(label_EventoID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(text_EventoAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combobox_EventoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combobox_EventoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(combobox_EventoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combobox_EventoDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_NombreCompeticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_EventoPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_EventoEquipoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(text_EventoEquipoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Salir)
                    .addComponent(btn_Guardar))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        Clase_01_RegistrarEventos.ocultar();
        Clase_00_MenuPrincipal.mostrar();
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        // Recolectar datos de la GUI
        int idEvento = Integer.parseInt(label_EventoID.getText());
        int anioEvento = Integer.parseInt(text_EventoAnio.getText());
        String mesEvento = (String) combobox_EventoMes.getSelectedItem();
        int diaEvento = Integer.parseInt((String) combobox_EventoDia.getSelectedItem());
        String horaEvento = (String) combobox_EventoHora.getSelectedItem();
        String deporte = (String) combobox_EventoDeporte.getSelectedItem();
        String nombreCompetencia = txt_NombreCompeticion.getText();
        String paisCompetencia = txt_EventoPais.getText();
        String equipoA = txt_EventoEquipoA.getText();
        String equipoB = text_EventoEquipoB.getText();

        // Crear una instancia de Clase_Evento y establecer los valores
        Clase_Evento evento = new Clase_Evento();
        evento.setIdEvento(idEvento);
        evento.setAnioEvento(anioEvento);
        evento.setMesEvento(mesEvento);
        evento.setDiaEvento(diaEvento);
        evento.setHoraEvento(horaEvento);
        evento.setDeporte(deporte);
        evento.setNombreCompetencia(nombreCompetencia);
        evento.setPaisCompetencia(paisCompetencia);
        evento.setEquipoA(equipoA);
        evento.setEquipoB(equipoB);

        // Ahora puedes hacer lo que quieras con la instancia de Clase_Evento, como agregarla a una lista
        // de eventos o pasársela a otro método para su procesamiento adicional
        
        Clase_01_RegistrarEventos.guardarEvento(evento);
        
        combobox_EventoMes.setSelectedIndex(-1); // Establecer el índice seleccionado como -1 para que no haya nada seleccionado
        combobox_EventoDia.setSelectedIndex(-1);
        combobox_EventoHora.setSelectedIndex(-1);
        combobox_EventoDeporte.setSelectedIndex(-1);
        
        label_EventoID.setText("");
        text_EventoAnio.setText("");
        txt_NombreCompeticion.setText("");
        txt_EventoPais.setText("");
        txt_EventoEquipoA.setText("");
        text_EventoEquipoB.setText("");
        
        idConsecutivo = generarIDConsecutivo();
        label_EventoID.setText(idConsecutivo);
    }//GEN-LAST:event_btn_GuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_01_RegistrarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_01_RegistrarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_01_RegistrarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_01_RegistrarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_01_RegistrarEventos().setVisible(true);
            }
        });
    }

    public JComboBox<String> getCombobox_EventoDeporte() {
        return combobox_EventoDeporte;
    }

    public JComboBox<String> getCombobox_EventoDia() {
        return combobox_EventoDia;
    }

    public JComboBox<String> getCombobox_EventoHora() {
        return combobox_EventoHora;
    }

    public JComboBox<String> getCombobox_EventoMes() {
        return combobox_EventoMes;
    }

    public JLabel getLabel_EventoID() {
        return label_EventoID;
    }

    public JTextField getText_EventoAnio() {
        return text_EventoAnio;
    }

    public JTextField getText_EventoEquipoB() {
        return text_EventoEquipoB;
    }

    public JTextField getTxt_EventoEquipoA() {
        return txt_EventoEquipoA;
    }

    public JTextField getTxt_EventoPais() {
        return txt_EventoPais;
    }

    public JTextField getTxt_NombreCompeticion() {
        return txt_NombreCompeticion;
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JComboBox<String> combobox_EventoDeporte;
    private javax.swing.JComboBox<String> combobox_EventoDia;
    private javax.swing.JComboBox<String> combobox_EventoHora;
    private javax.swing.JComboBox<String> combobox_EventoMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_EventoID;
    private javax.swing.JTextField text_EventoAnio;
    private javax.swing.JTextField text_EventoEquipoB;
    private javax.swing.JTextField txt_EventoEquipoA;
    private javax.swing.JTextField txt_EventoPais;
    private javax.swing.JTextField txt_NombreCompeticion;
    // End of variables declaration//GEN-END:variables
}
