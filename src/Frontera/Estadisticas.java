/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.Actualizacion;
import Control.Control_Estadisticas;
import java.awt.Color;

/**
 *
 * @author Juan Andres Gonzalez
 */
public class Estadisticas extends javax.swing.JFrame {
    private Control_Estadisticas control = new Control_Estadisticas();
    
    int mousePressX;
    int mousePressY;
    
    /**
     * Creates new form Estadisticas
     */
    public Estadisticas() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        principal = new javax.swing.JPanel();
        prev = new javax.swing.JLabel();
        barra_superior = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        mas_visitas = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        mas_crec = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        menos_crec = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        centro = new javax.swing.JPanel();
        actualizarDB = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        actualizarHoy = new javax.swing.JButton();
        ActualizandoLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);

        principal.setMinimumSize(new java.awt.Dimension(920, 510));
        principal.setPreferredSize(new java.awt.Dimension(1000, 600));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/prev.png"))); // NOI18N
        prev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prevMouseClicked(evt);
            }
        });
        principal.add(prev, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
        principal.add(barra_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Logo_25x25.png"))); // NOI18N
        principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 550, -1, 43));

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        mas_visitas.setBackground(new java.awt.Color(40, 101, 114));
        mas_visitas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mas_visitas.setForeground(new java.awt.Color(40, 101, 114));
        mas_visitas.setPreferredSize(new java.awt.Dimension(249, 479));
        mas_visitas.setLayout(new java.awt.GridBagLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("<html>Departamentos más<br>seleccionadas</html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        mas_visitas.add(jLabel16, gridBagConstraints);

        jSeparator1.setBackground(new java.awt.Color(61, 61, 61));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        mas_visitas.add(jSeparator1, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(control.masBuscados()[0]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        mas_visitas.add(jLabel6, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(control.masBuscados()[1]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        mas_visitas.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(control.masBuscados()[2]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        mas_visitas.add(jLabel12, gridBagConstraints);

        jSeparator2.setBackground(new java.awt.Color(61, 61, 61));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        mas_visitas.add(jSeparator2, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("<html>Localidades más<br>seleccionadas</html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        mas_visitas.add(jLabel9, gridBagConstraints);

        jSeparator3.setBackground(new java.awt.Color(61, 61, 61));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        mas_visitas.add(jSeparator3, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(control.masBuscados()[3]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        mas_visitas.add(jLabel13, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(control.masBuscados()[4]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        mas_visitas.add(jLabel14, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(control.masBuscados()[5]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        mas_visitas.add(jLabel15, gridBagConstraints);

        jSeparator4.setBackground(new java.awt.Color(61, 61, 61));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        mas_visitas.add(jSeparator4, gridBagConstraints);

        jPanel8.add(mas_visitas);

        mas_crec.setBackground(new java.awt.Color(40, 101, 114));
        mas_crec.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mas_crec.setForeground(new java.awt.Color(40, 101, 114));
        mas_crec.setPreferredSize(new java.awt.Dimension(249, 479));
        mas_crec.setLayout(new java.awt.GridBagLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("<html>Departamentos con mayor<br>crecimiento</html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        mas_crec.add(jLabel17, gridBagConstraints);

        jSeparator5.setBackground(new java.awt.Color(61, 61, 61));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        mas_crec.add(jSeparator5, gridBagConstraints);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(control.crecimiento()[0]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        mas_crec.add(jLabel18, gridBagConstraints);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(control.crecimiento()[1]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        mas_crec.add(jLabel19, gridBagConstraints);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(control.crecimiento()[2]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        mas_crec.add(jLabel20, gridBagConstraints);

        jSeparator6.setBackground(new java.awt.Color(61, 61, 61));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        mas_crec.add(jSeparator6, gridBagConstraints);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("<html>Localidades con mayor<br>crecimiento</html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        mas_crec.add(jLabel21, gridBagConstraints);

        jSeparator7.setBackground(new java.awt.Color(61, 61, 61));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        mas_crec.add(jSeparator7, gridBagConstraints);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(control.crecimiento()[6]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        mas_crec.add(jLabel22, gridBagConstraints);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(control.crecimiento()[7]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        mas_crec.add(jLabel23, gridBagConstraints);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText(control.crecimiento()[8]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        mas_crec.add(jLabel24, gridBagConstraints);

        jSeparator8.setBackground(new java.awt.Color(61, 61, 61));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator8.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        mas_crec.add(jSeparator8, gridBagConstraints);

        jPanel8.add(mas_crec);

        menos_crec.setBackground(new java.awt.Color(40, 101, 114));
        menos_crec.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menos_crec.setForeground(new java.awt.Color(40, 101, 114));
        menos_crec.setPreferredSize(new java.awt.Dimension(249, 479));
        menos_crec.setLayout(new java.awt.GridBagLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("<html>Departamentos con menor<br>crecimiento</html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        menos_crec.add(jLabel25, gridBagConstraints);

        jSeparator9.setBackground(new java.awt.Color(61, 61, 61));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator9.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        menos_crec.add(jSeparator9, gridBagConstraints);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText(control.crecimiento()[3]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        menos_crec.add(jLabel26, gridBagConstraints);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText(control.crecimiento()[4]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        menos_crec.add(jLabel27, gridBagConstraints);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText(control.crecimiento()[5]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        menos_crec.add(jLabel28, gridBagConstraints);

        jSeparator10.setBackground(new java.awt.Color(61, 61, 61));
        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator10.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        menos_crec.add(jSeparator10, gridBagConstraints);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("<html>Localidades con menor<br>crecimiento</html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        menos_crec.add(jLabel29, gridBagConstraints);

        jSeparator11.setBackground(new java.awt.Color(61, 61, 61));
        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator11.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        menos_crec.add(jSeparator11, gridBagConstraints);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText(control.crecimiento()[9]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        menos_crec.add(jLabel30, gridBagConstraints);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText(control.crecimiento()[10]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        menos_crec.add(jLabel31, gridBagConstraints);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText(control.crecimiento()[11]);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 0);
        menos_crec.add(jLabel32, gridBagConstraints);

        jSeparator12.setBackground(new java.awt.Color(61, 61, 61));
        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator12.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        menos_crec.add(jSeparator12, gridBagConstraints);

        jPanel8.add(menos_crec);

        principal.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 129, 960, 450));

        centro.setBackground(new java.awt.Color(40, 101, 114));
        centro.setForeground(new java.awt.Color(40, 101, 114));
        centro.setMinimumSize(new java.awt.Dimension(920, 510));
        centro.setPreferredSize(new java.awt.Dimension(1000, 600));

        actualizarDB.setBackground(new java.awt.Color(140, 202, 100));
        actualizarDB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actualizarDB.setForeground(new java.awt.Color(255, 255, 255));
        actualizarDB.setText("Actualizar INS y BOG");
        actualizarDB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        actualizarDB.setContentAreaFilled(false);
        actualizarDB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarDBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizarDBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizarDBMouseExited(evt);
            }
        });
        actualizarDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarDBActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Estadisticas de uso de la aplicación");

        exit.setBackground(new java.awt.Color(40, 101, 114));
        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("x");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuarios registrados:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(Integer.toString(control.contarUsuarios()));

        actualizarHoy.setBackground(new java.awt.Color(140, 202, 100));
        actualizarHoy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actualizarHoy.setForeground(new java.awt.Color(255, 255, 255));
        actualizarHoy.setText("Actualizar hoy y ayer");
        actualizarHoy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        actualizarHoy.setContentAreaFilled(false);
        actualizarHoy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarHoyMouseClicked(evt);
            }
        });
        actualizarHoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarHoyActionPerformed(evt);
            }
        });

        ActualizandoLabel.setBackground(new java.awt.Color(255, 255, 255));
        ActualizandoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ActualizandoLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout centroLayout = new javax.swing.GroupLayout(centro);
        centro.setLayout(centroLayout);
        centroLayout.setHorizontalGroup(
            centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centroLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(actualizarDB, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(actualizarHoy, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ActualizandoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centroLayout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(236, 236, 236)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        centroLayout.setVerticalGroup(
            centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centroLayout.createSequentialGroup()
                .addGroup(centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizarDB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(actualizarHoy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActualizandoLabel))
                .addContainerGap(495, Short.MAX_VALUE))
        );

        principal.add(centro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1000, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarDBActionPerformed

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

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void actualizarDBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarDBMouseClicked
        control.actualizarBD();
        ActualizandoLabel.setForeground(Color.green);
        ActualizandoLabel.setText("Actualizado con exito");
    }//GEN-LAST:event_actualizarDBMouseClicked

    private void actualizarHoyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarHoyMouseClicked
        control.ayerHoy();
        ActualizandoLabel.setForeground(Color.green);
        ActualizandoLabel.setText("Actualizado con exito");
    }//GEN-LAST:event_actualizarHoyMouseClicked

    private void actualizarHoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarHoyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarHoyActionPerformed

    private void actualizarDBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarDBMouseEntered
        actualizarDB.setBackground(new java.awt.Color(15,50,70));
    }//GEN-LAST:event_actualizarDBMouseEntered

    private void actualizarDBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarDBMouseExited
        actualizarDB.setBackground(new java.awt.Color(140,202,100));
    }//GEN-LAST:event_actualizarDBMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }  
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActualizandoLabel;
    private javax.swing.JButton actualizarDB;
    private javax.swing.JButton actualizarHoy;
    private javax.swing.JLabel barra_superior;
    private javax.swing.JPanel centro;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel mas_crec;
    private javax.swing.JPanel mas_visitas;
    private javax.swing.JPanel menos_crec;
    private javax.swing.JLabel prev;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}
