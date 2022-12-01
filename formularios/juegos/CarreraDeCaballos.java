package formularios.juegos;

import formularios.Usuario.FrmLobby;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;

public class CarreraDeCaballos extends javax.swing.JFrame {
    String ganador = "";
    Timer t;
    int fin = 0;
    int tiempo = 0;
    ArrayList<String> datosTxt = new ArrayList();
    String archivo = "RegistroUsuarios.txt";
    String linea;
    int puntos;
    int partidasJugadas;
    boolean allIn;
    int puntosAll;
    int fichasGanadas = 0;
    boolean jugar = true;
    int c1 =0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0;
    String audio;
    Clip clipito;
    
    public CarreraDeCaballos(String lineaAnt) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        cmbApuesta.removeAllItems();
        cmbCompetidor.removeAllItems();
        cmbApuesta.addItem("1");
        cmbApuesta.addItem("5");
        cmbApuesta.addItem("10");
        cmbApuesta.addItem("50");
        cmbApuesta.addItem("100");
        cmbApuesta.addItem("500");
        cmbApuesta.addItem("1000");
        cmbApuesta.addItem("10000");
        cmbApuesta.addItem("100000");
        cmbApuesta.addItem("1000000");
        cmbApuesta.addItem("All in");
        cmbCompetidor.addItem("Juan Táctico");
        cmbCompetidor.addItem("Tiro al Blanco");
        cmbCompetidor.addItem("Jerberto Jerbertoso");
        cmbCompetidor.addItem("John Henry");
        cmbCompetidor.addItem("El caballo blanco de San Martin");
        cmbCompetidor.addItem("R1650");
        lblNoFichas.setVisible(false);
        this.linea = lineaAnt;
        puntos = obtenerPuntos();
        lblPuntitos.setText(puntos + " Fichas");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                operarPuntos(puntos, obtenerPartidas());
                FrmLobby ventanaLobby = new FrmLobby(linea);
                ventanaLobby.setVisible(true);
            }
        });
        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/palancaJugar.jpg")));

        
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        cmbApuesta = new javax.swing.JComboBox<>();
        cmbCompetidor = new javax.swing.JComboBox<>();
        lblCatch = new javax.swing.JLabel();
        lblCaballo1 = new javax.swing.JLabel();
        lblCaballo2 = new javax.swing.JLabel();
        lblCaballo3 = new javax.swing.JLabel();
        lblCaballo4 = new javax.swing.JLabel();
        lblCaballo5 = new javax.swing.JLabel();
        lblCaballo6 = new javax.swing.JLabel();
        lblNoFichas = new javax.swing.JLabel();
        lblPuntitos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblC6 = new javax.swing.JLabel();
        lblC4 = new javax.swing.JLabel();
        lblC5 = new javax.swing.JLabel();
        lblC1 = new javax.swing.JLabel();
        lblC2 = new javax.swing.JLabel();
        lblC3 = new javax.swing.JLabel();
        lblCacallosFondo = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Juegosesto.png"))); // NOI18N
        jLabel11.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setText("¡Bienvenido a la Carrera de Caballos!");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/palancaJugar.jpg"))); // NOI18N
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 80, 78));

        cmbApuesta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 115, -1));

        cmbCompetidor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbCompetidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 115, -1));
        getContentPane().add(lblCatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 509, 24));

        lblCaballo1.setBackground(new java.awt.Color(0, 100, 0));
        lblCaballo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCaballo1.setForeground(new java.awt.Color(255, 0, 0));
        lblCaballo1.setText("Juan Táctico");
        getContentPane().add(lblCaballo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        lblCaballo2.setBackground(new java.awt.Color(0, 100, 0));
        lblCaballo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCaballo2.setForeground(new java.awt.Color(0, 0, 255));
        lblCaballo2.setText("Jerberto");
        getContentPane().add(lblCaballo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        lblCaballo3.setBackground(new java.awt.Color(0, 100, 0));
        lblCaballo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCaballo3.setForeground(new java.awt.Color(255, 255, 0));
        lblCaballo3.setText("Tiro");
        getContentPane().add(lblCaballo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        lblCaballo4.setBackground(new java.awt.Color(0, 100, 0));
        lblCaballo4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCaballo4.setForeground(new java.awt.Color(0, 255, 0));
        lblCaballo4.setText("Jhon Henry");
        getContentPane().add(lblCaballo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        lblCaballo5.setBackground(new java.awt.Color(0, 100, 0));
        lblCaballo5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCaballo5.setForeground(new java.awt.Color(255, 0, 255));
        lblCaballo5.setText("C/San Martin");
        getContentPane().add(lblCaballo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, 20));

        lblCaballo6.setBackground(new java.awt.Color(0, 100, 0));
        lblCaballo6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCaballo6.setForeground(new java.awt.Color(0, 255, 255));
        lblCaballo6.setText("R1650");
        getContentPane().add(lblCaballo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 44, -1));

        lblNoFichas.setForeground(new java.awt.Color(255, 51, 51));
        lblNoFichas.setText("No te alcanzan las fichas");
        getContentPane().add(lblNoFichas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 139, -1));

        lblPuntitos.setText("0 fichas");
        getContentPane().add(lblPuntitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 97, -1));

        jLabel1.setText("Fichas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 37, -1));

        lblC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/R1650.png"))); // NOI18N
        lblC6.setText("O");
        getContentPane().add(lblC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 30, 20));

        lblC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/John Henry.png"))); // NOI18N
        lblC4.setText("O");
        getContentPane().add(lblC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 30, 20));

        lblC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Caballo Blanco de San Martin.png"))); // NOI18N
        lblC5.setText("O");
        getContentPane().add(lblC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 30, 20));

        lblC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Juan Tactico.png"))); // NOI18N
        lblC1.setText("O");
        getContentPane().add(lblC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 30, 20));

        lblC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tiro al Blanco.png"))); // NOI18N
        lblC2.setText("O");
        getContentPane().add(lblC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 30, 20));

        lblC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Jerberto Jerbertoso.png"))); // NOI18N
        lblC3.setText("O");
        getContentPane().add(lblC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 30, 20));

        lblCacallosFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caballoscarrerafondito.png"))); // NOI18N
        lblCacallosFondo.setText("CABALLOS");
        getContentPane().add(lblCacallosFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 420, 180));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoJuegos.jpg"))); // NOI18N
        jLabel21.setText("jLabel21");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FrmLobby ventanaLobby = new FrmLobby(linea);
        ventanaLobby.setVisible(true);
        this.dispose();
        operarPuntos(puntos, obtenerPartidas());
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        if(jugar){
            audio = "..\\audio\\Item_108.wav";
            try {
                clipito = reproducirAudio(audio);
                clipito.start();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(TragaFichas.class.getName()).log(Level.SEVERE, null, ex);
            }
            boolean seguir = false;
            if(cmbApuesta.getSelectedItem().toString().equals("All in")){
                if(obtenerPuntos() != 0){
                    lblNoFichas.setVisible(false);
                    puntosAll = puntos;
                    puntos = 0;
                    allIn = true;
                    seguir = true;


                }else{
                    lblNoFichas.setText("No tenes fichas");
                    lblNoFichas.setVisible(true);
                    seguir = false;
                }
            }else{
                if((puntos - Integer.parseInt(cmbApuesta.getSelectedItem().toString())) >= 0){
                lblNoFichas.setVisible(false);
                puntos -= Integer.parseInt(cmbApuesta.getSelectedItem().toString());
                seguir = true;
                }else{
                    lblNoFichas.setText("No te alcanzan las fichas");
                    lblNoFichas.setVisible(true);
                    seguir = false;
                }
            }
            if(seguir){
                audio = "..\\audio\\Ride (online-audio-converter.com).wav";
                try {
                    clipito = reproducirAudio(audio);
                    clipito.start();
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(TragaFichas.class.getName()).log(Level.SEVERE, null, ex);
                }
                lblC1.setLocation(6, lblC1.getY());
                lblC2.setLocation(6, lblC2.getY());
                lblC3.setLocation(6, lblC3.getY());
                lblC4.setLocation(6, lblC4.getY());
                lblC5.setLocation(6, lblC5.getY());
                lblC6.setLocation(6, lblC6.getY());
                c1 =0;c2 = 0;c3 = 0;c4 = 0;c5 = 0;c6 = 0;
                partidasJugadas = obtenerPartidas() + 1;
                operarPuntos(puntos, partidasJugadas);
                clear();
                onOff(false);
                    fin = 0;
                    t = new Timer(40, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            
                            horseRun();
                            
                            if (fin != 0){
                                check();
                                t.stop();
                                lblCatch.setText(ganador);
                                onOff(true);
                            }
                        }
                    });
                t.start();
            }
        
        
        }
    }//GEN-LAST:event_btnJugarActionPerformed

    private void onOff(boolean x){
        cmbApuesta.setEnabled(x);
        cmbCompetidor.setEnabled(x);
        btnVolver.setEnabled(x);
        jugar = x;
        if(x){
            btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/palancaJugar.jpg")));
        }else{
            btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/palancaJugando.jpg")));
        }
        
        
    }
    
    private void clear(){
        lblCatch.setText("");
    }
    
    private void horseRun(){
        setLayout(null);
        int elección = (int)(Math.random()*(6-1+1)+1);
            switch(elección){
                case 1:
                    lblC1.setLocation(lblC1.getX() + 6, lblC1.getY());
                    
                    lblC1.setText("O");
                    lblC1.setVisible(true);
                    c1++;
                    if (c1 == 65){
                        fin = 1;
                        clipito.stop();
                    }
                    break;
                case 2:
                    lblC2.setLocation(lblC2.getX() + 6, lblC2.getY());
                    
                    lblC2.setText("O");
                    lblC2.setVisible(true);
                    c2++;
                    if (c2 == 65){
                        fin = 2;
                        clipito.stop();
                    }
                    break;
                case 3:
                    lblC3.setLocation(lblC3.getX() + 6, lblC3.getY());
                    
                    lblC3.setText("O");
                    lblC3.setVisible(true);
                    c3++;
                    if (c3 == 65){
                        fin = 3;
                        clipito.stop();
                    }
                    break;
                case 4:
                    lblC4.setLocation(lblC4.getX() + 6, lblC4.getY());
                    
                    lblC4.setText("O");
                    lblC4.setVisible(true);
                    c4++;
                    if (c4 == 65){
                        fin = 4;
                        clipito.stop();
                    }
                    break;
                case 5:
                    lblC5.setLocation(lblC5.getX() + 6, lblC5.getY());
                    
                    lblC5.setText("O");
                    lblC5.setVisible(true);
                    c5++;
                    if (c5 == 65){
                        fin = 5;
                        clipito.stop();
                    }
                    break;
                case 6:
                    lblC6.setLocation(lblC6.getX() + 6, lblC6.getY());
                    
                    lblC6.setText("O");
                    lblC6.setVisible(true);
                    c6++;
                    if (c6 == 65){
                        fin = 6;
                        clipito.stop();
                    }
                    break;
            }
    }
    
    private void check(){
        if (fin == 1){
            
            if (cmbCompetidor.getSelectedIndex() == 0){
                ganador = "¡El ganador es Juan Táctico! ¡Usted ganó la Apuesta!";
                if(allIn){
                    puntos = puntosAll * 5;
                }else{
                    fichasGanadas = (int) (Integer.valueOf((String) cmbApuesta.getSelectedItem()) * 5);
                    puntos += fichasGanadas;
                }
                operarPuntos(puntos, obtenerPartidas());
            } else{
                ganador = "¡El ganador es Juan Táctico! Lamebtablemente, usted perdió la apuesta.";
            }
            
        } else if (fin == 2){
            
            if (cmbCompetidor.getSelectedIndex() == 1){
                ganador = "¡El ganador es Tiro al blanco! ¡Usted ganó la Apuesta!";
                
                if(allIn){
                    puntos = puntosAll * 5;
                }else{
                    fichasGanadas = (int) (Integer.valueOf((String) cmbApuesta.getSelectedItem()) * 5);
                    puntos += fichasGanadas;
                }
                operarPuntos(puntos, obtenerPartidas());
            } else{
              
                ganador = "¡El ganador es Tiro al blanco! Lamebtablemente, usted perdió la apuesta.";
                
            }
        } else if (fin == 3){
            
            if (cmbCompetidor.getSelectedIndex() == 2){
                ganador = "¡El ganador es Jerberto Jerbertoso! ¡Usted ganó la Apuesta!";
                
                if(allIn){
                    puntos = puntosAll * 5;
                }else{
                    fichasGanadas = (int) (Integer.valueOf((String) cmbApuesta.getSelectedItem()) * 5);
                    puntos += fichasGanadas;
                }
                operarPuntos(puntos, obtenerPartidas());
            } else{
                ganador = "¡El ganador es Jerberto Jerbertoso! Lamebtablemente, usted perdió la apuesta.";
                
            }
           
        } else if (fin == 4){
            
            if (cmbCompetidor.getSelectedIndex() == 3){
                ganador = "¡El ganador es John Henry! ¡Usted ganó la Apuesta!";
                
                if(allIn){
                    puntos = puntosAll * 5;
                }else{
                    fichasGanadas = (int) (Integer.valueOf((String) cmbApuesta.getSelectedItem()) * 5);
                    puntos += fichasGanadas;
                }
                operarPuntos(puntos, obtenerPartidas());
            } else{
                ganador = "¡El ganador es John Henry! Lamebtablemente, usted perdió la apuesta.";
                
            }
        } else if (fin == 5){
            
            if (cmbCompetidor.getSelectedIndex() == 4){
                ganador = "¡El ganador es El caballo blanco de San Martin! ¡Usted ganó la Apuesta!";
                
                if(allIn){
                    puntos = puntosAll * 5;
                }else{
                    fichasGanadas = (int) (Integer.valueOf((String) cmbApuesta.getSelectedItem()) * 5);
                    puntos += fichasGanadas;
                }
                operarPuntos(puntos, obtenerPartidas());
            } else{
                ganador = "¡El ganador es El caballo blanco de San Martin! Lamebtablemente, usted perdió la apuesta.";
                
            }
            btnJugar.setEnabled(true);
        } else if (fin == 6){
            
            if (cmbCompetidor.getSelectedIndex() == 5){
                ganador = "¡El ganador es R1650! ¡Usted ganó la Apuesta!";
               
                if(allIn){
                    puntos = puntosAll * 5;
                }else{
                    fichasGanadas = (int) (Integer.valueOf((String) cmbApuesta.getSelectedItem()) * 5);
                    puntos += fichasGanadas;
                }
                operarPuntos(puntos, obtenerPartidas());
            } else{
                ganador = "¡El ganador es R1650! Lamebtablemente, usted perdió la apuesta.";
                
            }
        }
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
            lblPuntitos.setText(numero + " fichas");
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
             
            return datos;
            }catch(Exception e){
                
        }
        return null;
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
        
        
        public void escribirArchivo(String dato){

            try (FileWriter escritor = new FileWriter(archivo, true)) {
                escritor.append(dato);
            }
         catch (Exception e){
            
            }
        }
        
    public void limpiarArchivo(){
        File archivo = new File("RegistroUsuarios.txt");
        try {
            FileWriter escritor = new FileWriter(archivo, false);
            escritor.write("");
            
        } catch (Exception ex) {}
        
    }
    
    public Clip reproducirAudio(String wav) throws LineUnavailableException{
        File file = new File(wav);
        AudioInputStream audioStream = null;
        try {
            audioStream = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(TragaFichas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TragaFichas.class.getName()).log(Level.SEVERE, null, ex);
        }
        Clip clip = AudioSystem.getClip();
        try {
            clip.open(audioStream);
        } catch (IOException ex) {
            Logger.getLogger(TragaFichas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clip;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbApuesta;
    private javax.swing.JComboBox<String> cmbCompetidor;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel lblC1;
    private javax.swing.JLabel lblC2;
    private javax.swing.JLabel lblC3;
    private javax.swing.JLabel lblC4;
    private javax.swing.JLabel lblC5;
    private javax.swing.JLabel lblC6;
    private javax.swing.JLabel lblCaballo1;
    private javax.swing.JLabel lblCaballo2;
    private javax.swing.JLabel lblCaballo3;
    private javax.swing.JLabel lblCaballo4;
    private javax.swing.JLabel lblCaballo5;
    private javax.swing.JLabel lblCaballo6;
    private javax.swing.JLabel lblCacallosFondo;
    private javax.swing.JLabel lblCatch;
    private javax.swing.JLabel lblNoFichas;
    private javax.swing.JLabel lblPuntitos;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
