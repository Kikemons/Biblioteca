package Ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {
    
    /*se les da personalizacion a algunos de los componentes principales del Jframe*/
    public Menu() {
        setTitle("Biblioteca📚 - Menu");
        setSize(973, 329);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();

        /* se categrizan las url donde se maneja los logos y imagenes con las cuales se les da el diseño al Jframe */
        URL url = getClass().getResource("/Imagenes/fondo.jpg");
        if (url != null) {
            ImageIcon wallpáper = new ImageIcon(url);
            Icon icon = new ImageIcon(wallpáper.getImage().getScaledInstance(jlabel_wallpaper.getWidth(),
                    jlabel_wallpaper.getHeight(), Image.SCALE_AREA_AVERAGING));
            jlabel_wallpaper.setIcon(icon);
            this.repaint();
        }

    }

    //se utilizo url para no generar errores al buscar la imagen de icono
    @Override
    public Image getIconImage() {
        URL url = ClassLoader.getSystemResource("Imagenes/icon.png");
        if (url != null) {
            Image retvalue = Toolkit.getDefaultToolkit().getImage(url);
            return retvalue;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlabel_titulo = new javax.swing.JLabel();
        jlabel_footer = new javax.swing.JLabel();
        btt_consulta = new javax.swing.JButton();
        btt_info = new javax.swing.JButton();
        btt_libros = new javax.swing.JButton();
        Jlabel_consulta = new javax.swing.JLabel();
        jlabel_info = new javax.swing.JLabel();
        jlabel_baseD = new javax.swing.JLabel();
        btt_Usuarios = new javax.swing.JButton();
        jlabel_info1 = new javax.swing.JLabel();
        btt_Informacion = new javax.swing.JButton();
        jlabel_info2 = new javax.swing.JLabel();
        jlabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jlabel_titulo.setBackground(new java.awt.Color(102, 102, 102));
        Jlabel_titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Jlabel_titulo.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel_titulo.setText("Biblioteca Virtual Fray Ignacio Mariño");
        getContentPane().add(Jlabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 455, 52));

        jlabel_footer.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setText("Creado por Enrique Monsalve Ing ");
        getContentPane().add(jlabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, 23));

        btt_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar.png"))); // NOI18N
        btt_consulta.setBorder(null);
        btt_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_consultaActionPerformed(evt);
            }
        });
        getContentPane().add(btt_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 140, 140));

        btt_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lector.png"))); // NOI18N
        btt_info.setBorder(null);
        btt_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_infoActionPerformed(evt);
            }
        });
        getContentPane().add(btt_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 140, 140));

        btt_libros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta.png"))); // NOI18N
        btt_libros.setBorder(null);
        btt_libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_librosActionPerformed(evt);
            }
        });
        getContentPane().add(btt_libros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 140));

        Jlabel_consulta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Jlabel_consulta.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel_consulta.setText("Administrar Usuario Admin");
        getContentPane().add(Jlabel_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jlabel_info.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jlabel_info.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_info.setText("Informacion");
        getContentPane().add(jlabel_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, -1, -1));

        jlabel_baseD.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jlabel_baseD.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_baseD.setText("Gestionar Datos");
        getContentPane().add(jlabel_baseD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        btt_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historial.png"))); // NOI18N
        btt_Usuarios.setBorder(null);
        btt_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_UsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btt_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 140, 140));

        jlabel_info1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jlabel_info1.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_info1.setText("Usuarios");
        getContentPane().add(jlabel_info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        btt_Informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        btt_Informacion.setBorder(null);
        btt_Informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_InformacionActionPerformed(evt);
            }
        });
        getContentPane().add(btt_Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 140, 140));

        jlabel_info2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jlabel_info2.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_info2.setText("Usuario registrados");
        getContentPane().add(jlabel_info2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));
        getContentPane().add(jlabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Este boton redirecciona al usuario al apartado de buscar libro e ingresar libro
    private void btt_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_librosActionPerformed
        GestionarDatos gestionarDatos = new GestionarDatos();
        gestionarDatos.setVisible(true);
    }//GEN-LAST:event_btt_librosActionPerformed

    /*Este boton redirecciona al usuario al apartado de gestionar datos de usuarios
    administradores(eliminar o agregar administradores)*/
    private void btt_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_consultaActionPerformed
        GestionarDatosAdmin GDA = new GestionarDatosAdmin();
        GDA.setVisible(true);
    }//GEN-LAST:event_btt_consultaActionPerformed

    /*Este boton redirecciona al usuario al apartado de gestionar  usuarios lectores
    (agregar lectores)*/
    private void btt_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_infoActionPerformed
        AgregarUsuario agg = new AgregarUsuario();
        agg.setVisible(true);
    }//GEN-LAST:event_btt_infoActionPerformed
    /*Este boton redirecciona al usuario al apartado de gestionar  usuarios lectores
    (agregar lectores)*/
    private void btt_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_UsuariosActionPerformed
        Usuarios user = new Usuarios();
        user.setVisible(true);
    }//GEN-LAST:event_btt_UsuariosActionPerformed
    /*Este boton redirecciona al usuario al apartado de informacion del software (creditos)*/
    private void btt_InformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_InformacionActionPerformed
        // TODO add your handling code here:
        Info info = new Info();
        info.setVisible(true);
    }//GEN-LAST:event_btt_InformacionActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_consulta;
    private javax.swing.JLabel Jlabel_titulo;
    private javax.swing.JButton btt_Informacion;
    private javax.swing.JButton btt_Usuarios;
    private javax.swing.JButton btt_consulta;
    private javax.swing.JButton btt_info;
    private javax.swing.JButton btt_libros;
    private javax.swing.JLabel jlabel_baseD;
    private javax.swing.JLabel jlabel_footer;
    private javax.swing.JLabel jlabel_info;
    private javax.swing.JLabel jlabel_info1;
    private javax.swing.JLabel jlabel_info2;
    private javax.swing.JLabel jlabel_wallpaper;
    // End of variables declaration//GEN-END:variables
}
