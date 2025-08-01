package Ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author monsalve
 */
public class Info extends javax.swing.JFrame {

    public Info() {
        initComponents();
        setTitle("Biblioteca📚 - informacion");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        URL url = getClass().getResource("/Imagenes/fondo.jpg");
        if (url != null) {
            ImageIcon wallpaper = new ImageIcon(url);
            Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlabel_wallpaper.getWidth(),
                    jlabel_wallpaper.getHeight(), Image.SCALE_AREA_AVERAGING));
            jlabel_wallpaper.setIcon(icono);
            this.repaint();
        }
    }

    @Override
    public Image getIconImage() {
        URL url = ClassLoader.getSystemResource("Imagenes/icon.png");
        if (url != null) {
            Image icon = Toolkit.getDefaultToolkit().getImage(url);
            return icon;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_1 = new javax.swing.JLabel();
        jLabel_4 = new javax.swing.JLabel();
        jlabel_footer = new javax.swing.JLabel();
        Jlabel_titulo1 = new javax.swing.JLabel();
        jLabel_5 = new javax.swing.JLabel();
        jlabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_1.setText("Sistema creado por Enrique Monsalve");
        getContentPane().add(jLabel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel_4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_4.setText("En todas las redes como: Enrique Monsalve");
        getContentPane().add(jLabel_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 250, 20));

        jlabel_footer.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setText("Creado por Enrique Monsalve Ing ");
        getContentPane().add(jlabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, 23));

        Jlabel_titulo1.setBackground(new java.awt.Color(102, 102, 102));
        Jlabel_titulo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Jlabel_titulo1.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel_titulo1.setText("Biblioteca Virtual Fray Ignacio Mariño");
        getContentPane().add(Jlabel_titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 340, 50));

        jLabel_5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_5.setText("Facebook/ linkedin / Instagram ");
        getContentPane().add(jLabel_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 190, 20));
        getContentPane().add(jlabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_titulo1;
    private javax.swing.JLabel jLabel_1;
    private javax.swing.JLabel jLabel_4;
    private javax.swing.JLabel jLabel_5;
    private javax.swing.JLabel jlabel_footer;
    private javax.swing.JLabel jlabel_wallpaper;
    // End of variables declaration//GEN-END:variables
}
