package Ventanas;

import Clases.Conexion;
import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class HistorialUsuario extends javax.swing.JFrame {

    public HistorialUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Admin - Historial de Usuario");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setResizable(false);
        setSize(1030, 481);

        URL url = ClassLoader.getSystemResource("Imagenes/fondo.jpg");
        if (url != null) {
            ImageIcon wallapaper = new ImageIcon(url);
            Icon icon = new ImageIcon(wallapaper.getImage().getScaledInstance(jLabelWallpaper.getWidth(),
                     jLabelWallpaper.getHeight(), Image.SCALE_AREA_AVERAGING));
            jLabelWallpaper.setIcon(icon);
            this.repaint();
        }

        DefaultTableModel model = new DefaultTableModel();
        jTable_historial = new JTable(model);
        jScrollPane_consulta.setViewportView(jTable_historial);

        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Identidad");
        model.addColumn("Observación");
        model.addColumn("Fecha de la Observación");
        model.addColumn("Responsable");
        
        TableColumnModel tabla=jTable_historial.getColumnModel();
        tabla.getColumn(0).setMaxWidth(50);
        // Estableces la variable de sesión en MySQL
        



        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select id, Nombres, apellidos, Identidad, Observacion,"
                    + " FechaCambio, UsuarioResponsable from historial");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Object usuario[] = new Object[7];
                for (int i = 0; i < 7; i++) {
                   usuario[i]=rs.getObject(i+1);
                }
                model.addRow(usuario);
                
           }  
                      
        } catch (Exception e) {
            System.err.println("eroor "+e);
        }
    }

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
        jScrollPane_consulta = new javax.swing.JScrollPane();
        jTable_historial = new javax.swing.JTable();
        jlabel_buscar = new javax.swing.JLabel();
        jlabel_footer = new javax.swing.JLabel();
        jLabelWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jlabel_titulo.setBackground(new java.awt.Color(102, 102, 102));
        Jlabel_titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Jlabel_titulo.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel_titulo.setText("Biblioteca Virtual Fray Ignacio Mariño");
        getContentPane().add(Jlabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 455, 52));

        jTable_historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "identidad", "Observacion", "Fecha", "Responsable"
            }
        ));
        jScrollPane_consulta.setViewportView(jTable_historial);

        getContentPane().add(jScrollPane_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 980, 300));

        jlabel_buscar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabel_buscar.setText("Historial de Usuario:");
        getContentPane().add(jlabel_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jlabel_footer.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setText("Creado por Enrique Monsalve Ing ");
        getContentPane().add(jlabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, -1, 23));
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 450));

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
            java.util.logging.Logger.getLogger(HistorialUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_titulo;
    private javax.swing.JLabel jLabelWallpaper;
    private javax.swing.JScrollPane jScrollPane_consulta;
    private javax.swing.JTable jTable_historial;
    private javax.swing.JLabel jlabel_buscar;
    private javax.swing.JLabel jlabel_footer;
    // End of variables declaration//GEN-END:variables
}
