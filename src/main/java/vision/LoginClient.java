
package vision;

import accounts.ClientAccount;
import dao.ClientDAO;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class LoginClient extends TadLogin{
    
    public LoginClient() {
        setTitle("Login Cliente"); 
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
    public ClientAccount saveVision() {
        ClientAccount client;
        String user = (String)jTUserLogin.getText();
        String password=(String)jTPasswordLogin.getText();
        client = ClientDAO.searchClient(user, password);
        
        return client;

        
    }


    @Override
    public void loginVision(Object client) {
        ClientAccount userClient = (ClientAccount)client;
        LobClient tela =  new LobClient(userClient) ;
        tela.setVisible(true);
  
    }
    
    
}
