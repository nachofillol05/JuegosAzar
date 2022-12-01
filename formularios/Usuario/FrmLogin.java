package formularios.Usuario;

import formularios.superUsuario.FrmIngresoSuper;
import formularios.Usuario.FrmLobby;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class FrmLogin extends javax.swing.JFrame {

    String nombreArchivo = "RegistroUsuarios.txt";
    File archivo = new File(nombreArchivo);

    public FrmLogin() {
        initComponents();

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        lblError.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        lblError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblContraseniaMal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel3.setText("jLabel2");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        btnSignUp.setText("SIGN UP");
        btnSignUp.setToolTipText("");
        btnSignUp.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                btnSignUpMouseWheelMoved(evt);
            }
        });
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 180, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel5.setForeground(new java.awt.Color(51, 255, 51));
        jLabel5.setText("¿No tienes una cuenta? Presiona aqui para crearla");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));
        jPanel2.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 180, -1));

        lblError.setForeground(new java.awt.Color(255, 51, 51));
        lblError.setText("Completar los datos porfavor!");
        jPanel2.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO A JUEGOS DE AZAR");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        lblContraseniaMal.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(lblContraseniaMal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 206, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 330));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            if (leerArchivo().isEmpty()) {
                lblContraseniaMal.setText("No existe ese usuario");
                lblContraseniaMal.setVisible(true);
            } else {
                String usuario = txtUsuario.getText();
                String contrasenia = txtContrasenia.getText();
                if (!usuario.equals("") && !contrasenia.equals("")) {
                    lblError.setVisible(false);

                    BufferedReader br = new BufferedReader(new FileReader(archivo));
                    String linea;

                    while ((linea = br.readLine()) != null) {
                        String[] lineaSeparada = linea.split(":");
                        if (lineaSeparada[2].equals(usuario) && lineaSeparada[lineaSeparada.length - 1].equals("U")) {

                            if (lineaSeparada[3].equals(contrasenia)) {
                                FrmLobby ventanaLobby = new FrmLobby(linea);
                                ventanaLobby.setVisible(true);
                                lblContraseniaMal.setText("");
                                this.setVisible(false);
                                break;
                            } else {
                                System.out.println("siiiii");
                                lblContraseniaMal.setText("Contraseña incorrecta");
                                lblContraseniaMal.setVisible(true);
                                break;
                            }
                        } else {
                            lblContraseniaMal.setText("No existe ese usuario");
                            lblContraseniaMal.setVisible(true);

                        }
                    }
                    br.close();

                } else {
                    lblError.setVisible(true);

                }
            }
        } catch (Exception e) {
            lblContraseniaMal.setText("No existe ningun usuario");
            lblContraseniaMal.setVisible(true);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignUpMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_btnSignUpMouseWheelMoved
        this.dispose();
        FrmIngresoSuper ventanaSuper = new FrmIngresoSuper();
        ventanaSuper.setVisible(true);
    }//GEN-LAST:event_btnSignUpMouseWheelMoved

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        FrmSignUp ventanaSign = new FrmSignUp();
        this.dispose();
        ventanaSign.setVisible(true);
    }//GEN-LAST:event_btnSignUpActionPerformed

    public ArrayList<String> leerArchivo() {
        ArrayList<String> datos = new ArrayList();
        try {
            BufferedReader leer = new BufferedReader(new FileReader(archivo));
            String lectura = leer.readLine();
            while (lectura != null) {

                datos.add(lectura);
                lectura = leer.readLine();

            }

            return datos;
        } catch (Exception e) {

        }
        return null;
    }

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblContraseniaMal;
    private javax.swing.JLabel lblError;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}