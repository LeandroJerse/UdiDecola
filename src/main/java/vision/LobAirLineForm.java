
package vision;

import accounts.AccountAirline;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public abstract class LobAirLineForm extends javax.swing.JFrame {
    public LobAirLineForm() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public LobAirLineForm(AccountAirline airline) {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    abstract public AccountAirline getAirline();
    abstract public String initializateFlightLeg();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMInformations = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMMyFlughtLeg = new javax.swing.JMenu();
        jMiNewFlightLeg = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMExit = new javax.swing.JMenu();
        jMExitToMenu = new javax.swing.JMenuItem();

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

        jMInformations.setText("Informações");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMInformations.add(jMenuItem1);

        jMenuBar1.add(jMInformations);

        jMMyFlughtLeg.setText("Rotas");

        jMiNewFlightLeg.setText("Nova Rota");
        jMiNewFlightLeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiNewFlightLegActionPerformed(evt);
            }
        });
        jMMyFlughtLeg.add(jMiNewFlightLeg);

        jMenuItem2.setText("Minhas Rotas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMMyFlughtLeg.add(jMenuItem2);

        jMenuBar1.add(jMMyFlughtLeg);

        jMExit.setText("Sair");
        jMExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMExitActionPerformed(evt);
            }
        });

        jMExitToMenu.setText("Menu Principal");
        jMExitToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMExitToMenuActionPerformed(evt);
            }
        });
        jMExit.add(jMExitToMenu);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    AccountAirline client = getAirline();
    JOptionPane.showMessageDialog(null, "Nome: "+ client.getOfficialName()+"\nCPF: "+client.getCNPJ());    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMiNewFlightLegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiNewFlightLegActionPerformed
        FlightLeg tela = new FlightLeg(getAirline());
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMiNewFlightLegActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        LobShowFlightLeg tela = new LobShowFlightLeg(getAirline());
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMExitActionPerformed
    }//GEN-LAST:event_jMExitActionPerformed

    private void jMExitToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMExitToMenuActionPerformed
        
        
        dispose();
        MenuPrincipal tela = new MenuPrincipal();
        jDesktop.add(tela);
        tela.setVisible(true);      
        
    }//GEN-LAST:event_jMExitToMenuActionPerformed

    public void jMMyFlightLegsActionPerformed(javax.swing.event.PopupMenuEvent e) {
        JOptionPane.showMessageDialog(null, ""+initializateFlightLeg());
    }

    
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenu jMExit;
    private javax.swing.JMenuItem jMExitToMenu;
    private javax.swing.JMenu jMInformations;
    private javax.swing.JMenu jMMyFlughtLeg;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMiNewFlightLeg;
    // End of variables declaration//GEN-END:variables
}
