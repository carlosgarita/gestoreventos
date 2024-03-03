/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestoreventos;

/**
 *
 * @author HP
 */
public class GUI_00_MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */
    public GUI_00_MenuPrincipal() {
        initComponents();
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
        btn_RegistrarEventos = new javax.swing.JButton();
        btn_MostrarEventos = new javax.swing.JButton();
        btn_BuscarEventos = new javax.swing.JButton();
        btn_EncontrarEventos = new javax.swing.JButton();
        btn_OrdernarEventos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ventana Principal");

        btn_RegistrarEventos.setText("Registrar Evento");
        btn_RegistrarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarEventosActionPerformed(evt);
            }
        });

        btn_MostrarEventos.setText("Mostrar Eventos");
        btn_MostrarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MostrarEventosActionPerformed(evt);
            }
        });

        btn_BuscarEventos.setText("Buscar Eventos");
        btn_BuscarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarEventosActionPerformed(evt);
            }
        });

        btn_EncontrarEventos.setText("Encontrar Eventos");
        btn_EncontrarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EncontrarEventosActionPerformed(evt);
            }
        });

        btn_OrdernarEventos.setText("Ordenar Eventos");
        btn_OrdernarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OrdernarEventosActionPerformed(evt);
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
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_BuscarEventos)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_RegistrarEventos)
                                    .addComponent(btn_MostrarEventos))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_OrdernarEventos)
                                    .addComponent(btn_EncontrarEventos))))))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_RegistrarEventos)
                    .addComponent(btn_EncontrarEventos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_MostrarEventos)
                    .addComponent(btn_OrdernarEventos))
                .addGap(18, 18, 18)
                .addComponent(btn_BuscarEventos)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarEventosActionPerformed
        Clase_00_MenuPrincipal.mostrarVentanaRegistroEventos();
    }//GEN-LAST:event_btn_RegistrarEventosActionPerformed

    private void btn_MostrarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarEventosActionPerformed
        Clase_00_MenuPrincipal.mostrarVentanaMostrarEventos();
    }//GEN-LAST:event_btn_MostrarEventosActionPerformed

    private void btn_BuscarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarEventosActionPerformed
        Clase_00_MenuPrincipal.mostrarVentanaBuscarEventos();
    }//GEN-LAST:event_btn_BuscarEventosActionPerformed

    private void btn_EncontrarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EncontrarEventosActionPerformed
        Clase_00_MenuPrincipal.mostrarVentanaEncontrarEnRangoDeHoras();
    }//GEN-LAST:event_btn_EncontrarEventosActionPerformed

    private void btn_OrdernarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OrdernarEventosActionPerformed
        Clase_00_MenuPrincipal.mostrarVentanaOrdenarEventos();
    }//GEN-LAST:event_btn_OrdernarEventosActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_00_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_00_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_00_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_00_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new GUI_00_MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BuscarEventos;
    private javax.swing.JButton btn_EncontrarEventos;
    private javax.swing.JButton btn_MostrarEventos;
    private javax.swing.JButton btn_OrdernarEventos;
    private javax.swing.JButton btn_RegistrarEventos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
