
package vision;

import controller.ControllSignOutAirLineContact;
import dao.AirLineDAO;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class SignOutAirLine extends TadSignOutCompany{
    
    public SignOutAirLine() {
        setTitle("Cadastro de AirLine"); 
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
    
    ControllSignOutAirLineContact ctc = new ControllSignOutAirLineContact();


    @Override
    public void saveVision() {
        ctc.saveController(jTCNPJ.getText(),jTOficialName.getText(),jTPublicName.getText(),jTDataBirth.getText(),jTPassword.getText());

    }

    @Override
    public boolean sameName() {
        return AirLineDAO.searchName((String)jTOficialName.getText(),(String)jTCNPJ.getText());
        
    }
    
    
}
