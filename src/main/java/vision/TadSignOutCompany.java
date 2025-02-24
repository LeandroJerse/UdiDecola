/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vision;

import javax.swing.JOptionPane;


abstract public class TadSignOutCompany extends javax.swing.JInternalFrame {
    



    public TadSignOutCompany() {
        initComponents();
        jBConfirm.setEnabled(false);
        checkInstaceEverTime();
        

}
    
 abstract public void checkInstaceEverTime();
 abstract public void saveVision();
 abstract public boolean sameName();
    
    
 abstract public void check() ;
  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPnFormulario = new javax.swing.JPanel();
        jLOfficialName = new javax.swing.JLabel();
        jTOficialName = new javax.swing.JTextField();
        jLCNPJ = new javax.swing.JLabel();
        jTPublicName = new javax.swing.JTextField();
        jTCNPJ = new javax.swing.JTextField();
        jLOfficialName2 = new javax.swing.JLabel();
        jLPublicName = new javax.swing.JLabel();
        jLDataBirth = new javax.swing.JLabel();
        jTDataBirth = new javax.swing.JTextField();
        jLPassword = new javax.swing.JLabel();
        jTPassword = new javax.swing.JTextField();
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

        jLOfficialName.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLOfficialName.setForeground(new java.awt.Color(255, 255, 255));
        jLOfficialName.setText("Nome Oficial");

        jTOficialName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTOficialNameActionPerformed(evt);
            }
        });

        jLCNPJ.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLCNPJ.setForeground(new java.awt.Color(255, 255, 255));
        jLCNPJ.setText("CNPJ");

        jTPublicName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPublicNameActionPerformed(evt);
            }
        });

        jTCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCNPJActionPerformed(evt);
            }
        });

        jLOfficialName2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLOfficialName2.setForeground(new java.awt.Color(255, 255, 255));
        jLOfficialName2.setText("CNPJ");

        jLPublicName.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLPublicName.setForeground(new java.awt.Color(255, 255, 255));
        jLPublicName.setText("Nome Público");

        jLDataBirth.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLDataBirth.setForeground(new java.awt.Color(255, 255, 255));
        jLDataBirth.setText("Data de fundação (dd/MM/yyyy)");

        jTDataBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDataBirthActionPerformed(evt);
            }
        });

        jLPassword.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLPassword.setText("Password");

        javax.swing.GroupLayout jPnFormularioLayout = new javax.swing.GroupLayout(jPnFormulario);
        jPnFormulario.setLayout(jPnFormularioLayout);
        jPnFormularioLayout.setHorizontalGroup(
            jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormularioLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLOfficialName)
                        .addComponent(jTOficialName, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addComponent(jTPublicName)
                        .addComponent(jTPassword)
                        .addComponent(jLPassword))
                    .addComponent(jLPublicName))
                .addGap(50, 50, 50)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLOfficialName2)
                    .addComponent(jLCNPJ)
                    .addComponent(jLDataBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTDataBirth)
                    .addComponent(jTCNPJ))
                .addContainerGap(1283, Short.MAX_VALUE))
        );
        jPnFormularioLayout.setVerticalGroup(
            jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormularioLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLOfficialName2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLOfficialName)
                    .addComponent(jLCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTOficialName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTPublicName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnFormularioLayout.createSequentialGroup()
                        .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDataBirth)
                            .addComponent(jLPublicName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTDataBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnFormularioLayout.createSequentialGroup()
                        .addComponent(jLPassword)
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

    private void jTCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCNPJActionPerformed

    private void jTDataBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDataBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDataBirthActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmActionPerformed
        boolean ifExist= sameName();
        if(ifExist == true){
        JOptionPane.showMessageDialog(null, "Nome de usuario já existente");
        dispose();
        }
        else
        {
        saveVision();
        JOptionPane.showMessageDialog(null, "Sucesso na criação de conta\nBem vindo "+(String)jTOficialName.getText());
        dispose();
        }
    }//GEN-LAST:event_jBConfirmActionPerformed

    private void jTPublicNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPublicNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPublicNameActionPerformed

    private void jTOficialNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTOficialNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTOficialNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBConfirm;
    public javax.swing.JButton jBVoltar;
    public javax.swing.JLabel jLCNPJ;
    public javax.swing.JLabel jLDataBirth;
    public javax.swing.JLabel jLOfficialName;
    private javax.swing.JLabel jLOfficialName2;
    public javax.swing.JLabel jLPassword;
    public javax.swing.JLabel jLPublicName;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPnFormulario;
    public javax.swing.JTextField jTCNPJ;
    public javax.swing.JTextField jTDataBirth;
    public javax.swing.JTextField jTOficialName;
    public javax.swing.JTextField jTPassword;
    public javax.swing.JTextField jTPublicName;
    // End of variables declaration//GEN-END:variables
}
