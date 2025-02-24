
package controller;

import accounts.AccountHotel;
import interfaces.ControllerInterface;
import dao.HotelDAO;


public class ControllSignOutHotelContact implements ControllerInterface{

    
        
    
    @Override
    public void saveController(Object... value) {
       AccountHotel hotel = new AccountHotel();
       hotel.setCNPJ((String) value[0]);
       hotel.setOfficialName((String) value[1]);
       hotel.setPublicName((String) value[2]);
       hotel.setTimeOfBirth((String) value[3]);
       hotel.setPassword((String) value[4]);
       hotel.setFullAdress((String)value[5]);
       hotel.setNumberOfStars((String)value[6]);
       hotel.setPets((boolean)value[7]);
       hotel.setCheckin((String)value[8]);
       hotel.setCheckout((String)value[9]);
       hotel.setPublicMessage((String)value[10]);
       hotel.setSummary((String)value[11]);
       
       HotelDAO.saveNewHotel(hotel);
    }

    @Override
    public void downComboBox() {
    }
    
}
