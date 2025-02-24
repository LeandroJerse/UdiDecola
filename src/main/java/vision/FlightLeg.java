
package vision;

import accounts.AccountAirline;
import dao.AirLineDAO;
import dao.FlightLegDAO;
import flights.AirportLocation;
import flights.Flight;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class FlightLeg extends FlightLegForm{
    AccountAirline myAirline;
    
    public FlightLeg(AccountAirline airline) {
        
        this.myAirline = airline;
        setTitle("Nova Rota"); 
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

    jTArriveTime.getDocument().addDocumentListener(documentListener);
    jTTicketPrice.getDocument().addDocumentListener(documentListener);
    jTAvaliableSeats.getDocument().addDocumentListener(documentListener);
    jTDepartureTime.getDocument().addDocumentListener(documentListener);
    jTDestination.getDocument().addDocumentListener(documentListener);
    jTFlightDate.getDocument().addDocumentListener(documentListener);
    jTIdentifierFlight.getDocument().addDocumentListener(documentListener);
    jTOrigin.getDocument().addDocumentListener(documentListener);
  }
    
    public void check() {
        
                if ((jTArriveTime.getText().length() >= 10)&& (jTTicketPrice.getText().length()>=4)&& (jTAvaliableSeats.getText().length()>=1)&& (jTDepartureTime.getText().length()>=4)&& (jTDestination.getText().length()>=4)&& (jTFlightDate.getText().length()>=4)&& (jTIdentifierFlight.getText().length()>=4)&& (jTOrigin.getText().length()>=4)) {
                    jBConfirm.setEnabled(true);
                } else {
                    jBConfirm.setEnabled(false);
                }
            }



    @Override
    public void saveVision() {
        
        AirportLocation location = new AirportLocation();
        location.setCity((String)jTDestination.getText());
        
        Flight flightLeg = new Flight();
        flightLeg.setArrivalTime((String)jTArriveTime.getText());
        flightLeg.setAvailableSeats(Integer.parseInt(jTAvaliableSeats.getText()));
        flightLeg.setDepartureTime((String)jTDepartureTime.getText());
        flightLeg.setDestination(location);
        flightLeg.setFlightDate((String)jTFlightDate.getText());
        flightLeg.setIdentifierCode((String)jTIdentifierFlight.getText());
        flightLeg.setTicketPrice(Double.parseDouble(jTTicketPrice.getText()));
        flightLeg.setAirline(myAirline);
        
        
        FlightLegDAO.saveNewFlightLeg(flightLeg);
        
        
        
        
        
    }    
    
}
