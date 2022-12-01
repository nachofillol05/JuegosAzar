/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios.Usuario;

import formularios.Usuario.FrmLobby;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class FrmDatos extends javax.swing.JFrame {
    ArrayList<String> datosTxt = new ArrayList();
    String archivo = "RegistroUsuarios.txt";
    String linea;
    /**
     * Creates new form FrmDatos
     */
    public FrmDatos(String lineaAnt) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                FrmLobby ventanaLobby = new FrmLobby(linea);
                ventanaLobby.setVisible(true);
            }
        });
        this.linea = lineaAnt;
        lblFichas.setText(obtenerFichas() + "");
        lblPartidas.setText(obtenerPartidas() + "");
        String[] lineaSeparada = linea.split(":");
        lblApellido.setText(lineaSeparada[5]);
        lblEdad2.setText(lineaSeparada[6]);
        lblNombre.setText(lineaSeparada[4]);
        lblUsuario.setText(lineaSeparada[2]);
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPartidas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblFichas = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblEdad2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 96, 184, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 40, -1, -1));

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 40, 184, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 68, -1, -1));

        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 68, 184, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 96, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 124, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Partidas jugadas :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 152, -1, -1));

        lblPartidas.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblPartidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 152, 184, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fichas :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 180, -1, -1));

        lblFichas.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblFichas, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 180, 184, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MIS DATOS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 6, -1, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 228, -1, -1));

        lblEdad2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblEdad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 124, 72, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FrmLobby ventanaLobby = new FrmLobby(linea);
        ventanaLobby.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */
 public ArrayList<String> leerArchivo(){
            ArrayList<String> datos = new ArrayList();
            try {
                BufferedReader leer = new BufferedReader(new FileReader(archivo));
                String lectura = leer.readLine();
                 while(lectura != null){
                 
                    datos.add(lectura);
                    lectura = leer.readLine();
                    
                }
             
            return datos;
            }catch(Exception e){
                
        }
        return null;
        }
    
    
    
    
        public int obtenerFichas(){
            datosTxt = leerArchivo();
            String[] lineaSeparada = linea.split(":");
            for (int i=0;i<datosTxt.size();i++){
            
                if(datosTxt.get(i).contains(":U")){
                    String[] datosSep = datosTxt.get(i).split(":");
                    if(lineaSeparada[2].equals(datosSep[2])){
                        int fichas =  Integer.parseInt(datosSep[0]);
                        return fichas;
                    }
                }
            }
            return 0;
        }
        
        public int obtenerPartidas(){
            datosTxt = leerArchivo();
            String[] lineaSeparada = linea.split(":");
            for (int i=0;i<datosTxt.size();i++){
            
                if(datosTxt.get(i).contains(":U")){
                    String[] datosSep = datosTxt.get(i).split(":");
                   
                    if(lineaSeparada[2].equals(datosSep[2])){
                        int partidas =  Integer.parseInt(datosSep[1]);
                        return partidas;
                    }
                }
            }
            return 0;
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblEdad2;
    private javax.swing.JLabel lblFichas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPartidas;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
