package dao;

import flights.Flight;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FlightLegDAO {
  
  public static ArrayList<Flight> flightLegs =new ArrayList<Flight>();


public static Connection openConection() {
    Connection con = null;
      try {
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection(url)
          
      } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: "+ ex);
      }
    
    return con;
    
}
  
  
 public static void saveNewFlightLeg(Flight flightLeg){
    flightLegs.add(flightLeg);
 }

 public static Flight getFlightLeg(String identifierCode){
    for (Flight flightL : flightLegs){
      if(flightL.getIdentifierCode().equals(identifierCode))
        return flightL;
    }
    return null;
  }

  public static boolean removeFlightLeg(String identifierCode){
    for(int i = 0; i < flightLegs.size(); i++){
      Flight flightL = flightLegs.get(i);
      if(flightL.getIdentifierCode().equals(identifierCode)){
        flightLegs.remove(i);
        return true;
      }
    }
    return false;
  }

  public static void eraseAllFlightLegs(){
    flightLegs.clear();
  }
  
  public static ArrayList<Flight> getFlightLegs(){
    return new ArrayList<>(flightLegs);
  }

  public static void showFlightLegs(FlightLegDAO repository) {
    for (Flight cia : repository.getFlightLegs())
      System.out.println(cia);
}

}
