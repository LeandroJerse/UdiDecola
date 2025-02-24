/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vision;

import javax.swing.JOptionPane;


abstract public class FlightLegForm extends javax.swing.JInternalFrame {
    



    public FlightLegForm() {
        initComponents();
        jBConfirm.setEnabled(false);
        checkInstaceEverTime();
        

}
    
 abstract public void checkInstaceEverTime();
 abstract public void saveVision();

    
    
 abstract public void check() ;
  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPnFormulario = new javax.swing.JPanel();
        jLIdentifierFlight = new javax.swing.JLabel();
        jTIdentifierFlight = new javax.swing.JTextField();
        jLDepartureTime = new javax.swing.JLabel();
        jTOrigin = new javax.swing.JTextField();
        jTDepartureTime = new javax.swing.JTextField();
        jLOfficialName2 = new javax.swing.JLabel();
        jLOrigin = new javax.swing.JLabel();
        jLArriveTime = new javax.swing.JLabel();
        jTArriveTime = new javax.swing.JTextField();
        jLDestination = new javax.swing.JLabel();
        jTDestination = new javax.swing.JTextField();
        jLFlightDate = new javax.swing.JLabel();
        jTFlightDate = new javax.swing.JTextField();
        jTAvaliableSeats = new javax.swing.JTextField();
        jLAvaliableSeats = new javax.swing.JLabel();
        jTTicketPrice = new javax.swing.JTextField();
        jLArriveTime1 = new javax.swing.JLabel();
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPnFormulario.setBackground(new java.awt.Color(0, 0, 153));

        jLIdentifierFlight.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLIdentifierFlight.setForeground(new java.awt.Color(255, 255, 255));
        jLIdentifierFlight.setText("Codigo de voô");

        jTIdentifierFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdentifierFlightActionPerformed(evt);
            }
        });

        jLDepartureTime.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLDepartureTime.setForeground(new java.awt.Color(255, 255, 255));
        jLDepartureTime.setText("Horário Saida(dd/MM/yyyy hh:mm:ss)");

        jTOrigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTOriginActionPerformed(evt);
            }
        });

        jTDepartureTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDepartureTimeActionPerformed(evt);
            }
        });

        jLOfficialName2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLOfficialName2.setForeground(new java.awt.Color(255, 255, 255));
        jLOfficialName2.setText("CNPJ");

        jLOrigin.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLOrigin.setForeground(new java.awt.Color(255, 255, 255));
        jLOrigin.setText("Origem");

        jLArriveTime.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLArriveTime.setForeground(new java.awt.Color(255, 255, 255));
        jLArriveTime.setText("Horário de chegada(dd/MM/yyyy hh:mm:ss)");

        jTArriveTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTArriveTimeActionPerformed(evt);
            }
        });

        jLDestination.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLDestination.setForeground(new java.awt.Color(255, 255, 255));
        jLDestination.setText("Destino");

        jLFlightDate.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLFlightDate.setForeground(new java.awt.Color(255, 255, 255));
        jLFlightDate.setText("Dia frequente do voô(dd/mm/yyyy)");

        jTFlightDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFlightDateActionPerformed(evt);
            }
        });

        jTAvaliableSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAvaliableSeatsActionPerformed(evt);
            }
        });

        jLAvaliableSeats.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLAvaliableSeats.setForeground(new java.awt.Color(255, 255, 255));
        jLAvaliableSeats.setText("Cadeiras disponíves");

        jTTicketPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTicketPriceActionPerformed(evt);
            }
        });

        jLArriveTime1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLArriveTime1.setForeground(new java.awt.Color(255, 255, 255));
        jLArriveTime1.setText("Valor da passagem (xxxx.xx)");

        javax.swing.GroupLayout jPnFormularioLayout = new javax.swing.GroupLayout(jPnFormulario);
        jPnFormulario.setLayout(jPnFormularioLayout);
        jPnFormularioLayout.setHorizontalGroup(
            jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormularioLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLIdentifierFlight)
                        .addComponent(jTIdentifierFlight, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addComponent(jTOrigin)
                        .addComponent(jTDestination)
                        .addComponent(jLDestination))
                    .addComponent(jLOrigin))
                .addGap(50, 50, 50)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLOfficialName2)
                        .addComponent(jLDepartureTime)
                        .addComponent(jLArriveTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTArriveTime)
                        .addComponent(jTDepartureTime))
                    .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLFlightDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFlightDate, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLAvaliableSeats)
                    .addComponent(jLArriveTime1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTTicketPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(jTAvaliableSeats))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnFormularioLayout.setVerticalGroup(
            jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormularioLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLOfficialName2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnFormularioLayout.createSequentialGroup()
                        .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLIdentifierFlight)
                            .addComponent(jLDepartureTime))
                        .addGap(18, 18, 18)
                        .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTIdentifierFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTDepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPnFormularioLayout.createSequentialGroup()
                        .addComponent(jLAvaliableSeats)
                        .addGap(18, 18, 18)
                        .addComponent(jTAvaliableSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPnFormularioLayout.createSequentialGroup()
                            .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLArriveTime)
                                .addComponent(jLOrigin))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTArriveTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPnFormularioLayout.createSequentialGroup()
                        .addComponent(jLArriveTime1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTTicketPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnFormularioLayout.createSequentialGroup()
                        .addComponent(jLDestination)
                        .addGap(28, 28, 28))
                    .addGroup(jPnFormularioLayout.createSequentialGroup()
                        .addComponent(jLFlightDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFlightDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(549, Short.MAX_VALUE))
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
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTDepartureTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDepartureTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDepartureTimeActionPerformed

    private void jTArriveTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTArriveTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTArriveTimeActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmActionPerformed

        saveVision();
        JOptionPane.showMessageDialog(null, "Sucesso na criação de Rota\nRota identificada como  "+(String)jTIdentifierFlight.getText());
        dispose();

    }//GEN-LAST:event_jBConfirmActionPerformed

    private void jTOriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTOriginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTOriginActionPerformed

    private void jTIdentifierFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdentifierFlightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdentifierFlightActionPerformed

    private void jTFlightDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFlightDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFlightDateActionPerformed

    private void jTAvaliableSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAvaliableSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAvaliableSeatsActionPerformed

    private void jTTicketPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTicketPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTicketPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBConfirm;
    public javax.swing.JButton jBVoltar;
    public javax.swing.JLabel jLArriveTime;
    public javax.swing.JLabel jLArriveTime1;
    public javax.swing.JLabel jLAvaliableSeats;
    public javax.swing.JLabel jLDepartureTime;
    public javax.swing.JLabel jLDestination;
    public javax.swing.JLabel jLFlightDate;
    public javax.swing.JLabel jLIdentifierFlight;
    private javax.swing.JLabel jLOfficialName2;
    public javax.swing.JLabel jLOrigin;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPnFormulario;
    public javax.swing.JTextField jTArriveTime;
    public javax.swing.JTextField jTAvaliableSeats;
    public javax.swing.JTextField jTDepartureTime;
    public javax.swing.JTextField jTDestination;
    public javax.swing.JTextField jTFlightDate;
    public javax.swing.JTextField jTIdentifierFlight;
    public javax.swing.JTextField jTOrigin;
    public javax.swing.JTextField jTTicketPrice;
    // End of variables declaration//GEN-END:variables
}
