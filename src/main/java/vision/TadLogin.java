/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vision;

import javax.swing.JOptionPane;


abstract public class TadLogin extends javax.swing.JInternalFrame {


    public TadLogin() {
        initComponents();
        jBConfirm.setEnabled(false);
        checkInstaceEverTime();
        

}
    
 abstract public void checkInstaceEverTime();
 abstract public Object saveVision();
 abstract public void loginVision(Object usuario);
    
    
 abstract public void check() ;
  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPnFormulario = new javax.swing.JPanel();
        jLUserLogin = new javax.swing.JLabel();
        jTUserLogin = new javax.swing.JTextField();
        jLOfficialName2 = new javax.swing.JLabel();
        jLPasswordLogin = new javax.swing.JLabel();
        jTPasswordLogin = new javax.swing.JTextField();
        jBVoltar = new javax.swing.JButton();
        jBConfirm = new javax.swing.JButton();

        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        jPnFormulario.setBackground(new java.awt.Color(0, 0, 153));

        jLUserLogin.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLUserLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLUserLogin.setText("CNPJ/CPF");

        jTUserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTUserLoginActionPerformed(evt);
            }
        });

        jLOfficialName2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLOfficialName2.setForeground(new java.awt.Color(255, 255, 255));
        jLOfficialName2.setText("CNPJ");

        jLPasswordLogin.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLPasswordLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLPasswordLogin.setText("Password");

        javax.swing.GroupLayout jPnFormularioLayout = new javax.swing.GroupLayout(jPnFormulario);
        jPnFormulario.setLayout(jPnFormularioLayout);
        jPnFormularioLayout.setHorizontalGroup(
            jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormularioLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLUserLogin)
                    .addGroup(jPnFormularioLayout.createSequentialGroup()
                        .addComponent(jLPasswordLogin)
                        .addGap(212, 212, 212)
                        .addComponent(jLOfficialName2))
                    .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTPasswordLogin)
                        .addComponent(jTUserLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)))
                .addContainerGap(1509, Short.MAX_VALUE))
        );
        jPnFormularioLayout.setVerticalGroup(
            jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormularioLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLOfficialName2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLUserLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnFormularioLayout.createSequentialGroup()
                        .addComponent(jLPasswordLogin)
                        .addGap(28, 28, 28)))
                .addContainerGap(552, Short.MAX_VALUE))
        );

        jBVoltar.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jBConfirm.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jBConfirm.setText("Confirmar");
        jBConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(986, 986, 986)
                        .addComponent(jBConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTUserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTUserLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUserLoginActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        dispose();

    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmActionPerformed
        Object usuario = saveVision();
        if(usuario == null){
        JOptionPane.showMessageDialog(null, "Usuario não encontrado");
        dispose();}
        else{
        loginVision(usuario);
        dispose();
        }
        
    }//GEN-LAST:event_jBConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBConfirm;
    public javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLOfficialName2;
    public javax.swing.JLabel jLPasswordLogin;
    public javax.swing.JLabel jLUserLogin;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPnFormulario;
    public javax.swing.JTextField jTPasswordLogin;
    public javax.swing.JTextField jTUserLogin;
    // End of variables declaration//GEN-END:variables
}
