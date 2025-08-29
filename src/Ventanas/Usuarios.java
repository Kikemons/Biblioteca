package Ventanas;

import Clases.Conexion;
import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Usuarios extends javax.swing.JFrame {
    
    public static int idUsuario;
    public Usuarios() {
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
        JTable_historial = new JTable(model);
        jScrollPane_consulta.setViewportView(JTable_historial);

        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Identidad");
        model.addColumn("Telefono");
        model.addColumn("Observación");

        TableColumnModel tabla = JTable_historial.getColumnModel();
        tabla.getColumn(0).setMaxWidth(50);
        // Estableces la variable de sesión en MySQL

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from Usuario");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Object usuario[] = new Object[6];
                for (int i = 0; i < 6; i++) {
                    usuario[i] = rs.getObject(i + 1);
                }
                model.addRow(usuario);
            }

        } catch (SQLException e) {
            System.err.println("eroor " + e);
        }
        
        
        JTable_historial.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
            int fila=JTable_historial.rowAtPoint(e.getPoint());
            int columna =0;
            
            if (fila>-1) {
                idUsuario=(int)(model.getValueAt(fila, columna));
                DatosUsuario datosUsuario= new DatosUsuario();
                datosUsuario.setVisible(true);
            }
        }
        });
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
        JTable_historial = new javax.swing.JTable();
        jlabel_buscar = new javax.swing.JLabel();
        jlabel_footer = new javax.swing.JLabel();
        btt_Historial = new javax.swing.JButton();
        jLabelWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jlabel_titulo.setBackground(new java.awt.Color(102, 102, 102));
        Jlabel_titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Jlabel_titulo.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel_titulo.setText("Biblioteca Virtual Fray Ignacio Mariño");
        getContentPane().add(Jlabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 455, 52));

        JTable_historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "identidad", "Telefono", "Observacion", "Id Libro"
            }
        ));
        jScrollPane_consulta.setViewportView(JTable_historial);

        getContentPane().add(jScrollPane_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 980, 320));

        jlabel_buscar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabel_buscar.setText("Usuarios Registrados:");
        getContentPane().add(jlabel_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jlabel_footer.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setText("Creado por Enrique Monsalve Ing ");
        getContentPane().add(jlabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, -1, 23));

        btt_Historial.setBackground(new java.awt.Color(255, 0, 51));
        btt_Historial.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btt_Historial.setText("Historial de Usuario");
        btt_Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_HistorialActionPerformed(evt);
            }
        });
        getContentPane().add(btt_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 240, 40));
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_HistorialActionPerformed
        //redirigimos al apartado de el historial de usuarios
       /*se crea un objeto de la ventana HistorialUsuario.java
        y utilizamos el objeto para abrir la ventana historial
        */
       HistorialUsuario hu= new HistorialUsuario();
       hu.setVisible(true);
    }//GEN-LAST:event_btt_HistorialActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable_historial;
    private javax.swing.JLabel Jlabel_titulo;
    private javax.swing.JButton btt_Historial;
    private javax.swing.JLabel jLabelWallpaper;
    private javax.swing.JScrollPane jScrollPane_consulta;
    private javax.swing.JLabel jlabel_buscar;
    private javax.swing.JLabel jlabel_footer;
    // End of variables declaration//GEN-END:variables
}
