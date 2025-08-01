package Ventanas;

import Clases.Conexion;
import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author monsalve
 */
public class GestionarDatosAdmin extends javax.swing.JFrame {

    private final DefaultTableModel model = new DefaultTableModel();
    private static String buscar = "Nombre";
    public static int id_libro = 0;
    public static String user="";

    public GestionarDatosAdmin() {
        initComponents();
        setTitle("Biblioteca📚 - Gestionar Datos Usuarios tipo admin");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setSize(507, 516);

        URL url = getClass().getResource("/Imagenes/fondo.jpg");
        if (url != null) {
            ImageIcon wallpaper = new ImageIcon(url);
            Icon Icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlabel_wallpaper.getWidth(),
                    jlabel_wallpaper.getHeight(), Image.SCALE_AREA_AVERAGING));
            jlabel_wallpaper.setIcon(Icono);
            this.repaint();
        }

        JTable_consulta = new JTable(model);
        jScrollPane_consulta.setViewportView(JTable_consulta);

        model.addColumn("Usuario");
        model.addColumn("Estatus");

        TableColumnModel columnModel = JTable_consulta.getColumnModel();

        //agregamos accion al cmb_buscar
        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareCall("select user, estatus from useradmin");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Object fila[] = new Object[2];
                for (int i = 0; i < 2; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }

        } catch (SQLException e) {
            System.err.println("error al consultar los usuarios " + e);
        }
        
        

        JTable_consulta.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e){
            int fila_point=JTable_consulta.rowAtPoint(e.getPoint());
            int columna=0;
            if(fila_point>-1){
                user=(String)model.getValueAt(fila_point, columna);
                System.out.println("user es: "+user);
            }
        }
        });
    }
    
   

    @Override
    public Image getIconImage() {
        URL url = ClassLoader.getSystemResource("Imagenes/icon.png");
        if (url != null) {
            Image retvalu = Toolkit.getDefaultToolkit().getImage(url);
            return retvalu;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlabel_titulo = new javax.swing.JLabel();
        jlabel_buscar = new javax.swing.JLabel();
        jScrollPane_consulta = new javax.swing.JScrollPane();
        JTable_consulta = new javax.swing.JTable();
        jlabel_footer = new javax.swing.JLabel();
        btt_agregarLibro = new javax.swing.JButton();
        btt_eliminar = new javax.swing.JButton();
        jlabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jlabel_titulo.setBackground(new java.awt.Color(102, 102, 102));
        Jlabel_titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Jlabel_titulo.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel_titulo.setText("Biblioteca Virtual Fray Ignacio Mariño");
        getContentPane().add(Jlabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 455, 52));

        jlabel_buscar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabel_buscar.setText("Usuarios registrados:");
        getContentPane().add(jlabel_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        JTable_consulta.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        JTable_consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Usuario", "Estatus"
            }
        ));
        jScrollPane_consulta.setViewportView(JTable_consulta);

        getContentPane().add(jScrollPane_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 430, 240));

        jlabel_footer.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setText("Creado por Enrique Monsalve Ing ");
        getContentPane().add(jlabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, 23));

        btt_agregarLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btt_agregarLibro.setText("Registrar Usuario");
        btt_agregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_agregarLibroActionPerformed(evt);
            }
        });
        getContentPane().add(btt_agregarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 150, 30));

        btt_eliminar.setBackground(new java.awt.Color(255, 0, 0));
        btt_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btt_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btt_eliminar.setText("Eliminar Usuario");
        btt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btt_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 140, 40));
        getContentPane().add(jlabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_agregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_agregarLibroActionPerformed
        AgregarUsuario aggUser = new AgregarUsuario();
        aggUser.setVisible(true);
        dispose();
    }//GEN-LAST:event_btt_agregarLibroActionPerformed

    private void btt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_eliminarActionPerformed
      int seleccion = JOptionPane.showConfirmDialog(null, "Esta seguro que desea borrar un libro");
        if (seleccion==0) {
            try {
            Connection cn= Conexion.conectar();
            PreparedStatement pst=cn.prepareStatement("delete from useradmin where user=?");
            pst.setString(1, user);
            pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "El Usuario fue eliminado exitosamente!");
             this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al eliminar el usuario ");
                System.err.println("error al eliminar libro "+e);
        }
        }
    }//GEN-LAST:event_btt_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarDatosAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarDatosAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarDatosAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarDatosAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarDatosAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable_consulta;
    private javax.swing.JLabel Jlabel_titulo;
    private javax.swing.JButton btt_agregarLibro;
    private javax.swing.JButton btt_eliminar;
    private javax.swing.JScrollPane jScrollPane_consulta;
    private javax.swing.JLabel jlabel_buscar;
    private javax.swing.JLabel jlabel_footer;
    private javax.swing.JLabel jlabel_wallpaper;
    // End of variables declaration//GEN-END:variables

}
