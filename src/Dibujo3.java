
import com.raven.event.EventColorChange;
import com.raven.form.Home_Form;
import com.raven.menu.EventMenu;
import com.raven.properties.SystemProperties;
import com.raven.theme.SystemTheme;
import com.raven.theme.ThemeColor;
import com.raven.theme.ThemeColorChange;
import java.awt.Color;

public class Dibujo3 extends javax.swing.JFrame {

    // private Setting_Form settingForm;
    public Dibujo3() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        menu.setSelectedMenu(3);
        menu.setSelectedLocation(259);
        init();
    }

    Dibujo3 thisFrame = this;

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
                    //aqui estoy
                } else if (index == 4) {
                    Dibujo4 i = new Dibujo4();
                    i.setVisible(true);
                    thisFrame.setVisible(false);
                } else if (index == 5) {
                     Ejercicios i = new Ejercicios();
                    i.setVisible(true);
                    thisFrame.setVisible(false); 

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBackground1.setBackground(new java.awt.Color(34, 34, 34));

        PanelInfo.setBackground(new java.awt.Color(255, 255, 255));
        PanelInfo.setPreferredSize(new java.awt.Dimension(979, 557));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gifs/polarizacion gif.gif"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tekton Pro Cond", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(76, 154, 198));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Polarización en un átomo aislante");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono de video.png"))); // NOI18N

        javax.swing.GroupLayout PanelInfoLayout = new javax.swing.GroupLayout(PanelInfo);
        PanelInfo.setLayout(PanelInfoLayout);
        PanelInfoLayout.setHorizontalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
        );
        PanelInfoLayout.setVerticalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE))
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(PanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)))
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
    private javax.swing.JPanel PanelInfo;
    private com.raven.component.Header header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.raven.menu.Menu menu;
    private com.raven.swing.PanelBackground panelBackground1;
    // End of variables declaration//GEN-END:variables
}
