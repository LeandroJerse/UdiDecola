
package controller;

import accounts.AccountAirline;
import dao.AirLineDAO;
import interfaces.ControllerInterface;



public class ControllSignOutAirLineContact implements ControllerInterface{

    
    
    @Override
    public void saveController(Object... value) {
       AccountAirline airline = new AccountAirline();
       airline.setCNPJ((String) value[0]);
       airline.setOfficialName((String) value[1]);
       airline.setPublicName((String) value[2]);
       airline.setTimeOfBirth((String) value[3]);
       airline.setPassword((String) value[4]);
       
        AirLineDAO.saveNewAirline(airline);
    }

    @Override
    public void downComboBox() {
    }
    
}
