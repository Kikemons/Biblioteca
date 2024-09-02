
package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class AgregarLibro extends javax.swing.JFrame {
    public static int id_libro=0;
    boolean valido=false;

    public AgregarLibro() {
        initComponents();
        setTitle("Biblioteca📚 - Agregar Libro");
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(688, 491);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        id_libro=GestionarDatos.id_libro;
        
        
        
       ImageIcon wallpaper= new ImageIcon("src/Imagenes/fondo.jpg");
       Icon fondo= new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_wallpaper.getWidth(),
               jLabel_wallpaper.getHeight(), Image.SCALE_AREA_AVERAGING));
       jLabel_wallpaper.setIcon(fondo);
       this.repaint();
       
       
       
        try {
            try (Connection cn = Conexion.conectar()) {
                PreparedStatement pst=cn.prepareStatement("select * from Libro where id="+id_libro);
                ResultSet rs=pst.executeQuery();
                if (rs.next()) {
                    txt_nombre.setText(rs.getString("Nombre"));
                    txt_autor.setText(rs.getString("Autor"));
                    txt_cantidad.setText(rs.getString("Ejemplares"));
                    txt_categoria.setText(rs.getString("Categoria"));
                    cmb_estado.setSelectedItem(rs.getString("Estado"));
                }
            }
        } catch (SQLException e) {
            System.err.println("error a la hora de consultar los datos del libro: "+e);
        }
       
    
       
    }
    
    @Override
    public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icon.png"));
        return retValue;
    }
    
    public void limpiar(){
        txt_autor.setBackground(Color.WHITE);
        txt_cantidad.setBackground(Color.WHITE);
        txt_categoria.setBackground(Color.WHITE);
        txt_nombre.setBackground(Color.WHITE);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlabel_titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlabel_footer = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_autor = new javax.swing.JTextField();
        txt_categoria = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        cmb_estado = new javax.swing.JComboBox<>();
        btt_Guardar = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jlabel_titulo.setBackground(new java.awt.Color(102, 102, 102));
        Jlabel_titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Jlabel_titulo.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel_titulo.setText("Biblioteca Virtual Fray Ignacio Mariño");
        getContentPane().add(Jlabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 455, 52));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Categoria:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Autor:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Guardar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        jlabel_footer.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_footer.setText("Creado por Enrique Monsalve Ing ");
        getContentPane().add(jlabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, 23));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 278, 36));
        getContentPane().add(txt_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 278, 36));
        getContentPane().add(txt_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 278, 36));
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 278, 36));

        cmb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin prestar", "Prestado" }));
        getContentPane().add(cmb_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 160, 36));

        btt_Guardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btt_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aggLibro.png"))); // NOI18N
        btt_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btt_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 130, 100));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 470));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Estado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_GuardarActionPerformed
        String autor, nombre,cantidad,categoria;
       autor=txt_autor.getText().trim();
       nombre=txt_nombre.getText().trim();
       cantidad=txt_cantidad.getText().trim();
       categoria=txt_categoria.getText().trim();
       
        if (autor.equals("")) {
            txt_autor.setBackground(Color.red);
            
        }else if (nombre.equals("")) {
            txt_nombre.setBackground(Color.red);
        }
        else if (cantidad.equals("")) {
            txt_cantidad.setBackground(Color.red);
        }
        else if (categoria.equals("")) {
            txt_categoria.setBackground(Color.red);
        }else{
            valido=true;
        }
        
        
        
        if (valido==true) {
             try {
                 try (Connection cn2 = Conexion.conectar()) {
                     PreparedStatement pst2=cn2.prepareStatement("Insert into Libro values (?,?,?,?,?,?)");
                     pst2.setInt(1, 0);
                     pst2.setString(2, txt_nombre.getText().trim());
                     pst2.setString(3, txt_autor.getText().trim());
                     pst2.setString(4, txt_categoria.getText().trim());
                     pst2.setString(5, txt_cantidad.getText().trim());
                     pst2.setString(6, cmb_estado.getSelectedItem().toString());
                     pst2.executeUpdate();
                     this.dispose();
                 }
               
               JOptionPane.showMessageDialog(null, "El registro del Nuevo libro fue exitoso!!");
    
        } catch (SQLException e) {
            System.err.println("error al guardar el nuevo libro: "+e);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Complete los datos del libro");
            limpiar();
        }
        
        
    }//GEN-LAST:event_btt_GuardarActionPerformed

  
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
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AgregarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_titulo;
    private javax.swing.JButton btt_Guardar;
    private javax.swing.JComboBox<String> cmb_estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JLabel jlabel_footer;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_categoria;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
