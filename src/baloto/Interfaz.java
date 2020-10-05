package baloto;

import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bola1 = new javax.swing.JTextField();
        bola2 = new javax.swing.JTextField();
        bola3 = new javax.swing.JTextField();
        bola4 = new javax.swing.JTextField();
        bola5 = new javax.swing.JTextField();
        bola6 = new javax.swing.JTextField();
        btnJugar = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        resbol1 = new javax.swing.JTextField();
        resbol2 = new javax.swing.JTextField();
        resbol3 = new javax.swing.JTextField();
        resbol4 = new javax.swing.JTextField();
        resbol5 = new javax.swing.JTextField();
        resbol6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        premio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Digita los numeros de su billete:");

        bola1.setBackground(new java.awt.Color(255, 255, 0));
        bola1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bola1ActionPerformed(evt);
            }
        });
        bola1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bola1KeyTyped(evt);
            }
        });

        bola2.setBackground(new java.awt.Color(255, 255, 0));
        bola2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bola2KeyTyped(evt);
            }
        });

        bola3.setBackground(new java.awt.Color(255, 255, 0));
        bola3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bola3KeyTyped(evt);
            }
        });

        bola4.setBackground(new java.awt.Color(255, 255, 0));
        bola4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bola4KeyTyped(evt);
            }
        });

        bola5.setBackground(new java.awt.Color(255, 255, 0));
        bola5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bola5KeyTyped(evt);
            }
        });

        bola6.setBackground(new java.awt.Color(255, 0, 0));
        bola6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bola6KeyTyped(evt);
            }
        });

        btnJugar.setBackground(new java.awt.Color(255, 51, 0));
        btnJugar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(255, 255, 0));
        btnJugar.setText("JUGAR");
        btnJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        mensaje.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bola1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnJugar))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(bola2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(bola3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bola4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(bola5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(bola6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(46, 46, 46))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bola1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bola2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bola3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bola4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bola5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bola6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnJugar)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("El número ganador es:");

        resbol1.setBackground(new java.awt.Color(255, 255, 0));
        resbol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resbol1ActionPerformed(evt);
            }
        });

        resbol2.setBackground(new java.awt.Color(255, 255, 0));
        resbol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resbol2ActionPerformed(evt);
            }
        });

        resbol3.setBackground(new java.awt.Color(255, 255, 0));
        resbol3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resbol3ActionPerformed(evt);
            }
        });

        resbol4.setBackground(new java.awt.Color(255, 255, 0));
        resbol4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resbol4ActionPerformed(evt);
            }
        });

        resbol5.setBackground(new java.awt.Color(255, 255, 0));
        resbol5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resbol5ActionPerformed(evt);
            }
        });

        resbol6.setBackground(new java.awt.Color(255, 0, 0));
        resbol6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resbol6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(resbol1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(resbol2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resbol3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(resbol4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(resbol5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(resbol6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(128, 128, 128))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resbol1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resbol2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resbol3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resbol4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resbol5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resbol6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        premio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        premio.setForeground(new java.awt.Color(255, 255, 51));
        premio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Resultado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(premio, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(premio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baloto/descarga.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    //Este es el metodo que se ejecuta cuando se presiona el boton jugar
    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        //Clase random para numeros aleatorios
        Random Num_ganador = new Random();
        
     
        int[] numero_usuario = new int[6];
        
        //Vector que guarda los 6 numeros aleatorios que definiran el numero ganador
        int[] Numeroganador = new int[6];
        
        //Variable que guarda el dinero que se le otorga al ganador
        double granPremio=300000000;
        
        //Variable del premio si acierta en 3 numeeros
        double pago1 = granPremio * 0.3;
        
        //Variable del premio si acierta en 5 numeeros
        double pago2 = granPremio * 0.6;
        
        //Creando numeros random
        Numeroganador[0]= Num_ganador.nextInt(99);
        Numeroganador[1]= Num_ganador.nextInt(99);
        Numeroganador[2]= Num_ganador.nextInt(99);
        Numeroganador[3]= Num_ganador.nextInt(99);
        Numeroganador[4]= Num_ganador.nextInt(99);
        Numeroganador[5]= Num_ganador.nextInt(99);
        
        //Probando numeros random
        System.out.println(""+Numeroganador[3]);
        System.out.println(""+Numeroganador[4]);
        System.out.println(""+Numeroganador[5]);
        
        
        //Creando numeros random
        //Vector donde se almacenan los 6 numero que elige el usuario
        numero_usuario[0] = Integer.parseInt(bola1.getText());
        numero_usuario[1] = Integer.parseInt(bola2.getText());
        numero_usuario[2] = Integer.parseInt(bola3.getText());
        numero_usuario[3] = Integer.parseInt(bola4.getText());
        numero_usuario[4] = Integer.parseInt(bola5.getText());
        numero_usuario[5] = Integer.parseInt(bola6.getText());

        
        //Codigo que imprime en la interfaz los numeros que salieron en el sorteo
        resbol1.setText(Numeroganador[0] + "");
        resbol2.setText(Numeroganador[1] + "");
        resbol3.setText(Numeroganador[2] + "");
        resbol4.setText(Numeroganador[3] + "");
        resbol5.setText(Numeroganador[4] + "");
        resbol6.setText(Numeroganador[5] + "");
        
        //Validando campos vacios
        if (bola1.equals("") || bola2.equals("") || bola3.equals("") || bola4.equals("") || bola5.equals("") || bola6.equals("")){
            JOptionPane.showMessageDialog(null,"Rellene todos los campos");
        }
        
        //Hacemos las condiciones  a los numeros que ingresa el usuario
        if (numero_usuario[0] >= 0 && numero_usuario[0] <= 99 && numero_usuario[1] >= 0 && numero_usuario[1] <= 99 && numero_usuario[2] >= 0 && numero_usuario[2] <= 99 && numero_usuario[3] >= 0 && numero_usuario[3] <= 99 && numero_usuario[4] >= 0 && numero_usuario[4] <= 99 && numero_usuario[5] >= 0 && numero_usuario[5] <= 99) {
            
            if (numero_usuario[0] == Numeroganador[0] && numero_usuario[1] == Numeroganador[1] && numero_usuario[2] == Numeroganador[2] && numero_usuario[3] == Numeroganador[3] && numero_usuario[4] == Numeroganador[4] && numero_usuario[5] == Numeroganador[5]) {
                premio.setText("Felicidades, usted ganó: $"+granPremio); 
            }else if (numero_usuario[0] == Numeroganador[0] && numero_usuario[1] == Numeroganador[1] && numero_usuario[2] == Numeroganador[2]){
                premio.setText("Felicidades, usted ganó: $"+pago1);
                premio.setText("Acertó en 3 numeros");
            }else if(numero_usuario[0] == Numeroganador[0] && numero_usuario[1] == Numeroganador[1] && numero_usuario[2] == Numeroganador[2] && numero_usuario[3] == Numeroganador[3] && numero_usuario[4] == Numeroganador[4]){
                premio.setText("Felicidades, usted ganó: $"+pago2);
                premio.setText("Acertó en 5 numeros");
            } else {
                premio.setText("No recibio ningun premio, siga intentando");
            }
        } else {
            mensaje.setText("ERROR, DIGITE UN NUMERO ENTRE LOS RANGOS 0-99");
        }
    }//GEN-LAST:event_btnJugarActionPerformed

    //Los siguientes metodos son aquellos que se crean por defecto 
    private void resbol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resbol1ActionPerformed
        resbol1.getText();
    }//GEN-LAST:event_resbol1ActionPerformed

    private void resbol4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resbol4ActionPerformed
        resbol4.getText();
    }//GEN-LAST:event_resbol4ActionPerformed

    private void resbol2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resbol2ActionPerformed
        resbol2.getText();
    }//GEN-LAST:event_resbol2ActionPerformed

    private void resbol3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resbol3ActionPerformed
        resbol3.getText();
    }//GEN-LAST:event_resbol3ActionPerformed

    private void resbol5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resbol5ActionPerformed
        resbol5.getText();
    }//GEN-LAST:event_resbol5ActionPerformed

    private void resbol6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resbol6ActionPerformed
        resbol6.getText();
    }//GEN-LAST:event_resbol6ActionPerformed

    private void bola1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bola1ActionPerformed

    }//GEN-LAST:event_bola1ActionPerformed

    private void bola1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bola1KeyTyped
        char tecla = evt.getKeyChar();
        JTextField campo = (JTextField) evt.getSource();

        if (!Character.isDigit(tecla)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_bola1KeyTyped

    private void bola2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bola2KeyTyped
        char tecla = evt.getKeyChar();
        JTextField campo = (JTextField) evt.getSource();

        if (!Character.isDigit(tecla)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_bola2KeyTyped

    private void bola3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bola3KeyTyped
        char tecla = evt.getKeyChar();
        JTextField campo = (JTextField) evt.getSource();

        if (!Character.isDigit(tecla)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_bola3KeyTyped

    private void bola4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bola4KeyTyped
        char tecla = evt.getKeyChar();
        JTextField campo = (JTextField) evt.getSource();

        if (!Character.isDigit(tecla)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_bola4KeyTyped

    private void bola5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bola5KeyTyped
        char tecla = evt.getKeyChar();
        JTextField campo = (JTextField) evt.getSource();

        if (!Character.isDigit(tecla)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_bola5KeyTyped

    private void bola6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bola6KeyTyped
        char tecla = evt.getKeyChar();
        JTextField campo = (JTextField) evt.getSource();

        if (!Character.isDigit(tecla)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_bola6KeyTyped

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bola1;
    private javax.swing.JTextField bola2;
    private javax.swing.JTextField bola3;
    private javax.swing.JTextField bola4;
    private javax.swing.JTextField bola5;
    private javax.swing.JTextField bola6;
    private javax.swing.JButton btnJugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel premio;
    private javax.swing.JTextField resbol1;
    private javax.swing.JTextField resbol2;
    private javax.swing.JTextField resbol3;
    private javax.swing.JTextField resbol4;
    private javax.swing.JTextField resbol5;
    private javax.swing.JTextField resbol6;
    // End of variables declaration//GEN-END:variables
}
