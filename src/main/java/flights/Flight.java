package flights;

import accounts.AccountAirline;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class Flight{
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
  DateTimeFormatter formatterDay = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  private String identifierCode;
  private AirportLocation origin;
  private AirportLocation destination;
  private LocalDate departureTime;
  private LocalDate arrivalTime;
  private LocalDate flightDate;
  private AccountAirline airline;
  private FlightLeg flightLeg;
  private int availableSeats;
  private double ticketPrice;

  
  public Flight(){
  }
  
  public Flight(String identifierCode, AirportLocation origin, AirportLocation destination, String departureTime, String arrivalTime, String flightDate, 
  AccountAirline airline, FlightLeg flightLeg, int availableSeats, double ticketPrice){
    this.identifierCode = identifierCode;
    this.origin = origin;
    this.destination = destination;
    setDepartureTime(departureTime);
    setArrivalTime(arrivalTime);
    setFlightDate(flightDate);
    this.airline = airline;
    this.flightLeg = flightLeg;
    this.availableSeats = availableSeats;
    this.ticketPrice = ticketPrice;
  }

  public void setIdentifierCode(String identifierCode){
    this.identifierCode = identifierCode;
  }
  public String getIdentifierCode(){
    return identifierCode;
  }

  public void setOrigin(AirportLocation origin){
    this.origin = origin;
  }
  public AirportLocation getOrigin(){
    return origin;
  }
  
  public void setDestination(AirportLocation destination){
    this.destination = destination;
  }
  public AirportLocation getDestination(){
    return destination;
  }

  public void setDepartureTime(String departureTime){
    this.departureTime = LocalDate.parse(departureTime, formatter);
  }
  public LocalDate getDepartureTime(){
    return departureTime;
  }

  public void setArrivalTime(String arrivalTime){
    this.arrivalTime = LocalDate.parse(arrivalTime, formatter);
  }
  public LocalDate getArrivalTime(){
    return arrivalTime;
  }

    public void setFlightDate(String flightDate){
    try {
      this.flightDate = LocalDate.parse(flightDate, formatterDay);
    } catch (DateTimeParseException e) {
      System.out.println("Erro na conversão da data do voo: " + e.getMessage());
      JOptionPane.showMessageDialog(null, "Erro na conversão da data do voo: " + e.getMessage());
    }
  }
  public LocalDate getFlightDate(){
    return flightDate;
  }

  public void setAirline(AccountAirline airline){
    this.airline = airline;
  }
  public AccountAirline getAirline(){
    return airline;
  }
  
  public String getNameAirline(){
      return this.airline.getOfficialName();
  }

  public void setFlightLeg(FlightLeg flightLeg){
    this.flightLeg = flightLeg;
  }
  public FlightLeg getFlightLeg(){
    return flightLeg;
  }

  public void setAvailableSeats(int availableSeats){
    this.availableSeats = availableSeats;
  }
  public int getAvailableSeats(){
    return availableSeats;
  }

  public void setTicketPrice(double ticketPrice){
    this.ticketPrice = ticketPrice;
  }
  public double getTicketPrice(){
    return ticketPrice;
  }

  public double adjustTicketPrice(double eventFactor){
    return this.ticketPrice *= eventFactor;
  }

}
