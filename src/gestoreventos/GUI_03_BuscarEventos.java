/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */





package gestoreventos;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 * 

 *
 * @author HP
 */
public class GUI_03_BuscarEventos extends javax.swing.JFrame {

    /**
     * Creates new form GUI_BuscarEventos
     */
    
    // Variable para almacenar los eventos encontrados
    private List<Clase_Evento> eventosEncontrados;
    
    
    public GUI_03_BuscarEventos() {
        initComponents();
        
        combobox_Anio.setSelectedIndex(-1);
        combobox_Mes.setSelectedIndex(-1);
                
        label_EventoID.setText("");
        text_EventoAnio.setText("");
        combobox_EventoMes.setSelectedIndex(-1);
        combobox_EventoDia.setSelectedIndex(-1);
        combobox_EventoHora.setSelectedIndex(-1);
        combobox_EventoDeporte.setSelectedIndex(-1);
        txt_NombreCompeticion.setText("");
        txt_EventoPais.setText("");
        txt_EventoEquipoA.setText("");
        txt_EventoEquipoB.setText("");
    }

private void mostrarEventosEnTabla(List<Clase_Evento> eventos) {
    DefaultTableModel model = (DefaultTableModel) table_Eventos.getModel();
    model.setRowCount(0); // Limpiar la tabla
    
    for (Clase_Evento evento : eventos) {
        Object[] rowData = {evento.getIdEvento(), evento.getAnioEvento(), evento.getMesEvento(), 
                            evento.getDiaEvento(), evento.getHoraEvento(), evento.getDeporte(),
                            evento.getNombreCompetencia(), evento.getPaisCompetencia(),
                            evento.getEquipoA(), evento.getEquipoB()};
        model.addRow(rowData); // Agregar fila a la tabla
    }
}
    
   
    
    // Método para cargar los datos del evento seleccionado en los campos de edición
    private void cargarDatosEvento(int filaSeleccionada) {
        Clase_Evento evento = eventosEncontrados.get(filaSeleccionada);

        // Cargar los datos del evento en los campos de texto y combobox
        label_EventoID.setText(String.valueOf(evento.getIdEvento()));
        text_EventoAnio.setText(String.valueOf(evento.getAnioEvento()));
        combobox_EventoMes.setSelectedItem(evento.getMesEvento());
        combobox_EventoDia.setSelectedItem(String.valueOf(evento.getDiaEvento()));
        combobox_EventoHora.setSelectedItem(String.valueOf(evento.getHoraEvento()));
        combobox_EventoDeporte.setSelectedItem(String.valueOf(evento.getDeporte()));
        txt_NombreCompeticion.setText(evento.getNombreCompetencia());
        txt_EventoPais.setText(evento.getPaisCompetencia());
        txt_EventoEquipoA.setText(evento.getEquipoA());
        txt_EventoEquipoB.setText(evento.getEquipoB());
    }
    
    private List<Clase_Evento> obtenerEventosPorFecha(int anio, String mes) {
    List<Clase_Evento> eventosCoincidentes = new ArrayList<>();
    
    // Obtener la lista de eventos almacenada en otra clase (supongamos que se llama ClaseConListaEventos)
    List<Clase_Evento> listaEventos = Clase_01_RegistrarEventos.getListaEventos();
    
    // Recorrer la lista de eventos y añadir los eventos que coincidan con el año y mes seleccionados
    for (Clase_Evento evento : listaEventos) {
        if (evento.getAnioEvento() == anio && evento.getMesEvento().equalsIgnoreCase(mes)) {
            eventosCoincidentes.add(evento);
        }
    }
    
    return eventosCoincidentes;
}

     // Método para actualizar el evento con los datos modificados
    private void actualizarEvento(int idEvento, int anio, String mes, int dia, String hora, String deporte, String competencia, String equipoA, String equipoB) {
        // Implementa la lógica para actualizar el evento en tu lista de eventos
    }

    
    
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
        jLabel9 = new javax.swing.JLabel();
        txt_EventoEquipoA = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_EventoEquipoB = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JButton();
        label_EventoID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_EventoAnio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combobox_EventoMes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        combobox_EventoDia = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        combobox_EventoHora = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        combobox_EventoDeporte = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_NombreCompeticion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_EventoPais = new javax.swing.JTextField();
        combobox_Mes = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        combobox_Anio = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Eventos = new javax.swing.JTable();
        btn_Mostrar = new javax.swing.JButton();
        btn_Seleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Buscar Eventos");

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        jLabel9.setText("Pais:");

