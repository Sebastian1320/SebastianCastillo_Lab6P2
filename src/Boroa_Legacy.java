/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Boroa_Legacy extends javax.swing.JFrame {

    /**
     * Creates new form Boroa_Legacy
     */
    public Boroa_Legacy() {
        initComponents();
        this.setLocationRelativeTo(this);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jt_pais = new javax.swing.JTextField();
        jt_Nombre = new javax.swing.JTextField();
        jt_Ciudad = new javax.swing.JTextField();
        jt_Estadio = new javax.swing.JTextField();
        jb_Crearteam = new javax.swing.JButton();
        jd_Jugadores = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jt_nombrej = new javax.swing.JTextField();
        js_Edad = new javax.swing.JSpinner();
        jc_posicion = new javax.swing.JComboBox<>();
        jb_Crearjug = new javax.swing.JButton();
        jd_Transferir = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_equipos = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_Jugadores = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
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

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setForeground(new java.awt.Color(0, 255, 0));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Crear Equipos");

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Pais del Equipo");

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Nombre del Equipo");

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Ciudad");

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Estadio");

        jb_Crearteam.setBackground(new java.awt.Color(102, 255, 102));
        jb_Crearteam.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jb_Crearteam.setForeground(new java.awt.Color(0, 0, 0));
        jb_Crearteam.setText("Agregar");
        jb_Crearteam.setBorder(null);
        jb_Crearteam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_CrearteamMouseClicked(evt);
            }
        });
        jb_Crearteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CrearteamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(151, 151, 151)
                                .addComponent(jt_Estadio, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(160, 160, 160)
                                .addComponent(jt_Ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(81, 81, 81)
                                .addComponent(jt_pais))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(63, 63, 63)
                                .addComponent(jt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(277, 277, 277))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jb_Crearteam, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jt_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jt_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jt_Estadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jb_Crearteam, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout jd_EquiposLayout = new javax.swing.GroupLayout(jd_Equipos.getContentPane());
        jd_Equipos.getContentPane().setLayout(jd_EquiposLayout);
        jd_EquiposLayout.setHorizontalGroup(
            jd_EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_EquiposLayout.setVerticalGroup(
            jd_EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 255, 204));

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Crear Jugadores");

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Edad");

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre");

        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Posicion");

        js_Edad.setModel(new javax.swing.SpinnerNumberModel(15, 15, 45, 1));

        jc_posicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portero", "Defensa", "Mediocampista", "Delantero", " " }));

        jb_Crearjug.setBackground(new java.awt.Color(51, 255, 204));
        jb_Crearjug.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jb_Crearjug.setForeground(new java.awt.Color(0, 0, 0));
        jb_Crearjug.setText("Agregar");
        jb_Crearjug.setBorder(null);
        jb_Crearjug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_CrearjugMouseClicked(evt);
            }
        });
        jb_Crearjug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CrearjugActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jc_posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jt_nombrej, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(js_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jb_Crearjug, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(430, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jt_nombrej, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(js_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc_posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jb_Crearjug, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(190, 190, 190)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(299, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jd_JugadoresLayout = new javax.swing.GroupLayout(jd_Jugadores.getContentPane());
        jd_Jugadores.getContentPane().setLayout(jd_JugadoresLayout);
        jd_JugadoresLayout.setHorizontalGroup(
            jd_JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_JugadoresLayout.setVerticalGroup(
            jd_JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setForeground(new java.awt.Color(255, 255, 51));

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Transferencia");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Equipos");
        jT_equipos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jT_equipos);

        jl_Jugadores.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_Jugadores);

        jButton1.setText("Transeferencia >");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jButton1)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_TransferirLayout = new javax.swing.GroupLayout(jd_Transferir.getContentPane());
        jd_Transferir.getContentPane().setLayout(jd_TransferirLayout);
        jd_TransferirLayout.setHorizontalGroup(
            jd_TransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_TransferirLayout.setVerticalGroup(
            jd_TransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jb_Crearequipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_CrearequiposMouseClicked(evt);
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
        jb_Crearjugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_CrearjugadoresMouseClicked(evt);
            }
        });
        jb_Crearjugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CrearjugadoresActionPerformed(evt);
            }
        });
        jToolBar1.add(jb_Crearjugadores);

        jb_Transferencia.setBackground(new java.awt.Color(0, 204, 255));
        jb_Transferencia.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jb_Transferencia.setForeground(new java.awt.Color(0, 0, 0));
        jb_Transferencia.setText("Transferencia");
        jb_Transferencia.setFocusable(false);
        jb_Transferencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_Transferencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_Transferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_TransferenciaMouseClicked(evt);
            }
        });
        jToolBar1.add(jb_Transferencia);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 580, 50));

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
        jm_Cjugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_CjugadoresActionPerformed(evt);
            }
        });
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
        jd_Transferir.pack();
        jd_Transferir.setLocationRelativeTo(this);
        jd_Transferir.setVisible(true);
    }//GEN-LAST:event_jm_TransferenciaActionPerformed

    private void jm_CequiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_CequiposActionPerformed
        jd_Equipos.pack();
        jd_Equipos.setLocationRelativeTo(this);
        jd_Equipos.setVisible(true);
    }//GEN-LAST:event_jm_CequiposActionPerformed

    private void jm_CjugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_CjugadoresActionPerformed
        jd_Jugadores.pack();
        jd_Jugadores.setLocationRelativeTo(this);
        jd_Jugadores.setVisible(true);

    }//GEN-LAST:event_jm_CjugadoresActionPerformed

    private void jb_CrearjugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearjugadoresMouseClicked
        jd_Jugadores.pack();
        jd_Jugadores.setLocationRelativeTo(this);
        jd_Jugadores.setVisible(true);
    }//GEN-LAST:event_jb_CrearjugadoresMouseClicked

    private void jb_CrearteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CrearteamActionPerformed

    }//GEN-LAST:event_jb_CrearteamActionPerformed

    private void jb_CrearjugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CrearjugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_CrearjugActionPerformed

    private void jb_TransferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_TransferenciaMouseClicked
        jd_Transferir.pack();
        jd_Transferir.setLocationRelativeTo(this);
        jd_Transferir.setVisible(true);
    }//GEN-LAST:event_jb_TransferenciaMouseClicked

    private void jb_CrearjugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearjugMouseClicked
        DefaultListModel modelo = (DefaultListModel) jl_Jugadores.getModel();
        modelo.addElement(new Jugador(jt_nombrej.getText(), (String) jc_posicion.getSelectedItem(), (Integer) js_Edad.getValue()));
        jl_Jugadores.setModel(modelo);
        jt_nombrej.setText("");
        jc_posicion.setSelectedIndex(0);
        js_Edad.setValue(15);
    }//GEN-LAST:event_jb_CrearjugMouseClicked

    private void jb_CrearteamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearteamMouseClicked
        int temp =0;
        if(numero(jt_Nombre.getText())==false||numero(jt_Estadio.getText())==false||numero(jt_pais.getText())==false||numero(jt_Ciudad.getText())==false){
            JOptionPane.showMessageDialog(jd_Equipos, "Hay un numero incluido");
             jt_Nombre.setText("");
        jt_Ciudad.setText("");
        jt_pais.setText("");
        jt_Estadio.setText("");
        }else{
        DefaultTreeModel m = (DefaultTreeModel) jT_equipos.getModel();
        DefaultMutableTreeNode raiz=(DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode pais=new DefaultMutableTreeNode(jt_pais.getText());
        DefaultMutableTreeNode equipo=new DefaultMutableTreeNode(new Equipos(jt_Nombre.getText(),jt_Ciudad.getText(),jt_pais.getText(),jt_Estadio.getText()));
        for (int i = 0; i < raiz.getChildCount(); i++) {
            if(raiz.getChildAt(i).toString().equals(jt_pais.getText())){
             ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(equipo);
             temp=1;
             break;
            }
        }
        if(temp==0){
        pais.add(equipo);
        raiz.add(pais);
        }
        m.reload();
        jt_Nombre.setText("");
        jt_Ciudad.setText("");
        jt_pais.setText("");
        jt_Estadio.setText("");
        JOptionPane.showMessageDialog(jd_Equipos, "Se ha agregado con exito");
        }
    }//GEN-LAST:event_jb_CrearteamMouseClicked

    private void jb_CrearequiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearequiposMouseClicked
           jd_Equipos.pack();
        jd_Equipos.setLocationRelativeTo(this);
        jd_Equipos.setVisible(true);
    }//GEN-LAST:event_jb_CrearequiposMouseClicked

    private void jb_CrearjugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CrearjugadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_CrearjugadoresActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jT_equipos;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jb_Crearequipos;
    private javax.swing.JButton jb_Crearjug;
    private javax.swing.JButton jb_Crearjugadores;
    private javax.swing.JButton jb_Crearteam;
    private javax.swing.JButton jb_Transferencia;
    private javax.swing.JComboBox<String> jc_posicion;
    private javax.swing.JDialog jd_Equipos;
    private javax.swing.JDialog jd_Jugadores;
    private javax.swing.JDialog jd_Transferir;
    private javax.swing.JList<String> jl_Jugadores;
    private javax.swing.JMenuItem jm_Cequipos;
    private javax.swing.JMenuItem jm_Cjugadores;
    private javax.swing.JMenuItem jm_Transferencia;
    private javax.swing.JSpinner js_Edad;
    private javax.swing.JTextField jt_Ciudad;
    private javax.swing.JTextField jt_Estadio;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextField jt_nombrej;
    private javax.swing.JTextField jt_pais;
    // End of variables declaration//GEN-END:variables
    public boolean numero(String cadena){
        Pattern pattern =Pattern.compile("^.*\\d.*$");
        Matcher matcher=pattern.matcher(cadena);
        if(matcher.find()){
            return false;
        }
        return true;
    }
     //"^\\d+$" regex letras
    DefaultMutableTreeNode nodo_seleccionado;
 Jugador jugador_selec;
 Equipos equipo_selec;   
}
