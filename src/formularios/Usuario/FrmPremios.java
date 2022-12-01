/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios.Usuario;
import formularios.Usuario.FrmLobby;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class FrmPremios extends javax.swing.JFrame {
    String linea;
    String archivoCodigos = "Codigos.txt";
    String archivo = "RegistroUsuarios.txt";
    ArrayList<String> datosTxt = new ArrayList();
    ArrayList<String> codigos = new ArrayList();
    /**
     * Creates new form FrmPremios
     */
    public FrmPremios(String lineaAnt) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.linea = lineaAnt;
        actualizarPuntos();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                FrmLobby ventanaLobby = new FrmLobby(linea);
                ventanaLobby.setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnHamburguesa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnTicketHambur = new javax.swing.JButton();
        lblPuntos = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTicketPremio2 = new javax.swing.JButton();
        btnPremio2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIENDA DE REGALOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 21, -1, -1));

        btnHamburguesa.setText("Canjear");
        btnHamburguesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHamburguesaActionPerformed(evt);
            }
        });
        getContentPane().add(btnHamburguesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Premio de una hamburguesa, valor: 1.000.000 Fichas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        btnTicketHambur.setText("Abrir ticket");
        btnTicketHambur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketHamburActionPerformed(evt);
            }
        });
        getContentPane().add(btnTicketHambur, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        lblPuntos.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntos.setText("Fichas = 0");
        getContentPane().add(lblPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 21, 134, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 208, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 6, 35, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Premio sorpresa valor: 1.500.000 Fichas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        btnTicketPremio2.setText("Abrir ticket");
        btnTicketPremio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketPremio2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnTicketPremio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        btnPremio2.setText("Canjear");
        btnPremio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPremio2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPremio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHamburguesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHamburguesaActionPerformed
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivoCodigos, true));
            salida.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        String codigo = "";
        
        for(int i = 0; i < 8; i++){
            int numero = (int)(Math.random() * ((9 - 0) + 1)) + 0;
            codigo = codigo + numero;
        }
        
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(archivoCodigos));
        
            String line;
                while ((line = br.readLine()) != null) {
                        codigos.add(line);
                       
                   
                }
            if(!codigos.contains(codigo)){
                PrintWriter salida = new PrintWriter(new FileWriter(archivoCodigos, true));
                        salida.println(codigo + " : una hamburguesa");
                        salida.close();
                        String[] lineaSeparada = linea.split(":");
                        generarPdf("Una hamburguesa", 1000000, codigo, "PremioHamburguesa" + lineaSeparada[2] + ".pdf");
                        btnTicketHambur.setEnabled(true);
            }
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPremios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPremios.class.getName()).log(Level.SEVERE, null, ex);
        }
        int puntos = obtenerPuntos() - 1000000;
        operarPuntos(puntos,obtenerPartidas());
        
        if(obtenerPuntos() >= 1000000){
            btnHamburguesa.setEnabled(true);
        }else{
            btnHamburguesa.setEnabled(false);
        }
    }//GEN-LAST:event_btnHamburguesaActionPerformed

    private void btnTicketHamburActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketHamburActionPerformed
        String[] lineaSeparada = linea.split(":");
        abrirArchivo( "PremioHamburguesa" + lineaSeparada[2] + ".pdf");
    }//GEN-LAST:event_btnTicketHamburActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FrmLobby ventanaLobby = new FrmLobby(linea);
        ventanaLobby.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnTicketPremio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketPremio2ActionPerformed
        String[] lineaSeparada = linea.split(":");
        abrirArchivo("PremioSorpresa" + lineaSeparada[2] + ".pdf");
    }//GEN-LAST:event_btnTicketPremio2ActionPerformed

    private void btnPremio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPremio2ActionPerformed
         try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivoCodigos, true));
            salida.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        String codigo = "";
        
        for(int i = 0; i < 8; i++){
            int numero = (int)(Math.random() * ((9 - 0) + 1)) + 0;
            codigo = codigo + numero;
        }
        
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(archivoCodigos));
        
            String line;
                while ((line = br.readLine()) != null) {
                        codigos.add(line);
                       
                   
                }
            if(!codigos.contains(codigo)){
                PrintWriter salida = new PrintWriter(new FileWriter(archivoCodigos, true));
                        salida.println(codigo + " : Premio sorpresa");
                        salida.close();
                        String[] lineaSeparada = linea.split(":");
                        generarPdf("Un abrazo del popular estudiante del ITS Villada, Marco Andino", 1500000, codigo, "PremioSorpresa" + lineaSeparada[2] + ".pdf");
                        btnTicketPremio2.setEnabled(true);
            }
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPremios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPremios.class.getName()).log(Level.SEVERE, null, ex);
        }
        int puntos = obtenerPuntos() - 1500000;
        operarPuntos(puntos,obtenerPartidas());
        
        if(obtenerPuntos() >= 1500000){
            btnPremio2.setEnabled(true);
        }else{
            btnPremio2.setEnabled(false);
        }
    }//GEN-LAST:event_btnPremio2ActionPerformed
    
    
    public boolean abrirArchivo(String nombre){
            try{
                File path = new File(nombre);
                Desktop.getDesktop().open(path);
                return true;
            }catch (IOException ex) {
                return false;
            }
            
    }
    
    
    public void generarPdf(String premio, int fichas, String codigo, String nombreArchivo){
        String[] lineaSeparada = linea.split(":");
        try {
            FileOutputStream archivo = new FileOutputStream(nombreArchivo);
            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            
            documento.add(new Paragraph("                 _             \n" +
"                 (_)            \n" +
"  ___   __ _ ___ _   __   ___  \n" +
" / __/  |_` / __| |  | '_|| / _ \\ \n" +
"| (_  | (_| \\__ | | | | | | (_) |\n" +
" \\___\\__,_|___/|_| | | |\\___/ \n" +
"                             "));
            Paragraph parrafo = new Paragraph("                                          Felicidades por ganar el premio");
            parrafo.setAlignment(3);//tamaño?
            documento.add(parrafo);
            documento.add(new Paragraph("---------------------------------------------------------------------------------------------------------------------------"));
            
            documento.add(new Paragraph(" "));
            documento.add(new Paragraph("Se le acredita el premio al señor: " + lineaSeparada[4] + " " + lineaSeparada[5] + " de usuario: " + lineaSeparada[2] + " el premio de " + premio + " con el valor de " + fichas + " de fichas"));
            documento.add(new Paragraph(" "));
            documento.add(new Paragraph("---------------------------------------------------------------------------------------------------------------------------"));
            documento.add(new Paragraph(" "));
            documento.add(new Paragraph("Su codigo es: " + codigo + " No se lo muestre a nadie o puede ser reclamado el premio por otra persona"));
            
            documento.add(new Paragraph("                                          Firmado: El 'K' zino"));
             DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            documento.add(new Paragraph("                                          fecha: " + dtf.format(LocalDateTime.now())));
            documento.add(new Paragraph(" "));
            documento.add(new Paragraph("                 _             \n" +
"                 (_)            \n" +
"  ___   __ _ ___ _   __   ___  \n" +
" / __/  |_` / __| |  | '_|| / _ \\ \n" +
"| (_  | (_| \\__ | | | | | | (_) |\n" +
" \\___\\__,_|___/|_| | | |\\___/ \n" +
"                             "));
            
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPremios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(FrmPremios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void actualizarPuntos(){
        int fichas = obtenerPuntos();
        String[] lineaSeparada = linea.split(":");
        File archivoHam = new File("premioHamburguesa" + lineaSeparada[2] + ".pdf");
        File archivo2 = new File("PremioSorpresa" + lineaSeparada[2] + ".pdf");
        lblPuntos.setText(fichas + " fichas");
        if(archivoHam.exists()){
            btnTicketHambur.setEnabled(true);
        }else{
            btnTicketHambur.setEnabled(false);
        }
        if(archivo2.exists()){
            btnTicketPremio2.setEnabled(true);
        }else{
            btnTicketPremio2.setEnabled(false);
        }
        if(fichas >= 1000000){
            btnHamburguesa.setEnabled(true);
        }else{
            btnHamburguesa.setEnabled(false);
        }
        if(fichas >= 1500000){
            btnPremio2.setEnabled(true);
        }else{
            btnPremio2.setEnabled(false);
        }
        
        
    }

    
    
    public int obtenerPuntos(){
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
    
    
    public void operarPuntos(int numero, int partidasJugadas){
            datosTxt = leerArchivo();
            
            String[] lineaSeparada = linea.split(":");
            limpiarArchivo();
            for (int i=0;i<datosTxt.size();i++){
                if(datosTxt.get(i).contains(":U")){
                    String[] datosSep = datosTxt.get(i).split(":");
                    
                    if(lineaSeparada[2].equals(datosSep[2])){
                            
                            lineaSeparada[0] = numero + "";
                            if(partidasJugadas != 0){
                                lineaSeparada[1] = partidasJugadas + "";
                            }
                            
                            
                            escribirArchivo((Arrays.toString(lineaSeparada) + "\n").replace("[", "").replace("]","").replace(", ", ":"));
                            

                        }else{
                            escribirArchivo((datosTxt.get(i) + "\n").replace("[", "").replace("]","").replace(", ", ":"));
                        }
            }else{
                    escribirArchivo((datosTxt.get(i) + "\n").replace("[", "").replace("]","").replace(", ", ":"));
                }
        }
            lblPuntos.setText(numero + " fichas");
    }
    
    
    public void limpiarArchivo(){
        File archivo = new File("RegistroUsuarios.txt");
        try {
            FileWriter escritor = new FileWriter(archivo, false);
            escritor.write("");
            
        } catch (Exception ex) {}
        
    }

            public void escribirArchivo(String dato){

            try (FileWriter escritor = new FileWriter(archivo, true)) {
                escritor.append(dato);
            }
         catch (Exception e){
            
        }
        }
    
        public ArrayList<String> leerArchivo(){
            ArrayList<String> datos = new ArrayList();
            try {
                BufferedReader leer = new BufferedReader(new FileReader(archivo));
                String lectura = leer.readLine();

                while(lectura != null){

                    datos.add(lectura);
                    lectura = leer.readLine();


                }

                leer.close();
            return datos;
            }catch(Exception e){

        }   

        return null;
        }
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHamburguesa;
    private javax.swing.JButton btnPremio2;
    private javax.swing.JButton btnTicketHambur;
    private javax.swing.JButton btnTicketPremio2;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblPuntos;
    // End of variables declaration//GEN-END:variables
}