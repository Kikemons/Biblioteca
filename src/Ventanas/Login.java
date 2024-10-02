package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author monsalve
 */
public class Login extends javax.swing.JFrame {

    public static String user;
    boolean valido;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(522, 518);
        setResizable(false);
        setTitle("Biblioteca📚 - Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon wallpaperLogo = new ImageIcon("src/Imagenes/logoAlcaldia.png");
        Icon icono = new ImageIcon(wallpaperLogo.getImage().getScaledInstance(jlabel_imagen.getWidth(),
                jlabel_imagen.getHeight(), Image.SCALE_AREA_AVERAGING));
        jlabel_imagen.setIcon(icono);
        this.repaint();

        ImageIcon wallpaper = new ImageIcon("src/Imagenes/fondo.jpg");
        Icon Icon = new ImageIcon(wallpaper.getImage().getScaledInstance(jlabel_wallpaper.getWidth(),
                jlabel_wallpaper.getHeight(), Image.SCALE_AREA_AVERAGING));
        jlabel_wallpaper.setIcon(Icon);
        this.repaint();

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icon.png"));
        return retValue;
    }

    //metodo para validar que los campos esten con informacion
    public void validarText() {

        valido = true;

        if (txt_user.getText().trim().equals("")) {
            txt_user.setBackground(Color.red);
            valido = false;
        }
        if (txt_password.getText().trim().equals("")) {
            txt_password.setBackground(Color.red);
            valido = false;
        }
        if (valido == false) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            txt_password.setBackground(Color.WHITE);
            txt_user.setBackground(Color.WHITE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlabel_titulo = new javax.swing.JLabel();
        jlabel_imagen = new javax.swing.JLabel();
        btt_ingresar = new javax.swing.JButton();
        jlabel_footer = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jlabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jlabel_titulo.setBackground(new java.awt.Color(102, 102, 102));
        Jlabel_titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Jlabel_titulo.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel_titulo.setText("Biblioteca Virtual Fray Ignacio Mariño");
        getContentPane().add(Jlabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 455, 52));
        getContentPane().add(jlabel_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 240, 230));

        btt_ingresar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btt_ingresar.setText("Ingresar");
        btt_ingresar.setBorder(null);
        btt_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btt_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 90, 40));

        jlabel_footer.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setText("Creado por Enrique Monsalve Ing ");
        getContentPane().add(jlabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, 23));

        txt_user.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txt_user.setForeground(new java.awt.Color(0, 0, 0));
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 240, 40));

        txt_password.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 240, 40));
        getContentPane().add(jlabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void btt_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_ingresarActionPerformed
        //utilizamos el metodo para verificar los datos
        validarText();
        
        if (valido == true) {
            try {
                //hacemos la consulta del estado del usuario para redirigirlo a la interfaz que corresponde
                String user = txt_user.getText().trim();
                String pass = txt_password.getText().trim();
                try (Connection cn = Conexion.conectar()) {
                    PreparedStatement pst = cn.prepareStatement("select estatus from useradmin where user=? and password=?");
                    pst.setString(1, user);
                    pst.setString(2, pass);
                    ResultSet rs = pst.executeQuery();
                    
                    if (rs.next()) {
                       String  estatus = rs.getString("estatus");
                        
                        switch (estatus) {
                            case "admin" -> {
                                Menu menu = new Menu();
                                menu.setVisible(true);
                                dispose();
                            }
                            case "user" -> {
                                menuUser meUser = new menuUser();
                                meUser.setVisible(true);
                                dispose();
                            }
                        }
                        
                    } else {
                        txt_password.setText("");
                        txt_user.setText("");
                        JOptionPane.showMessageDialog(null, "Usuario invalido, Intente nuevamente");
                    }
                }

            } catch (SQLException e) {
                System.err.println("error al consultar el usuario: " + e);
            }
        }
    }//GEN-LAST:event_btt_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_titulo;
    private javax.swing.JButton btt_ingresar;
    private javax.swing.JLabel jlabel_footer;
    private javax.swing.JLabel jlabel_imagen;
    private javax.swing.JLabel jlabel_wallpaper;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
