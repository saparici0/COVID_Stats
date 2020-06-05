//+------------------------------------------------------------------+
//|                                                    Registro.java |
//|                    2020-1S, COVID-19 Estadísticas Software Corp. |
//|                            Andrés Jiménez anjimenezp@unal.edu.co |
//|            Jhon Sebastián Rojas Rodríguez jhsrojasro@unal.edu.co |
//|               Juan Andrés Gonzalez Arias jgonzalezar@unal.edu.co |
//|                 Juan David Bello Rodrıguez jdbelloro@unal.edu.co |
//|                   Simon Aparicio Bocanegra saparicio@unal.edu.co |
//+------------------------------------------------------------------+
package Frontera;

import Control.Control_RegistroAdmin;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class RegistroAdmin extends javax.swing.JFrame {
    private Control_RegistroAdmin control = new Control_RegistroAdmin();
//+------------------------------------------------------------------+
//| Constructor                                                      |
//+------------------------------------------------------------------+
// Para mover ventana
    int mousePressX;
    int mousePressY;

    public RegistroAdmin() {
        initComponents();
        setBackground(new Color(0,0,0,0));        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        prev = new javax.swing.JLabel();
        barra_superior = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuarioTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        correoTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        contraseniaTextField = new javax.swing.JPasswordField();
        terminosRadioButton = new javax.swing.JRadioButton();
        registrarButton = new javax.swing.JButton();
        confirmarContraseniaTextField = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        errorLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/prev.png"))); // NOI18N
        prev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prevMouseClicked(evt);
            }
        });
        jPanel1.add(prev, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        barra_superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_superiorMouseDragged(evt);
            }
        });
        barra_superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_superiorMousePressed(evt);
            }
        });
        jPanel1.add(barra_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 40));

        jPanel2.setBackground(new java.awt.Color(40, 101, 114));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estadísticas COVID-19");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa tus datos");

        usuarioTextField.setBackground(new java.awt.Color(40, 101, 114));
        usuarioTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usuarioTextField.setForeground(new java.awt.Color(255, 255, 255));
        usuarioTextField.setBorder(null);
        usuarioTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        usuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo");

        correoTextField.setBackground(new java.awt.Color(40, 101, 114));
        correoTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        correoTextField.setForeground(new java.awt.Color(255, 255, 255));
        correoTextField.setBorder(null);
        correoTextField.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña");

        contraseniaTextField.setBackground(new java.awt.Color(40, 101, 114));
        contraseniaTextField.setForeground(new java.awt.Color(255, 255, 255));
        contraseniaTextField.setBorder(null);
        contraseniaTextField.setCaretColor(new java.awt.Color(255, 255, 255));

        terminosRadioButton.setBackground(new java.awt.Color(40, 101, 114));
        terminosRadioButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        terminosRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        terminosRadioButton.setText("Acepto términos y condiciones");
        terminosRadioButton.setBorder(null);

        registrarButton.setBackground(new java.awt.Color(140, 202, 100));
        registrarButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registrarButton.setForeground(new java.awt.Color(255, 255, 255));
        registrarButton.setText("Registrarme");
        registrarButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        registrarButton.setContentAreaFilled(false);
        registrarButton.setFocusPainted(false);
        registrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarButtonMouseClicked(evt);
            }
        });
        registrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarButtonActionPerformed(evt);
            }
        });

        confirmarContraseniaTextField.setBackground(new java.awt.Color(40, 101, 114));
        confirmarContraseniaTextField.setForeground(new java.awt.Color(255, 255, 255));
        confirmarContraseniaTextField.setBorder(null);
        confirmarContraseniaTextField.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirmar contraseña");

        errorLabel.setBackground(new java.awt.Color(255, 255, 255));
        errorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 36, 47));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(errorLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator4)
                                .addComponent(jLabel7)
                                .addComponent(confirmarContraseniaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(registrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(terminosRadioButton)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator3)
                                .addComponent(correoTextField)
                                .addComponent(jSeparator2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(usuarioTextField)
                                .addComponent(jSeparator1)
                                .addComponent(contraseniaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addContainerGap(94, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(contraseniaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(confirmarContraseniaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(terminosRadioButton)
                .addGap(18, 18, 18)
                .addComponent(registrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 510));

        jPanel3.setBackground(new java.awt.Color(243, 243, 243));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Logo_Fondo_Gris.png"))); // NOI18N

        exit.setBackground(new java.awt.Color(40, 101, 114));
        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(40, 101, 114));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("x");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel6)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(jLabel6)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 510, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarButtonActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void barra_superiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superiorMouseDragged
        int coordenadasX = evt.getXOnScreen();
        int coordenadasY = evt.getYOnScreen();
        this.setLocation(coordenadasX-mousePressX, coordenadasY-mousePressY);
    }//GEN-LAST:event_barra_superiorMouseDragged

    private void barra_superiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superiorMousePressed
        mousePressX = evt.getX();
        mousePressY = evt.getY();
    }//GEN-LAST:event_barra_superiorMousePressed

    private void prevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prevMouseClicked
        new Login().setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_prevMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void usuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextFieldActionPerformed
         
    // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTextFieldActionPerformed

    private void registrarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarButtonMouseClicked
       if(!terminosRadioButton.isSelected()){
            errorLabel.setText("Debe aceptar los términos y condiciones");
            //JOptionPane.showMessageDialog(this, "Debe aceptar los términos y condiciones","Terminos y condiciones",2);
        }else{
            int registrar = control.registrarAdmin(usuarioTextField.getText(), correoTextField.getText(), contraseniaTextField.getText(), confirmarContraseniaTextField.getText());
            switch (registrar){
                case 0:
                    errorLabel.setText("Registro exitoso");
                    errorLabel.setForeground(Color.green);
                    new Login().setVisible(true); 
                    this.dispose();
                    break;
                case -1:
                    errorLabel.setText("El usuario ingresado ya existe");
                    break;
                case -2:
                    errorLabel.setText("La longitud de usuario debe estar entre 7 y 15 caracteres");
                    break;
                case -3:
                    errorLabel.setText("La longitud del correo debe estar entre 8 y 30 caracteres");
                    break;
                case -4:
                    errorLabel.setText("El correo ingresado no cumple con el formato");
                    break;
                case -5:
                    errorLabel.setText("La longitud de contraseña debe estar entre 8 y 20 caracteres");
                    break;
                case -6:
                    errorLabel.setText("La contraseña ingresada no cumple con el formato");
                    break;
                case -7:
                    errorLabel.setText("Las contraseñas deben coincidir");
                    break;
                case -8:
                    errorLabel.setText("Debe llenar todos los campos");
                    break;
            }
        }
    }//GEN-LAST:event_registrarButtonMouseClicked

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barra_superior;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField confirmarContraseniaTextField;
    private javax.swing.JPasswordField contraseniaTextField;
    private javax.swing.JTextField correoTextField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel prev;
    private javax.swing.JButton registrarButton;
    private javax.swing.JRadioButton terminosRadioButton;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables
}
