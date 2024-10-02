package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class agregarUserLibro extends javax.swing.JFrame {

    public static int id_libro;
    boolean valido,UserReg=false;

    public agregarUserLibro() {
        initComponents();
        setTitle("Biblioteca📚 - Agregar usuario");
        setLocationRelativeTo(null);
        setResizable(false);
        setResizable(false);
        setSize(939, 518);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        id_libro = BuscarLibro.id_libro;
        id_libro=GestionarDatos.id_libro;

        ImageIcon wallpaper = new ImageIcon("src/Imagenes/fondo.jpg");
        Icon fondo = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_wallpaper.getWidth(),
                jLabel_wallpaper.getHeight(), Image.SCALE_AREA_AVERAGING));
        jLabel_wallpaper.setIcon(fondo);
        this.repaint();
        
        
        //arreglamos el textArea
        jScrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);

        //hacemos una consulta para buscar los datos del libro
        try {
            try (Connection cn = Conexion.conectar()) {
                PreparedStatement pst = cn.prepareStatement("select * from Libro where id=?");
                pst.setString(1, Integer.toString(id_libro));
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    txt_id.setText(rs.getString("id"));
                    txt_nombreLibro.setText(rs.getString("nombre"));
                    txt_autor.setText(rs.getString("autor"));
                    txt_categoria.setText(rs.getString("categoria"));
                    cmb_estado.setSelectedItem(rs.getString("estado"));
                }
            }

        } catch (SQLException e) {
            System.out.println("error " + e);
            JOptionPane.showMessageDialog(null, "Error al consultar los datos del libro!");
        }

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icon.png"));
        return retValue;
    }

    //metodo para que los textFile tengan informacion
    public void VerificarTextFile() {
         valido = true;
        if (txt_Identidad.getText().trim().equals("")) {
            txt_Identidad.setBackground(Color.red);
            txt_Identidad.setText("");
            valido = false;
        }
        if (txt_Telefono.getText().trim().equals("")) {
            txt_Telefono.setBackground(Color.red);
            txt_Telefono.setText("");
            valido = false;
        }
        if (txt_nombre.getText().trim().equals("")) {
            txt_nombre.setBackground(Color.red);
            txt_nombre.setText("");
            valido = false;
        }
        if (txt_apellido.getText().trim().equals("")) {
            txt_apellido.setBackground(Color.red);
            txt_apellido.setText("");
            valido = false;
        }
        if (valido == false) {
            System.out.println("debe mostrar el jop");
            JOptionPane.showMessageDialog(null, "complete todos los campos para poder"
                    + " registrar el usuario");
            txt_Identidad.setBackground(Color.WHITE);
            txt_nombre.setBackground(Color.WHITE);
            txt_apellido.setBackground(Color.WHITE);
            txt_Telefono.setBackground(Color.WHITE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlabel_titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlabel_footer = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        txt_Identidad = new javax.swing.JTextField();
        btt_actualizar = new javax.swing.JButton();
        Jlabel_titulo1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombreLibro = new javax.swing.JTextField();
        txt_autor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_categoria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmb_estado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        jLabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jlabel_titulo.setBackground(new java.awt.Color(102, 102, 102));
        Jlabel_titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Jlabel_titulo.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel_titulo.setText("Ingrese los datos del usuario");
        getContentPane().add(Jlabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 390, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Telefono:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Guardar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, -1, -1));

        jlabel_footer.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setText("Creado por Enrique Monsalve Ing ");
        getContentPane().add(jlabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, 23));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 278, 36));
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 278, 36));
        getContentPane().add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 278, 36));
        getContentPane().add(txt_Identidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 278, 36));

        btt_actualizar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btt_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aggUser.png"))); // NOI18N
        btt_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btt_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 130, 110));

        Jlabel_titulo1.setBackground(new java.awt.Color(102, 102, 102));
        Jlabel_titulo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Jlabel_titulo1.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel_titulo1.setText("Biblioteca Virtual Fray Ignacio Mariño");
        getContentPane().add(Jlabel_titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 455, 52));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Identidad:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Titulo del libro:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        txt_nombreLibro.setEditable(false);
        getContentPane().add(txt_nombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 278, 36));

        txt_autor.setEditable(false);
        getContentPane().add(txt_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 278, 36));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Autor:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        txt_categoria.setEditable(false);
        getContentPane().add(txt_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 278, 36));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Categoria:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        txt_id.setEditable(false);
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 87, 36));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Id Libro:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        cmb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin prestar", "Prestado" }));
        getContentPane().add(cmb_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 160, 36));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Observaciones:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Estado:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        jScrollPane2.setViewportView(txt_observaciones);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 190, 190));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_actualizarActionPerformed

        //inplementamos el metodo de verificar los txtFile
        VerificarTextFile();
        //creamos la consulta consulta para verificar que el usuario no este registrado
        if (valido==true) {
            try {
                try (Connection cn = Conexion.conectar()) {
                    PreparedStatement pst = cn.prepareStatement("select * from usuario where identidad=?");
                    pst.setString(1, txt_Identidad.getText().trim());
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()) {
                        txt_Identidad.setText(rs.getString("Identidad"));
                        txt_Telefono.setText(rs.getString("Telefono"));
                        txt_apellido.setText(rs.getString("Apellido"));
                        txt_nombre.setText(rs.getString("Nombre"));
                        txt_observaciones.setText(rs.getString("Observacion"));
                    }

                    //hacemos el ingreso del nuevo usuario
                    if (!rs.next()) {
                        try {
                            try (Connection cn2 = Conexion.conectar()) {
                                PreparedStatement pst2 = cn2.prepareStatement("insert into usuario values (?,?,?,?,?,?,?) ");
                                pst2.setInt(1, 0);
                                pst2.setString(2, txt_nombre.getText().trim());
                                pst2.setString(3, txt_apellido.getText().trim());
                                pst2.setString(4, txt_Identidad.getText().trim());
                                pst2.setString(5, txt_Telefono.getText().trim());
                                pst2.setString(6, txt_observaciones.getText().trim());
                                pst2.setInt(7, Integer.parseInt(txt_id.getText().trim()));

                                pst2.executeUpdate();
                                cn2.close();
                                UserReg=true;
                            }
                        } catch (SQLException e) {
                            System.err.println("error al ingresar el usuario a la base de datos " +e);
                        }
                        cn.close();
                    } else {
                        //EN ESTE CASO SOLO CAMBIAMOS EL ESTADO DEL LIBRO LLENANDO LOS TXTFILE DE USUARIO CON EL USUARIO 
                        // YA REGISTRADO

                    }
                }
            } catch (SQLException e) {
                System.err.println("error a la hora de consultar los datos el id del usuario " + e);
            }
            
            dispose();
            if (UserReg==true) {
                try {
                    Connection conexion= Conexion.conectar();
                    PreparedStatement preparedStatement= conexion.prepareStatement("update libro set Estado=? where Id="+id_libro);
                    preparedStatement.setString(1, cmb_estado.getSelectedItem().toString());
                    preparedStatement.executeUpdate();
                    
                    
                } catch (SQLException e) {
                }
            } 
        }


    }//GEN-LAST:event_btt_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(agregarUserLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarUserLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarUserLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarUserLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
            new agregarUserLibro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_titulo;
    private javax.swing.JLabel Jlabel_titulo1;
    private javax.swing.JButton btt_actualizar;
    private javax.swing.JComboBox<String> cmb_estado;
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
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlabel_footer;
    private javax.swing.JTextField txt_Identidad;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_categoria;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombreLibro;
    private javax.swing.JTextArea txt_observaciones;
    // End of variables declaration//GEN-END:variables
}
