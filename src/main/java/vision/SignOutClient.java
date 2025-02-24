
package vision;

import controller.ControllSignOutClientContact;
import dao.ClientDAO;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class SignOutClient extends TadSignOutClient{
    
    public SignOutClient() {
        setTitle("Cadastro de CLiente"); 
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

    jTCPF.getDocument().addDocumentListener(documentListener);
    jTBirthday.getDocument().addDocumentListener(documentListener);
    jTFullName.getDocument().addDocumentListener(documentListener);
    jTAdress.getDocument().addDocumentListener(documentListener);
    jTClientPassword.getDocument().addDocumentListener(documentListener);
  }
    
    public void check() {
        
                if ((jTCPF.getText().length() == 11) && (jTBirthday.getText().length() == 10) && (jTFullName.getText().length()>=6) && (jTAdress.getText().length()>=6) && (jTClientPassword.getText().length()>=6)) {
                    jBConfirm.setEnabled(true);
                } else {
                    jBConfirm.setEnabled(false);
                }
            }
    
    
            
   
    ControllSignOutClientContact csoc = new ControllSignOutClientContact();
    
    @Override
    public void saveVision() {
        
        csoc.saveController(jTFullName.getText(),jTCPF.getText(),jTAdress.getText(),jTBirthday.getText(),jTClientPassword.getText());



    }

    @Override
    public boolean sameName() {
       return ClientDAO.searchName((String)jTFullName.getText(),(String)jTCPF.getText());
    }
    
    
}
