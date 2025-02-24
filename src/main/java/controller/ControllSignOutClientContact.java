
package controller;


import accounts.ClientAccount;
import dao.ClientDAO;
import interfaces.ControllerInterface;


public class ControllSignOutClientContact implements ControllerInterface{

    
       
    
    @Override
    public void saveController(Object... value) {
       ClientAccount client = new ClientAccount();
       
       client.setFullName((String) value[0]);
       client.setCPF((String) value[1]);
       client.setFullAdress((String) value[2]);
       client.setBirthday((String) value[3]);
       client.setPassword((String)value[4]);
       
       ClientDAO.saveNewClient((ClientAccount)client);
    }

    @Override
    public void downComboBox() {
    }
    
}