        jLabel10.setText("Equipo A:");

        jLabel11.setText("Equipo B:");

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        label_EventoID.setText("0000");

        jLabel2.setText("ID:");

        jLabel3.setText("Año:");

        combobox_EventoMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel4.setText("Mes:");

        combobox_EventoDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel5.setText("Día:");

        combobox_EventoHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0000", "0030", "0100", "0130", "0200", "0230", "0300", "0330", "0400", "0430", "0500", "0530", "0600", "0630", "0700", "0730", "0800", "0830", "0900", "0930", "1000", "1030", "1100", "1130", "1200", "1230", "1300", "1330", "1400", "1430", "1500", "1530", "1600", "1630", "1700", "1730", "1800", "1830", "1900", "1930", "2000", "2030", "2100", "2130", "2200", "2230", "2300", "2330", " " }));

        jLabel6.setText("Hora:");

        combobox_EventoDeporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fútbol", "Béisbol", "Voleibol", "Básquetbol", "Fútbol Americano", "Balonmano", "Rugby", "Hockey" }));

        jLabel7.setText("Deporte:");

        jLabel8.setText("Competición:");

        combobox_Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel12.setText("Mes:");

        jLabel13.setText("Año:");

        combobox_Anio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));

        table_Eventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Año", "Mes", "Dia", "Hora", "Deporte", "Competicion", "Pais", "Equipo A", "Equipo B"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_Eventos);

        btn_Mostrar.setText("Mostrar");
        btn_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MostrarActionPerformed(evt);
            }
        });

        btn_Seleccionar.setText("Seleccionar");
        btn_Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Seleccionar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(combobox_Mes, 0, 203, Short.MAX_VALUE)
                                        .addComponent(combobox_Anio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(54, 54, 54)
                                    .addComponent(btn_Mostrar))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label_EventoID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(text_EventoAnio)
                                        .addComponent(combobox_EventoMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(combobox_EventoDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(combobox_EventoHora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(combobox_EventoDeporte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_NombreCompeticion)
                                        .addComponent(txt_EventoPais)
                                        .addComponent(txt_EventoEquipoA, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_EventoEquipoB, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Salir)))
                            .addComponent(btn_Guardar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(177, 177, 177))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(label_EventoID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(text_EventoAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(combobox_Anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(combobox_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Mostrar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combobox_EventoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combobox_EventoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combobox_EventoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combobox_EventoDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_NombreCompeticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_EventoPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_EventoEquipoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_EventoEquipoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Guardar)
                    .addComponent(btn_Seleccionar))
                .addGap(52, 52, 52)
                .addComponent(btn_Salir)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        Clase_03_BuscarEventos.ocultar();
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
        String equipoB = txt_EventoEquipoB.getText();

        // Crear una instancia de Clase_Evento y establecer los valores
        // Obtener la lista de eventos de la otra clase
        List<Clase_Evento> listaEventos = Clase_01_RegistrarEventos.getListaEventos();
        // Buscar el evento en la lista de eventos y actualizar sus valores
        for (Clase_Evento evento : listaEventos) {
            if (evento.getIdEvento() == idEvento) {
                evento.setAnioEvento(anioEvento);
                evento.setMesEvento(mesEvento);
                evento.setDiaEvento(diaEvento);
                evento.setHoraEvento(horaEvento);
                evento.setDeporte(deporte);
                evento.setNombreCompetencia(nombreCompetencia);
                evento.setPaisCompetencia(paisCompetencia);
                evento.setEquipoA(equipoA);
                evento.setEquipoB(equipoB);
                break; // No es necesario continuar buscando una vez que se encuentra el evento
            }
        }
        
        /*
        Clase_Evento evento = new Clase_Evento();
        //evento.setIdEvento(idEvento);
        evento.setAnioEvento(anioEvento);
        evento.setMesEvento(mesEvento);
        evento.setDiaEvento(diaEvento);
        evento.setHoraEvento(horaEvento);
        evento.setDeporte(deporte);
        evento.setNombreCompetencia(nombreCompetencia);
        evento.setPaisCompetencia(paisCompetencia);
        evento.setEquipoA(equipoA);
        evento.setEquipoB(equipoB);
        */
        // Ahora puedes hacer lo que quieras con la instancia de Clase_Evento, como agregarla a una lista
        // de eventos o pasársela a otro método para su procesamiento adicional

        //Clase_01_RegistrarEventos.guardarEvento(evento);
        
        DefaultTableModel model = (DefaultTableModel) table_Eventos.getModel();
        model.setRowCount(0); // Esto limpia la tabla

        
        combobox_Anio.setSelectedIndex(-1);
        combobox_Mes.setSelectedIndex(-1);
                
        label_EventoID.setText("");
        text_EventoAnio.setText("");
        combobox_EventoMes.setSelectedIndex(-1);
        combobox_EventoDia.setSelectedIndex(-1);
        combobox_EventoHora.setSelectedIndex(-1);
        combobox_EventoDeporte.setSelectedIndex(-1);
        txt_NombreCompeticion.setText("");
        txt_EventoPais.setText("");
        txt_EventoEquipoA.setText("");
        txt_EventoEquipoB.setText("");
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarActionPerformed
        // Obtener el año y mes seleccionados
    int anio = Integer.parseInt(combobox_Anio.getSelectedItem().toString());
    String mes = combobox_Mes.getSelectedItem().toString();
    
    // Obtener la lista de eventos que coinciden con el año y el mes seleccionados
    List<Clase_Evento> eventosCoincidentes = obtenerEventosPorFecha(anio, mes);
    
    // Mostrar los eventos en la tabla
    mostrarEventosEnTabla(eventosCoincidentes);
    }//GEN-LAST:event_btn_MostrarActionPerformed

    private void btn_SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeleccionarActionPerformed
        // Obtener el índice de la fila seleccionada en la tabla
    int filaSeleccionada = table_Eventos.getSelectedRow();
    
    // Verificar si se seleccionó alguna fila
    if (filaSeleccionada != -1) {
        // Obtener los valores de la fila seleccionada
        String id = table_Eventos.getValueAt(filaSeleccionada, 0).toString();
        String anio = table_Eventos.getValueAt(filaSeleccionada, 1).toString();
        String mes = table_Eventos.getValueAt(filaSeleccionada, 2).toString();
        String dia = table_Eventos.getValueAt(filaSeleccionada, 3).toString();
        String hora = table_Eventos.getValueAt(filaSeleccionada, 4).toString();
        String deporte = table_Eventos.getValueAt(filaSeleccionada, 5).toString();
        String competicion = table_Eventos.getValueAt(filaSeleccionada, 6).toString();
        String pais = table_Eventos.getValueAt(filaSeleccionada, 7).toString();
        String equipoA = table_Eventos.getValueAt(filaSeleccionada, 8).toString();
        String equipoB = table_Eventos.getValueAt(filaSeleccionada, 9).toString();

        // Convertir el día de String a entero
        int diaNumero = Integer.parseInt(dia);

        // Convertir el día de nuevo a String con cero adelante si es necesario
        String diaComboBox = (diaNumero < 10) ? "0" + diaNumero : String.valueOf(diaNumero);
        
       // Mostrar los valores en los campos de texto y comboboxes
        label_EventoID.setText(id);
        text_EventoAnio.setText(anio);
        combobox_EventoMes.setSelectedItem(mes);
        combobox_EventoDia.setSelectedItem(diaComboBox);
        combobox_EventoHora.setSelectedItem(hora);
        combobox_EventoDeporte.setSelectedItem(deporte);
        txt_NombreCompeticion.setText(competicion);
        txt_EventoPais.setText(pais);
        txt_EventoEquipoA.setText(equipoA);
        txt_EventoEquipoB.setText(equipoB);
        
    } else {
        // Si no se seleccionó ninguna fila, mostrar un mensaje de advertencia
        JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btn_SeleccionarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_03_BuscarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_03_BuscarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_03_BuscarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_03_BuscarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_03_BuscarEventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Mostrar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_Seleccionar;
    private javax.swing.JComboBox<String> combobox_Anio;
    private javax.swing.JComboBox<String> combobox_EventoDeporte;
    private javax.swing.JComboBox<String> combobox_EventoDia;
    private javax.swing.JComboBox<String> combobox_EventoHora;
    private javax.swing.JComboBox<String> combobox_EventoMes;
    private javax.swing.JComboBox<String> combobox_Mes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_EventoID;
    private javax.swing.JTable table_Eventos;
    private javax.swing.JTextField text_EventoAnio;
    private javax.swing.JTextField txt_EventoEquipoA;
    private javax.swing.JTextField txt_EventoEquipoB;
    private javax.swing.JTextField txt_EventoPais;
    private javax.swing.JTextField txt_NombreCompeticion;
    // End of variables declaration//GEN-END:variables
}
