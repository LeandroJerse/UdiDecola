
package vision;

import accounts.AccountAirline;
import dao.AirLineDAO;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class LoginAirLine extends TadLogin{
    
    public LoginAirLine() {
        setTitle("Login Airline"); 
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

    jTUserLogin.getDocument().addDocumentListener(documentListener);
    jTPasswordLogin.getDocument().addDocumentListener(documentListener);
  }
    
    public void check() {
        
                if ((jTUserLogin.getText().length() >= 6)&& (jTPasswordLogin.getText().length()>=6)) {
                    jBConfirm.setEnabled(true);
                } else {
                    jBConfirm.setEnabled(false);
                }
            }



    @Override
    public AccountAirline saveVision() {
        
        AccountAirline airline;
        String user = (String)jTUserLogin.getText();
        String password=(String)jTPasswordLogin.getText();
        airline = AirLineDAO.searchAirline(user, password);
        
        return airline;
        
        
    }
    
        @Override
    public void loginVision(Object airline) {
        AccountAirline userAirLine = (AccountAirline)airline;
        new LobAirline(userAirLine).setVisible(true); 
        
    }
    
    
    
}
