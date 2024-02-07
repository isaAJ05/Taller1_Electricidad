

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
        init();
    }

   Ejercicios thisFrame = this;

    private void init() {
        header.initMoving(this);
        header.initEvent(this, panelBackground1);
        menu.addEventMenu(new EventMenu() {
            @Override
            public void selectedMenu(int index) {
                System.out.println("indice: "+index);
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
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        InfoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBackground1.setBackground(new java.awt.Color(34, 34, 34));

        PanelInfo.setBackground(new java.awt.Color(255, 255, 255));
        PanelInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addGap(23, 23, 23))
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

        jButton1.setText("1");
        PanelInfo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 16, -1, -1));

        jButton2.setText("2");
        PanelInfo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 16, -1, -1));

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PanelInfo.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 16, -1, -1));

        jButton4.setText("4");
        PanelInfo.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 16, -1, -1));

        jButton5.setText("5");
        PanelInfo.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 16, -1, -1));

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jScrollPane4.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JLabel InfoLabel;
    private javax.swing.JPanel PanelInfo;
    private com.raven.component.Header header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private com.raven.menu.Menu menu;
    private com.raven.swing.PanelBackground panelBackground1;
    // End of variables declaration//GEN-END:variables
}
