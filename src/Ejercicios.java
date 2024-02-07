
import com.raven.event.EventColorChange;
import com.raven.form.Home_Form;
import com.raven.menu.EventMenu;
import com.raven.properties.SystemProperties;
import com.raven.theme.SystemTheme;
import com.raven.theme.ThemeColor;
import com.raven.theme.ThemeColorChange;
import java.awt.Color;

public class Ejercicios extends javax.swing.JFrame {

    // private Setting_Form settingForm;
    public Ejercicios() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        menu.setSelectedMenu(5);
        menu.setSelectedLocation(331);
        jScrollPane4.setVisible(false);
        EJER1.setVisible(true);EJER1.setEnabled(true);
        EJER2.setVisible(false); EJER2.setEnabled(false);
        EJER4.setVisible(false);EJER4.setEnabled(false);
        EJER5.setVisible(false);EJER5.setEnabled(false);
        init();
    }

    Ejercicios thisFrame = this;

    private void init() {
        header.initMoving(this);
        header.initEvent(this, panelBackground1);
        menu.addEventMenu(new EventMenu() {
            @Override
            public void selectedMenu(int index) {
                System.out.println("indice: " + index);
                if (index == 0) {
                    Main i = new Main();
                    i.setVisible(true);
                    thisFrame.setVisible(false);
                } else if (index == 1) {
                    Dibujo1 i = new Dibujo1();
                    i.setVisible(true);
                    thisFrame.setVisible(false);
                } else if (index == 2) {
                    Dibujo2 i = new Dibujo2();
                    i.setVisible(true);
                    thisFrame.setVisible(false);
                } else if (index == 3) {
                    Dibujo3 i = new Dibujo3();
                    i.setVisible(true);
                    thisFrame.setVisible(false);
                } else if (index == 4) {
                    Dibujo4 i = new Dibujo4();
                    i.setVisible(true);
                    thisFrame.setVisible(false);
                } else if (index == 5) {
                    //estoy aqui
                }
            }
        });

        //mainBody.displayForm(new Home_Form());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground1 = new com.raven.swing.PanelBackground();
        header = new com.raven.component.Header();
        menu = new com.raven.menu.Menu();
        PanelInfo = new javax.swing.JPanel();
        EJER5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        EJER4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        EJER2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        EJER1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        InfoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BtnEjer1 = new javax.swing.JButton();
        BtnEjer2 = new javax.swing.JButton();
        BtnEjer3 = new javax.swing.JButton();
        BtnEjer4 = new javax.swing.JButton();
        BtnEjer5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBackground1.setBackground(new java.awt.Color(34, 34, 34));

        PanelInfo.setBackground(new java.awt.Color(255, 255, 255));
        PanelInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EJER5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gifs/lucifer es simp.gif"))); // NOI18N

        javax.swing.GroupLayout EJER5Layout = new javax.swing.GroupLayout(EJER5);
        EJER5.setLayout(EJER5Layout);
        EJER5Layout.setHorizontalGroup(
            EJER5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EJER5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        EJER5Layout.setVerticalGroup(
            EJER5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EJER5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        PanelInfo.add(EJER5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 907, 599));

        EJER4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gifs/hell is forever.gif"))); // NOI18N

        javax.swing.GroupLayout EJER4Layout = new javax.swing.GroupLayout(EJER4);
        EJER4.setLayout(EJER4Layout);
        EJER4Layout.setHorizontalGroup(
            EJER4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
        );
        EJER4Layout.setVerticalGroup(
            EJER4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EJER4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 119, Short.MAX_VALUE))
        );

        PanelInfo.add(EJER4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 907, 599));

        EJER2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJERCICIO2.png"))); // NOI18N

        javax.swing.GroupLayout EJER2Layout = new javax.swing.GroupLayout(EJER2);
        EJER2.setLayout(EJER2Layout);
        EJER2Layout.setHorizontalGroup(
            EJER2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EJER2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        EJER2Layout.setVerticalGroup(
            EJER2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EJER2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1955, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PanelInfo.add(EJER2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 907, 599));

        EJER1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rushh8.png"))); // NOI18N

        javax.swing.GroupLayout EJER1Layout = new javax.swing.GroupLayout(EJER1);
        EJER1.setLayout(EJER1Layout);
        EJER1Layout.setHorizontalGroup(
            EJER1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EJER1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        EJER1Layout.setVerticalGroup(
            EJER1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EJER1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        PanelInfo.add(EJER1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 907, 599));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setOpaque(false);
        jScrollPane4.setPreferredSize(new java.awt.Dimension(1000, 1500));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1137, 1500));

        InfoLabel.setBackground(new java.awt.Color(255, 255, 255));
        InfoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gifs/Diagramas Taller 1.gif"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJERCICIO 3e.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane4.setViewportView(jPanel3);

        PanelInfo.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 907, 599));

        BtnEjer1.setBackground(new java.awt.Color(253, 250, 250));
        BtnEjer1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        BtnEjer1.setText("1");
        BtnEjer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjer1ActionPerformed(evt);
            }
        });
        PanelInfo.add(BtnEjer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 16, -1, -1));

        BtnEjer2.setBackground(new java.awt.Color(253, 250, 250));
        BtnEjer2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        BtnEjer2.setText("2");
        BtnEjer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjer2ActionPerformed(evt);
            }
        });
        PanelInfo.add(BtnEjer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 16, -1, -1));

        BtnEjer3.setBackground(new java.awt.Color(253, 250, 250));
        BtnEjer3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        BtnEjer3.setText("3");
        BtnEjer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjer3ActionPerformed(evt);
            }
        });
        PanelInfo.add(BtnEjer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 16, -1, -1));

        BtnEjer4.setBackground(new java.awt.Color(253, 250, 250));
        BtnEjer4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        BtnEjer4.setText("4");
        BtnEjer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjer4ActionPerformed(evt);
            }
        });
        PanelInfo.add(BtnEjer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 16, -1, -1));

        BtnEjer5.setBackground(new java.awt.Color(253, 250, 250));
        BtnEjer5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        BtnEjer5.setText("5");
        BtnEjer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjer5ActionPerformed(evt);
            }
        });
        PanelInfo.add(BtnEjer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 16, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        PanelInfo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 50));

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(PanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEjer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjer3ActionPerformed
        jScrollPane4.setVisible(true);jScrollPane4.setEnabled(true);jPanel3.setVisible(true);
        EJER1.setVisible(false);EJER1.setEnabled(false);
        EJER2.setVisible(false); EJER2.setEnabled(false);
        EJER4.setVisible(false);EJER4.setEnabled(false);
        EJER5.setVisible(false);EJER5.setEnabled(false);
    }//GEN-LAST:event_BtnEjer3ActionPerformed

    private void BtnEjer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjer1ActionPerformed

        EJER1.setVisible(true); EJER1.setEnabled(true); jPanel3.setVisible(false);
        EJER2.setVisible(false);EJER2.setEnabled(false);
        EJER4.setVisible(false); EJER4.setEnabled(false);
        EJER5.setVisible(false);EJER5.setEnabled(false);
        jScrollPane4.setVisible(false);
    }//GEN-LAST:event_BtnEjer1ActionPerformed

    private void BtnEjer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjer2ActionPerformed
        EJER2.setVisible(true);jPanel3.setVisible(false);
        EJER1.setVisible(false);
        EJER4.setVisible(false);
        EJER5.setVisible(false);
        jScrollPane4.setVisible(false);
    }//GEN-LAST:event_BtnEjer2ActionPerformed

    private void BtnEjer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjer4ActionPerformed
      EJER4.setVisible(true);jPanel3.setVisible(false);
      EJER2.setVisible(false);
        EJER1.setVisible(false);
        EJER5.setVisible(false);
        jScrollPane4.setVisible(false);
    }//GEN-LAST:event_BtnEjer4ActionPerformed

    private void BtnEjer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjer5ActionPerformed
       EJER5.setVisible(true);jPanel3.setVisible(false);
       EJER4.setVisible(false);
      EJER2.setVisible(false);
        EJER1.setVisible(false);
        jScrollPane4.setVisible(false);
    }//GEN-LAST:event_BtnEjer5ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEjer1;
    private javax.swing.JButton BtnEjer2;
    private javax.swing.JButton BtnEjer3;
    private javax.swing.JButton BtnEjer4;
    private javax.swing.JButton BtnEjer5;
    private javax.swing.JPanel EJER1;
    private javax.swing.JPanel EJER2;
    private javax.swing.JPanel EJER4;
    private javax.swing.JPanel EJER5;
    private javax.swing.JLabel InfoLabel;
    private javax.swing.JPanel PanelInfo;
    private com.raven.component.Header header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private com.raven.menu.Menu menu;
    private com.raven.swing.PanelBackground panelBackground1;
    // End of variables declaration//GEN-END:variables
}
