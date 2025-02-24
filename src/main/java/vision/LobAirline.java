
package vision;

import accounts.AccountAirline;
import dao.FlightLegDAO;
import flights.Flight;
import javax.swing.Icon;
import javax.swing.JMenuItem;


public class LobAirline extends LobAirLineForm{
    
    private AccountAirline airline;
    
    public LobAirline(AccountAirline airline) {
        setTitle("Airline"); 
        this.airline = airline;
    }

    @Override
    public AccountAirline getAirline() {
        return airline;
    }

    @Override
    public String initializateFlightLeg() {
        String myFlightLegs = "";
        int count = 0;
        for (Flight item : FlightLegDAO.flightLegs) {

            String FlightLegItem = item.getIdentifierCode();
            count++;
            myFlightLegs = myFlightLegs + count +"- "+ FlightLegItem+"\n";
            
        }  
        return myFlightLegs;
    }
    
   
    

    
   
    
    
}
