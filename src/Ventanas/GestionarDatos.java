package Ventanas;

import Clases.Conexion;
import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author monsalve
 */
public class GestionarDatos extends javax.swing.JFrame {

    private final DefaultTableModel model = new DefaultTableModel();
    private static String buscar = "Nombre";
    public static int id_libro = 0;

    public GestionarDatos() {
        initComponents();
        setTitle("Biblioteca📚 - Gestionar Datos");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setSize(805, 516);

        ImageIcon wallpaper = new ImageIcon("src/Imagenes/fondo.jpg");
        Icon Icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlabel_wallpaper.getWidth(),
                jlabel_wallpaper.getHeight(), Image.SCALE_AREA_AVERAGING));
        jlabel_wallpaper.setIcon(Icono);
        this.repaint();

        jTable_consulta = new JTable(model);
        jScrollPane_consulta.setViewportView(jTable_consulta);

        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Autor");
        model.addColumn("Categoria");
        model.addColumn("Estado");

        TableColumnModel columnModel = jTable_consulta.getColumnModel();

        columnModel.getColumn(0).setMaxWidth(40);

        columnModel.getColumn(4).setMinWidth(0);
        columnModel.getColumn(3).setMaxWidth(100);
        columnModel.getColumn(3).setMinWidth(100);
        columnModel.getColumn(1).setMaxWidth(300);
        columnModel.getColumn(1).setMinWidth(300);
        columnModel.getColumn(2).setMaxWidth(200);
        columnModel.getColumn(2).setMinWidth(200);

        //agregamos accion al cmb_buscar
        cmb_buscar.addActionListener((ActionEvent e) -> {
            buscar = cmb_buscar.getSelectedItem().toString();

            switch (buscar) {
                case "Nombre" ->
                    jlabel_buscar.setText("Ingrese el nombre del libro que desea eliminar:");
                case "Autor" ->
                    jlabel_buscar.setText("Ingrese el Autor del libro que desea eliminar:");
                case "Categoria" ->
                    jlabel_buscar.setText("Ingrese la categoria del libro que desea eliminar:");
                default -> {
                }
            }
        });
        
        
    }

    @Override
    public Image getIconImage() {
        Image retvalu = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icon.png"));
        return retvalu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlabel_titulo = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jlabel_buscar = new javax.swing.JLabel();
        jScrollPane_consulta = new javax.swing.JScrollPane();
        jTable_consulta = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jlabel_footer = new javax.swing.JLabel();
        cmb_buscar = new javax.swing.JComboBox<>();
        btt_agregarLibro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jlabel_titulo.setBackground(new java.awt.Color(102, 102, 102));
        Jlabel_titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Jlabel_titulo.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel_titulo.setText("Biblioteca Virtual Fray Ignacio Mariño");
        getContentPane().add(Jlabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 455, 52));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 440, 30));

        jlabel_buscar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabel_buscar.setText("Ingrese el nombre del libro que desea buscar:");
        getContentPane().add(jlabel_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jTable_consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "Autor", "Categoria", "Cantidad"
            }
        ));
        jScrollPane_consulta.setViewportView(jTable_consulta);

        getContentPane().add(jScrollPane_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 770, 300));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 90, -1));

        jlabel_footer.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setText("Creado por Enrique Monsalve Ing ");
        getContentPane().add(jlabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, -1, 23));

        cmb_buscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Autor", "Categoria" }));
        cmb_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 90, 30));

        btt_agregarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aggLibro.png"))); // NOI18N
        btt_agregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_agregarLibroActionPerformed(evt);
            }
        });
        getContentPane().add(btt_agregarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 110, 90));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Agregar LIbro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, -1, -1));
        getContentPane().add(jlabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    

        model.setRowCount(0);
        String texto = txt_nombre.getText().trim();
        if (buscar.equals("Nombre") & txt_nombre.getText().trim().equals("")) {

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select id, nombre, Autor, Categoria, Estado from libro");
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    Object[] fila = new Object[5];
                    for (int i = 0; i < 5; i++) {
                        fila[i] = rs.getObject(i + 1);
                    }
                    model.addRow(fila);
                }
                cn.close();

            } catch (SQLException e) {
                System.err.println("error al imprimr datos en tabla " + e);
            }

        } else if (buscar.equals("Nombre") & !txt_nombre.getText().trim().equals("")) {
            model.setRowCount(0);
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select id, nombre, Autor, Categoria, Estado from libro where Nombre like ?");
                pst.setString(1, "%" + texto + "%");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    Object[] libro = new Object[5];
                    for (int i = 0; i < 5; i++) {
                        libro[i] = rs.getObject(i + 1);
                    }
                    model.addRow(libro);
                }
            } catch (SQLException e) {
                System.err.println("error al buscar libro por nombre: " + e);
            }
        } else if (buscar.equals("Autor")) {
            model.setRowCount(0);
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select id, nombre, Autor, Categoria, Estado from libro where Autor like ?");
                pst.setString(1, "%" + texto + "%");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    Object[] libro = new Object[5];
                    for (int i = 0; i < 5; i++) {
                        libro[i] = rs.getObject(i + 1);
                    }
                    model.addRow(libro);
                }
            } catch (SQLException e) {
                System.err.println("error al buscar libro por Autor: " + e);
            }

        } else {
            model.setRowCount(0);
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select id, nombre, Autor, Categoria, Estado from libro where Categoria like ?");
                pst.setString(1, "%" + texto + "%");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    Object[] libro = new Object[5];
                    for (int i = 0; i < 5; i++) {
                        libro[i] = rs.getObject(i + 1);
                    }
                    model.addRow(libro);
                }
            } catch (SQLException e) {
                System.err.println("error al buscar libro por Categoria: " + e);
            }
        }

        //agregamos el evento a la selecion de la tabla
        jTable_consulta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_consulta.rowAtPoint(e.getPoint());
                int columna = 0;

                if (fila_point > -1) {
                    id_libro = (int) model.getValueAt(fila_point, columna);
                    EliminarLibro eliminarLibro = new EliminarLibro();
                        eliminarLibro.setVisible(true);
                    dispose();
                }
            }
        });
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_buscarActionPerformed

    private void btt_agregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_agregarLibroActionPerformed
       AgregarLibro agregarLibro= new AgregarLibro();
       agregarLibro.setVisible(true);
       dispose();
    }//GEN-LAST:event_btt_agregarLibroActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarDatos.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarDatos.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarDatos.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarDatos.class  

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_titulo;
    private javax.swing.JButton btt_agregarLibro;
    private javax.swing.JComboBox<String> cmb_buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane_consulta;
    private javax.swing.JTable jTable_consulta;
    private javax.swing.JLabel jlabel_buscar;
    private javax.swing.JLabel jlabel_footer;
    private javax.swing.JLabel jlabel_wallpaper;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

  
}
