
package vision;

import accounts.AccountHotel;
import dao.HotelDAO;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class LoginHotel extends TadLogin{
    
    public LoginHotel() {
        setTitle("Login Hotel"); 
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
    public AccountHotel saveVision() {
        
        AccountHotel hotel;
        String user = (String)jTUserLogin.getText();
        String password=(String)jTPasswordLogin.getText();
        hotel = HotelDAO.searchHotel(user, password);
        
        return hotel;
        
    }
    
        @Override
    public void loginVision(Object client) {
        AccountHotel userHotel = (AccountHotel)client;
        new LobHotel(userHotel).setVisible(true); 
        
        
        

    }
    
    
}
