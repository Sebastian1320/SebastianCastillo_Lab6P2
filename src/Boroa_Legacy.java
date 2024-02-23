/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Boroa_Legacy extends javax.swing.JFrame {

    /**
     * Creates new form Boroa_Legacy
     */
    public Boroa_Legacy() {
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

        jd_Equipos = new javax.swing.JDialog();
        jd_Jugadores = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jb_Crearequipos = new javax.swing.JButton();
        jb_Crearjugadores = new javax.swing.JButton();
        jb_Transferencia = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jm_Cequipos = new javax.swing.JMenuItem();
        jm_Cjugadores = new javax.swing.JMenuItem();
        jm_Transferencia = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jd_EquiposLayout = new javax.swing.GroupLayout(jd_Equipos.getContentPane());
        jd_Equipos.getContentPane().setLayout(jd_EquiposLayout);
        jd_EquiposLayout.setHorizontalGroup(
            jd_EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_EquiposLayout.setVerticalGroup(
            jd_EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_JugadoresLayout = new javax.swing.GroupLayout(jd_Jugadores.getContentPane());
        jd_Jugadores.getContentPane().setLayout(jd_JugadoresLayout);
        jd_JugadoresLayout.setHorizontalGroup(
            jd_JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_JugadoresLayout.setVerticalGroup(
            jd_JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bienvenido a Boroa League of Fantasy");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 91, 560, 43));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mascota.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 177, -1, 227));

        jToolBar1.setBackground(new java.awt.Color(0, 204, 255));
        jToolBar1.setRollover(true);

        jb_Crearequipos.setBackground(new java.awt.Color(51, 204, 255));
        jb_Crearequipos.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jb_Crearequipos.setForeground(new java.awt.Color(0, 0, 0));
        jb_Crearequipos.setText("Crear Equipos");
        jb_Crearequipos.setFocusable(false);
        jb_Crearequipos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_Crearequipos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_Crearequipos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jb_CrearequiposKeyPressed(evt);
            }
        });
        jToolBar1.add(jb_Crearequipos);

        jb_Crearjugadores.setBackground(new java.awt.Color(0, 204, 255));
        jb_Crearjugadores.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jb_Crearjugadores.setForeground(new java.awt.Color(0, 0, 0));
        jb_Crearjugadores.setText("Crear Jugadores");
        jb_Crearjugadores.setFocusable(false);
        jb_Crearjugadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_Crearjugadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jb_Crearjugadores);

        jb_Transferencia.setBackground(new java.awt.Color(0, 204, 255));
        jb_Transferencia.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jb_Transferencia.setForeground(new java.awt.Color(0, 0, 0));
        jb_Transferencia.setText("Transferencia");
        jb_Transferencia.setFocusable(false);
        jb_Transferencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_Transferencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jb_Transferencia);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

        jMenu1.setText("Opciones");

        jm_Cequipos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jm_Cequipos.setText("Crear Equipos");
        jm_Cequipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_CequiposActionPerformed(evt);
            }
        });
        jMenu1.add(jm_Cequipos);

        jm_Cjugadores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jm_Cjugadores.setText("Crear Jugadores");
        jMenu1.add(jm_Cjugadores);

        jm_Transferencia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jm_Transferencia.setText("Transferencia");
        jm_Transferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_TransferenciaActionPerformed(evt);
            }
        });
        jMenu1.add(jm_Transferencia);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jm_TransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_TransferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jm_TransferenciaActionPerformed

    private void jm_CequiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_CequiposActionPerformed
        jd_Equipos.pack();
        jd_Equipos.setLocationRelativeTo(this);
        jd_Equipos.setVisible(true);
    }//GEN-LAST:event_jm_CequiposActionPerformed

    private void jb_CrearequiposKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jb_CrearequiposKeyPressed
        jd_Equipos.pack();
        jd_Equipos.setLocationRelativeTo(this);
        jd_Equipos.setVisible(true);
    }//GEN-LAST:event_jb_CrearequiposKeyPressed

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
            java.util.logging.Logger.getLogger(Boroa_Legacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boroa_Legacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boroa_Legacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boroa_Legacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boroa_Legacy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jb_Crearequipos;
    private javax.swing.JButton jb_Crearjugadores;
    private javax.swing.JButton jb_Transferencia;
    private javax.swing.JDialog jd_Equipos;
    private javax.swing.JDialog jd_Jugadores;
    private javax.swing.JMenuItem jm_Cequipos;
    private javax.swing.JMenuItem jm_Cjugadores;
    private javax.swing.JMenuItem jm_Transferencia;
    // End of variables declaration//GEN-END:variables
}
