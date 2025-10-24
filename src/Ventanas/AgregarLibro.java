package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AgregarLibro extends javax.swing.JFrame {

    public static int id_libro = 0;
    int cant;

    /*se les da personalizacion a algunos de los componentes principales del Jframe*/
    public AgregarLibro() {
        initComponents();
        setTitle("Biblioteca📚 - Agregar Libro");
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(688, 491);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        id_libro = GestionarDatos.id_libro;

        /* se categrizan las url donde se maneja los logos y imagenes con las cuales se les da el diseño al Jframe */
        URL url = getClass().getResource("/Imagenes/fondo.jpg");
        if (url != null) {
            ImageIcon wallpaper = new ImageIcon(url);
            Icon fondo = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_wallpaper.getWidth(),
                    jLabel_wallpaper.getHeight(), Image.SCALE_AREA_AVERAGING));
            jLabel_wallpaper.setIcon(fondo);
            this.repaint();
        }

              //se utiliza para no clickear sinno utilizar la tecla del teclado para ingresar

        txt_cantidad.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    btt_Guardar.doClick(); // Simula un clic en el botón
                }
            }
        });

    }
    //se utilizo url para no generar errores al buscar la imagen de icono
    @Override
    public Image getIconImage() {
        URL url = ClassLoader.getSystemResource("Imagenes/icon.png");
        if (url != null) {
            Image retValue = Toolkit.getDefaultToolkit().getImage(url);
            return retValue;
        }
        return null;
    }
    //se utiliza para limpiar los txt
    public void limpiar() {
        txt_autor.setBackground(Color.WHITE);
        txt_cantidad.setBackground(Color.WHITE);
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
        txt_cantidad = new javax.swing.JTextField();
        cmb_estado = new javax.swing.JComboBox<>();
        btt_Guardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Cmb_categoria = new javax.swing.JComboBox<>();
        jLabel_wallpaper = new javax.swing.JLabel();

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

        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
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

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Estado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        Cmb_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERALES", "FILOSOFIA", "RELIGION", "SOCIALES", "NUMEROS", "INGENIERIA", "GEOGRAFIA", "NOVELA", "POESIA", "CUENTO" }));
        getContentPane().add(Cmb_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 190, 40));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //el metodo primcipal donde verifican los txt y se agrega la informaion a la base datos(Nuevo libro).
    
    private void btt_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_GuardarActionPerformed
        String autor, nombre, cantidad;
        autor = txt_autor.getText().trim();
        nombre = txt_nombre.getText().trim();
        cantidad = txt_cantidad.getText().trim();
        boolean valido = true;

        if (autor.equals("")) {
            txt_autor.setBackground(Color.red);
            valido = false;
        }
        if (nombre.equals("")) {
            txt_nombre.setBackground(Color.red);
            valido = false;
        }
        if (cantidad.equals("")) {
            txt_cantidad.setBackground(Color.red);
            valido = false;
        }
            //se verifica que se agregue un numero valido
        try {
            cant = Integer.parseInt(cantidad);
        } catch (NumberFormatException e) {
            txt_cantidad.setBackground(Color.red);
            valido = false;
        }

        //validamos que el libro a ingresar no este ingresado
        try {
            try (Connection cn = Conexion.conectar()) {
                if (valido) {
                    PreparedStatement pst = cn.prepareStatement("select Nombre from libro where nombre=?");
                    pst.setString(1, nombre);
                    ResultSet rs = pst.executeQuery();
                    if (!rs.next()) {                       
                        //se inserta el nuevo libro a la base de datos
                        try {
                            try (Connection cn2 = Conexion.conectar()) {
                                PreparedStatement pst2 = cn2.prepareStatement("Insert into Libro values (?,?,?,?,?,?,?)");
                                pst2.setInt(1, 0);
                                pst2.setString(2, nombre.toUpperCase());
                                pst2.setString(3, autor.toUpperCase());
                                pst2.setString(4, Cmb_categoria.getSelectedItem().toString());
                                pst2.setInt(5, cant);
                                pst2.setString(6, cmb_estado.getSelectedItem().toString());
                                pst2.setString(7, null);
                                pst2.executeUpdate();
                                this.dispose();
                            }
                            //se crean los mensajes de informacion para el usuario
                            JOptionPane.showMessageDialog(null, "El registro del Nuevo libro fue exitoso!!");
                            
                            //maneja las excepciones internas que puedan ocurrir
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, "Error al guardar el nuevo libro!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El libro ya esta registrado!");
                        limpiar();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Complete los datos del libro");
                    limpiar();
                    txt_cantidad.setText("");
                    txt_cantidad.requestFocus();
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error a la hora de buscar el libro ");
        }


    }//GEN-LAST:event_btt_GuardarActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> {
            new AgregarLibro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cmb_categoria;
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
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
