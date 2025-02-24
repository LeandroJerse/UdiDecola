

package vision;

import controller.ControllSignOutHotelContact;
import dao.HotelDAO;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class SignOutHotel extends TadSignOutCompany{
    
    JLabel jLFullAdress;  
    JTextField jTFullAdress;
    
    
    JLabel jLNumberOfStars;
    JComboBox jCbNumberOfStars;
    JCheckBox jCPets;
    
    JLabel jLCheckIn;
    JLabel jLCheckOut;
    
    JTextField jTCheckIn;
    JTextField jTCheckOut;
    
    JLabel jLPublicMessage;
    JTextField jTPublicMessage;
    
    JLabel jLSummary;
    JTextField jTSummary;
    
    
    public SignOutHotel() {
        setTitle("Cadastro de Hotel"); 
        
        
        jLFullAdress = new javax.swing.JLabel();
        jLFullAdress.setFont(new java.awt.Font("Liberation Sans", 1, 18));
        jLFullAdress.setForeground(new java.awt.Color(255, 255, 255));
        jLFullAdress.setText("Endereço ");
        jLFullAdress.setBounds(950, 125, 300, 50);
        jPnFormulario.add(jLFullAdress);
        
        jTFullAdress = new JTextField();
        jTFullAdress.setBounds(950, 170, 270, 27);
        jPnFormulario.add(jTFullAdress);
        
        
        jLPublicMessage = new javax.swing.JLabel();
        jLPublicMessage.setFont(new java.awt.Font("Liberation Sans", 1, 18));
        jLPublicMessage.setForeground(new java.awt.Color(255, 255, 255));
        jLPublicMessage.setText("Texto para o Público");
        jLPublicMessage.setBounds(650, 260, 300, 50);
        jPnFormulario.add(jLPublicMessage);
        
        jTPublicMessage = new JTextField();
        jTPublicMessage.setBounds(650, 295, 270, 27);
        jPnFormulario.add(jTPublicMessage);
       
        jLSummary = new JLabel();
        jLSummary.setFont(new java.awt.Font("Liberation Sans", 1, 18));
        jLSummary.setForeground(new java.awt.Color(255, 255, 255));
        jLSummary.setText("Resumo da empresa");
        jLSummary.setBounds(950, 260, 270, 27);
        jPnFormulario.add(jLSummary);
        
        jTSummary = new JTextField();
        jTSummary.setBounds(950, 295, 270, 27);
        jPnFormulario.add(jTSummary);
        
        jLCheckIn = new javax.swing.JLabel();
        jLCheckIn.setFont(new java.awt.Font("Liberation Sans", 1, 18));
        jLCheckIn.setForeground(new java.awt.Color(255, 255, 255));
        jLCheckIn.setText("Horario Check-in");
        jLCheckIn.setBounds(650, 190, 300, 50);
        jPnFormulario.add(jLCheckIn);
        
        jTCheckIn = new JTextField();
        jTCheckIn.setBounds(650, 233, 270, 27);
        jPnFormulario.add(jTCheckIn);
        
        
        jLCheckOut = new javax.swing.JLabel();
        jLCheckOut.setFont(new java.awt.Font("Liberation Sans", 1, 18));
        jLCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        jLCheckOut.setText("Horario Check-out");
        jLCheckOut.setBounds(350, 260, 300, 50);
        jPnFormulario.add(jLCheckOut);
        
        jTCheckOut = new JTextField();
        jTCheckOut.setBounds(350, 295, 270, 27);
        jPnFormulario.add(jTCheckOut);

        jLNumberOfStars = new javax.swing.JLabel();
        jLNumberOfStars.setFont(new java.awt.Font("Liberation Sans", 1, 18)); 
        jLNumberOfStars.setForeground(new java.awt.Color(255, 255, 255));
        jLNumberOfStars.setText("Numero De Estrelas");
        jLNumberOfStars.setBounds(650, 125, 300, 50);
        jPnFormulario.add(jLNumberOfStars);
        
        jCbNumberOfStars = new JComboBox();
        jCbNumberOfStars.addItem("1");
        jCbNumberOfStars.addItem("2");
        jCbNumberOfStars.addItem("3");
        jCbNumberOfStars.addItem("4");
        jCbNumberOfStars.addItem("5");
        jCbNumberOfStars.setBounds(650, 165, 120, 30);
        jPnFormulario.add(jCbNumberOfStars);
        
        jCPets = new JCheckBox();
        jCPets.setText("Permitido Pets");
        jCPets.setFont(new java.awt.Font("Liberation Sans", 1, 18)); 
        jCPets.setForeground(new java.awt.Color(255, 255, 255));
        jCPets.setBounds(50, 200, 220, 300);
        jPnFormulario.add(jCPets);
    }
    
  public void checkInstaceEverTime(){
    DocumentListener documentListener = new DocumentListener() {
        public void changedUpdate(DocumentEvent documentEvent) {
            check();
        }
        public void insertUpdate(DocumentEvent documentEvent) {
            check();
        }
        public void removeUpdate(DocumentEvent documentEvent) {
            check();
        }
    };

    jTCNPJ.getDocument().addDocumentListener(documentListener);
    jTDataBirth.getDocument().addDocumentListener(documentListener);
    jTOficialName.getDocument().addDocumentListener(documentListener);
    jTPublicName.getDocument().addDocumentListener(documentListener);
    jTPassword.getDocument().addDocumentListener(documentListener);

}

public void check() {
    if ((jTCNPJ.getText().length() == 14) && (jTDataBirth.getText().length() == 10) && (jTOficialName.getText().length()>=6) && (jTPublicName.getText().length()>=6) && (jTPassword.getText().length()>=6)) {
        jBConfirm.setEnabled(true);
    } else {
        jBConfirm.setEnabled(false);
    }
}

    ControllSignOutHotelContact cshc = new ControllSignOutHotelContact();
    HotelDAO hd = new HotelDAO();
    @Override
    public void saveVision() {
        
        cshc.saveController(jTCNPJ.getText(),jTOficialName.getText(),jTPublicName.getText(),jTDataBirth.getText(),jTPassword.getText(),jTFullAdress.getText(),jCbNumberOfStars.getSelectedItem(),jCPets.isSelected(),jTCheckIn.getText(),jTCheckOut.getText(),jTPublicMessage.getText(),jTSummary.getText());

    }

    @Override
    public boolean sameName() {
        return HotelDAO.searchName((String)jTOficialName.getText(),(String)jTCNPJ.getText());
    }

    
    
}
