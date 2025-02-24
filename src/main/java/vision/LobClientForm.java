
package vision;

import accounts.ClientAccount;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public abstract class LobClientForm extends javax.swing.JFrame {


    public LobClientForm() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public LobClientForm(ClientAccount client) {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
     abstract public ClientAccount getClient();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMInformationUser = new javax.swing.JMenu();
        jMiInfoUser = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMFlightLeg = new javax.swing.JMenu();
        jMTickets = new javax.swing.JMenuItem();
        jMExit = new javax.swing.JMenu();
        jMiExitToMenu = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        jMInformationUser.setText("Informações");
        jMInformationUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInformationUserActionPerformed(evt);
            }
        });

        jMiInfoUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMiInfoUser.setText("Usuario");
        jMiInfoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiInfoUserActionPerformed(evt);
            }
        });
        jMInformationUser.add(jMiInfoUser);

        jMenuBar1.add(jMInformationUser);

        jMenu2.setText("Hoteis");
        jMenuBar1.add(jMenu2);

        jMFlightLeg.setText("Passagens aéreas");

        jMTickets.setText("Passagens");
        jMTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMTicketsActionPerformed(evt);
            }
        });
        jMFlightLeg.add(jMTickets);

        jMenuBar1.add(jMFlightLeg);

        jMExit.setText("Sair");

        jMiExitToMenu.setText("Menu Principal");
        jMiExitToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiExitToMenuActionPerformed(evt);
            }
        });
        jMExit.add(jMiExitToMenu);

        jMenuBar1.add(jMExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMInformationUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInformationUserActionPerformed

       
               
    }//GEN-LAST:event_jMInformationUserActionPerformed

    private void jMiInfoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiInfoUserActionPerformed
    ClientAccount client = getClient();
    JOptionPane.showMessageDialog(null, "Nome: "+ client.getFullName()+"\nEndereço: "+client.getFullAdress()+"\nCPF: "+client.getCPF());
    }//GEN-LAST:event_jMiInfoUserActionPerformed

    private void jMiExitToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiExitToMenuActionPerformed
        dispose();
        MenuPrincipal tela = new MenuPrincipal();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMiExitToMenuActionPerformed

    private void jMTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMTicketsActionPerformed
        LobShowFlightLegToClient tela = new LobShowFlightLegToClient();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMTicketsActionPerformed

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
            java.util.logging.Logger.getLogger(LobClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LobClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LobClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LobClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenu jMExit;
    private javax.swing.JMenu jMFlightLeg;
    private javax.swing.JMenu jMInformationUser;
    private javax.swing.JMenuItem jMTickets;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMiExitToMenu;
    private javax.swing.JMenuItem jMiInfoUser;
    // End of variables declaration//GEN-END:variables
}
