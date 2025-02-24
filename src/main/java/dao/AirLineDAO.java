package dao;

import accounts.AccountAirline;

import java.util.ArrayList;

public class AirLineDAO {
    
      private static ArrayList<AccountAirline> airline = new ArrayList<AccountAirline>();

  public static void saveNewAirline(AccountAirline newAirline){
    airline.add(newAirline);
  }
  
  public static AccountAirline searchAirline(String user, String password){
      AccountAirline ifAirline = null;
      for(AccountAirline object: airline){
          if(object.getCNPJ().equals(user)&&object.getPassword().equals(password)){
              ifAirline = object;
              break;
          }
      }
      return ifAirline;
  }
  
    public static boolean searchName(String user,String cnpj){
      boolean ifAirline = false;
      for(AccountAirline object: airline){
          if(object.getOfficialName().equals(user) || object.getCNPJ().equals(cnpj)){
              ifAirline = true;
              break;
          }
      }
      return ifAirline;
  }


}

