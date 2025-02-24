/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vision;

import javax.swing.JOptionPane;


abstract public class TadSignOutClient extends javax.swing.JInternalFrame {


    public TadSignOutClient() {
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
        jLFullName = new javax.swing.JLabel();
        jTFullName = new javax.swing.JTextField();
        jLCPF = new javax.swing.JLabel();
        jTAdress = new javax.swing.JTextField();
        jTCPF = new javax.swing.JTextField();
        jLOfficialName2 = new javax.swing.JLabel();
        jLAdress = new javax.swing.JLabel();
        jLBirthday = new javax.swing.JLabel();
        jTBirthday = new javax.swing.JTextField();
        jLClientPassword = new javax.swing.JLabel();
        jTClientPassword = new javax.swing.JTextField();
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

        jLFullName.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLFullName.setForeground(new java.awt.Color(255, 255, 255));
        jLFullName.setText("Nome Completo");

        jTFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFullNameActionPerformed(evt);
            }
        });

        jLCPF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLCPF.setForeground(new java.awt.Color(255, 255, 255));
        jLCPF.setText("CPF");

        jTAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAdressActionPerformed(evt);
            }
        });

        jTCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCPFActionPerformed(evt);
            }
        });

        jLOfficialName2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLOfficialName2.setForeground(new java.awt.Color(255, 255, 255));
        jLOfficialName2.setText("CNPJ");

        jLAdress.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLAdress.setForeground(new java.awt.Color(255, 255, 255));
        jLAdress.setText("Endereço");

        jLBirthday.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLBirthday.setForeground(new java.awt.Color(255, 255, 255));
        jLBirthday.setText("Data de nascimento (dd/MM/yyyy)");

        jTBirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBirthdayActionPerformed(evt);
            }
        });

        jLClientPassword.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLClientPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLClientPassword.setText("Password");

        jTClientPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTClientPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnFormularioLayout = new javax.swing.GroupLayout(jPnFormulario);
        jPnFormulario.setLayout(jPnFormularioLayout);
        jPnFormularioLayout.setHorizontalGroup(
            jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormularioLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLFullName)
                        .addComponent(jTFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addComponent(jTAdress)
                        .addComponent(jTClientPassword)
                        .addComponent(jLClientPassword))
                    .addComponent(jLAdress))
                .addGap(50, 50, 50)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLOfficialName2)
                    .addComponent(jLCPF)
                    .addComponent(jLBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTBirthday)
                    .addComponent(jTCPF))
                .addContainerGap(1261, Short.MAX_VALUE))
        );
        jPnFormularioLayout.setVerticalGroup(
            jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormularioLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLOfficialName2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFullName)
                    .addComponent(jLCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnFormularioLayout.createSequentialGroup()
                        .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLBirthday)
                            .addComponent(jLAdress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTClientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnFormularioLayout.createSequentialGroup()
                        .addComponent(jLClientPassword)
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

    private void jTCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCPFActionPerformed

    private void jTBirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBirthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBirthdayActionPerformed

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
        JOptionPane.showMessageDialog(null, "Sucesso na criação de conta\nBem vindo "+(String)jTFullName.getText());
        dispose();
        }

    }//GEN-LAST:event_jBConfirmActionPerformed

    private void jTAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAdressActionPerformed

    private void jTFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFullNameActionPerformed

    private void jTClientPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTClientPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClientPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBConfirm;
    public javax.swing.JButton jBVoltar;
    public javax.swing.JLabel jLAdress;
    public javax.swing.JLabel jLBirthday;
    public javax.swing.JLabel jLCPF;
    public javax.swing.JLabel jLClientPassword;
    public javax.swing.JLabel jLFullName;
    private javax.swing.JLabel jLOfficialName2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPnFormulario;
    public javax.swing.JTextField jTAdress;
    public javax.swing.JTextField jTBirthday;
    public javax.swing.JTextField jTCPF;
    public javax.swing.JTextField jTClientPassword;
    public javax.swing.JTextField jTFullName;
    // End of variables declaration//GEN-END:variables
}
