/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestoreventos;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author HP
 */

public class GUI_05_OrdenarEventos extends javax.swing.JFrame {

    private List<Clase_Evento> listaEventos;

    ButtonGroup grupoEquipos = new ButtonGroup();
    ButtonGroup grupoAlgoritmos = new ButtonGroup();
    DefaultTableModel tableModel;
    
    public GUI_05_OrdenarEventos() {
        initComponents();
        
        
        // Agregar los radio buttons al grupo
        grupoEquipos.add(radiobtn_EquipoA);
        grupoEquipos.add(radiobtn_EquipoB);

        grupoAlgoritmos.add(radiobtn_Seleccion);
        grupoAlgoritmos.add(radiobtn_Quicksort);

        // Inicializar la lista de eventos
        listaEventos = Clase_01_RegistrarEventos.getListaEventos();

        // Obtener el modelo de la tabla
        tableModel = (DefaultTableModel) table_Eventos.getModel();
    }
    
    public void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) table_Eventos.getModel();
        model.setRowCount(0);
    }
    
    private void ordenarEventos(String campoOrdenamiento, String algoritmoOrdenamiento) {
        // Copiar la lista de eventos a un arreglo
        Clase_Evento[] eventosArray = listaEventos.toArray(new Clase_Evento[0]);

        // Lógica de ordenamiento
        if (algoritmoOrdenamiento.equals("Selección")) {
            ordenarPorSeleccion(eventosArray, campoOrdenamiento);
        } else if (algoritmoOrdenamiento.equals("QuickSort")) {
            quickSort(eventosArray, campoOrdenamiento);
        }

        // Limpiar la tabla antes de agregar los eventos ordenados
        DefaultTableModel tableModel = (DefaultTableModel) table_Eventos.getModel();
        tableModel.setRowCount(0);

        // Agregar los eventos ordenados a la tabla
        for (Clase_Evento evento : eventosArray) {
            Object[] rowData = {
                evento.getIdEvento(),
                evento.getAnioEvento(),
                evento.getMesEvento(),
                evento.getDiaEvento(),
                evento.getHoraEvento(),
                evento.getDeporte(),
                evento.getNombreCompetencia(),
                evento.getPaisCompetencia(),
                evento.getEquipoA(),
                evento.getEquipoB()
            };
            tableModel.addRow(rowData);
        }
    }

    private void ordenarPorSeleccion(Clase_Evento[] eventosArray, String campoOrdenamiento) {
        for (int i = 0; i < eventosArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < eventosArray.length; j++) {
                if (campoOrdenamiento.equals("Equipo A")) {
                    if (eventosArray[j].getEquipoA().compareTo(eventosArray[minIndex].getEquipoA()) < 0) {
                        minIndex = j;
                    }
                } else if (campoOrdenamiento.equals("Equipo B")) {
                    if (eventosArray[j].getEquipoB().compareTo(eventosArray[minIndex].getEquipoB()) < 0) {
                        minIndex = j;
                    }
                }
            }
            Clase_Evento temp = eventosArray[minIndex];
            eventosArray[minIndex] = eventosArray[i];
            eventosArray[i] = temp;
        }
    }

    private void quickSort(Clase_Evento[] eventosArray, String campoOrdenamiento) {
        quickSortRecursivo(eventosArray, 0, eventosArray.length - 1, campoOrdenamiento);
    }

    private void quickSortRecursivo(Clase_Evento[] eventosArray, int inicio, int fin, String campoOrdenamiento) {
        if (inicio < fin) {
            int indiceParticion = particion(eventosArray, inicio, fin, campoOrdenamiento);
            quickSortRecursivo(eventosArray, inicio, indiceParticion - 1, campoOrdenamiento);
            quickSortRecursivo(eventosArray, indiceParticion + 1, fin, campoOrdenamiento);
        }
    }

    private int particion(Clase_Evento[] eventosArray, int inicio, int fin, String campoOrdenamiento) {
        Clase_Evento pivote = eventosArray[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (campoOrdenamiento.equals("Equipo A")) {
                if (eventosArray[j].getEquipoA().compareTo(pivote.getEquipoA()) <= 0) {
                    i++;
                    Clase_Evento temp = eventosArray[i];
                    eventosArray[i] = eventosArray[j];
                    eventosArray[j] = temp;
                }
            } else if (campoOrdenamiento.equals("Equipo B")) {
                if (eventosArray[j].getEquipoB().compareTo(pivote.getEquipoB()) <= 0) {
                    i++;
                    Clase_Evento temp = eventosArray[i];
                    eventosArray[i] = eventosArray[j];
                    eventosArray[j] = temp;
                }
            }
        }
        Clase_Evento temp = eventosArray[i + 1];
        eventosArray[i + 1] = eventosArray[fin];
        eventosArray[fin] = temp;
        return i + 1;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radiobtn_EquipoA = new javax.swing.JRadioButton();
        radiobtn_EquipoB = new javax.swing.JRadioButton();
        radiobtn_Seleccion = new javax.swing.JRadioButton();
        radiobtn_Quicksort = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Eventos = new javax.swing.JTable();
        btn_Ordenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ordenar Eventos");

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione equipo:");

        jLabel3.setText("Seleccione tipo de busqueda:");

        radiobtn_EquipoA.setText("Equipo A");

        radiobtn_EquipoB.setText("Equipo B");

        radiobtn_Seleccion.setText("Seleccion");

        radiobtn_Quicksort.setText("Quicksort");

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

        btn_Ordenar.setText("Ordenar");
        btn_Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radiobtn_EquipoA)
                                .addGap(18, 18, 18)
                                .addComponent(radiobtn_EquipoB))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radiobtn_Seleccion)
                                .addGap(18, 18, 18)
                                .addComponent(radiobtn_Quicksort))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Salir)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(464, 464, 464))
                            .addComponent(btn_Ordenar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobtn_EquipoA)
                    .addComponent(radiobtn_EquipoB)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radiobtn_Seleccion)
                    .addComponent(radiobtn_Quicksort))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Ordenar)
                .addGap(18, 18, 18)
                .addComponent(btn_Salir)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        Clase_05_OrdenarEventos.ocultar();
        Clase_00_MenuPrincipal.mostrar();
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OrdenarActionPerformed
        // Este método maneja el evento de clic en el botón Ordenar
        // Obtener el campo de ordenamiento seleccionado por el usuario
        String campoOrdenamiento = "";
        if (radiobtn_EquipoA.isSelected()) {
            campoOrdenamiento = "Equipo A";
        } else if (radiobtn_EquipoB.isSelected()) {
            campoOrdenamiento = "Equipo B";
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un campo de ordenamiento.");
            return; // Salir del método si no se ha seleccionado ningún campo
        }

        // Obtener el algoritmo de ordenamiento seleccionado por el usuario
        String algoritmoOrdenamiento = "";
        if (radiobtn_Seleccion.isSelected()) {
            algoritmoOrdenamiento = "Selección";
        } else if (radiobtn_Quicksort.isSelected()) {
            algoritmoOrdenamiento = "QuickSort";
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un algoritmo de ordenamiento.");
            return; // Salir del método si no se ha seleccionado ningún algoritmo
        }

        // Llamar al método para ordenar los eventos
        ordenarEventos(campoOrdenamiento, algoritmoOrdenamiento);

        // Después de ordenar los eventos, puedes mostrarlos en la tabla
        // utilizando el método mostrarEventosOrdenados
    }//GEN-LAST:event_btn_OrdenarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_05_OrdenarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_05_OrdenarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_05_OrdenarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_05_OrdenarEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_05_OrdenarEventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ordenar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radiobtn_EquipoA;
    private javax.swing.JRadioButton radiobtn_EquipoB;
    private javax.swing.JRadioButton radiobtn_Quicksort;
    private javax.swing.JRadioButton radiobtn_Seleccion;
    private javax.swing.JTable table_Eventos;
    // End of variables declaration//GEN-END:variables
}
