package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class AgregarUsuario extends javax.swing.JFrame {

    boolean valido;
    String identidad = "";

    public AgregarUsuario() {
        initComponents();
        setTitle("Biblioteca📚 - Agregar usuario (Lector)");
        setLocationRelativeTo(null);
        setResizable(false);
        setResizable(false);
        setSize(425, 419);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        URL url = getClass().getResource("/Imagenes/fondo.jpg");
        if (url != null) {
            ImageIcon wallpaper = new ImageIcon(url);
            Icon fondo = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_wallpaper.getWidth(),
                    jLabel_wallpaper.getHeight(), Image.SCALE_AREA_AVERAGING));
            jLabel_wallpaper.setIcon(fondo);
            this.repaint();

        }
    }

    @Override
    public Image getIconImage() {
        URL url = ClassLoader.getSystemResource("Imagenes/icon.png");
        if (url != null) {
            Image retValue = Toolkit.getDefaultToolkit().getImage(url);
            return retValue;
        }
        return null;
    }

    //metodo para que los textFile tengan informacion
    public void VerificarTextFile() {
        valido = true;

        if (txt_usuario.getText().trim().equals("")) {
            txt_usuario.setBackground(Color.red);
            txt_usuario.setText("");
            valido = false;
        }
        if (txt_password.getText().trim().equals("")) {
            txt_password.setBackground(Color.red);
            txt_password.setText("");
            valido = false;
        }
        if (!valido) {
            JOptionPane.showMessageDialog(null, "complete todos los campos para poder"
                    + " registrar el usuario");
            txt_usuario.setBackground(Color.WHITE);
            txt_password.setBackground(Color.WHITE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlabel_titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlabel_footer = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        btt_CrearUsuario = new javax.swing.JButton();
        Jlabel_titulo1 = new javax.swing.JLabel();
        cmb_Estatus = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jlabel_titulo.setBackground(new java.awt.Color(102, 102, 102));
        Jlabel_titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Jlabel_titulo.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel_titulo.setText("Ingrese los datos del usuario");
        getContentPane().add(Jlabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 260, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estatus:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jlabel_footer.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setText("Creado por Enrique Monsalve Ing ");
        getContentPane().add(jlabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, 23));
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 270, 36));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 270, 36));

        btt_CrearUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btt_CrearUsuario.setText("Crear usuario");
        btt_CrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_CrearUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btt_CrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 150, 50));

        Jlabel_titulo1.setBackground(new java.awt.Color(102, 102, 102));
        Jlabel_titulo1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Jlabel_titulo1.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel_titulo1.setText("Biblioteca Virtual Fray Ignacio Mariño");
        getContentPane().add(Jlabel_titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 380, 50));

        cmb_Estatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_Estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        getContentPane().add(cmb_Estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 110, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_CrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_CrearUsuarioActionPerformed

        //inplementamos el metodo de verificar los txtFile
        VerificarTextFile();
        //creamos la consulta consulta para verificar que el usuario no este registrado
        if (valido) {

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("insert into useradmin values  (?,?,?) ");
                pst.setString(1, txt_usuario.getText().trim());
                pst.setString(2, txt_password.getText().trim());
                pst.setString(3, cmb_Estatus.getSelectedItem().toString());
                pst.executeUpdate();
                cn.close();

                JOptionPane.showMessageDialog(null, "Cliente Registrado");
            } catch (SQLException e) {
                System.err.println("error a la hora de actualizar la observacion del usuario " + e);
            }

            dispose();

    }//GEN-LAST:event_btt_CrearUsuarioActionPerformed

    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            new AgregarUsuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_titulo;
    private javax.swing.JLabel Jlabel_titulo1;
    private javax.swing.JButton btt_CrearUsuario;
    private javax.swing.JComboBox<String> cmb_Estatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JLabel jlabel_footer;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
