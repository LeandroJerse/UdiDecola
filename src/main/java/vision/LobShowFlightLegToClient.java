/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vision;

import dao.FlightLegDAO;
import flights.Flight;
import javax.swing.table.DefaultTableModel;


 public class LobShowFlightLegToClient extends javax.swing.JInternalFrame {

    
    public LobShowFlightLegToClient() {

        initComponents();

        

}
    
    
    

  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBUpdate = new javax.swing.JButton();
        jPnFormulario = new javax.swing.JPanel();
        jLOfficialName2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTaFlightLegs = new javax.swing.JTable();
        jBVoltar = new javax.swing.JButton();

        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jBUpdate.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jBUpdate.setText("Atualizar");
        jBUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jBUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jBUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPnFormulario.setBackground(new java.awt.Color(0, 0, 153));

        jLOfficialName2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLOfficialName2.setForeground(new java.awt.Color(255, 255, 255));
        jLOfficialName2.setText("CNPJ");

        jTaFlightLegs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Preço", "Assentos", "Empresa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTaFlightLegs);

        javax.swing.GroupLayout jPnFormularioLayout = new javax.swing.GroupLayout(jPnFormulario);
        jPnFormulario.setLayout(jPnFormularioLayout);
        jPnFormularioLayout.setHorizontalGroup(
            jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormularioLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1908, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLOfficialName2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnFormularioLayout.setVerticalGroup(
            jPnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormularioLayout.createSequentialGroup()
                .addGap(433, 433, 433)
                .addComponent(jLOfficialName2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );

        jBVoltar.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
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
                        .addContainerGap()
                        .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1162, 1162, 1162)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        dispose();

    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateActionPerformed
        
        
        
        for(Flight item: FlightLegDAO.flightLegs){

            
            DefaultTableModel tbFlightLegs = (DefaultTableModel) jTaFlightLegs.getModel();


            Object[] dados = {item.getIdentifierCode(),(Double)item.getTicketPrice(),(Integer)item.getAvailableSeats(),item.getAirline().getPublicName()};
            tbFlightLegs.addRow(dados);
        }
        jBUpdate.setEnabled(false);
    }//GEN-LAST:event_jBUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBUpdate;
    public javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLOfficialName2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPnFormulario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTaFlightLegs;
    // End of variables declaration//GEN-END:variables
}
