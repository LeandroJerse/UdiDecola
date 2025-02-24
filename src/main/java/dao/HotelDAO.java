package dao;

import accounts.AccountHotel;

import java.util.ArrayList;


public class HotelDAO {
    
          private static ArrayList<AccountHotel> hotel = new ArrayList<AccountHotel>();

  public static void saveNewHotel(AccountHotel newHotel){
    hotel.add(newHotel);
  }
  
  public static AccountHotel searchHotel(String user, String password){
      AccountHotel ifHotel = null;
      for(AccountHotel object: hotel){
          if(object.getCNPJ().equals(user)&&object.getPassword().equals(password)){
              ifHotel = object;
              break;
          }
      }
      return ifHotel;
  }
  
    public static boolean searchName(String user,String cnpj){
      boolean ifHotel = false;
      for(AccountHotel object: hotel){
          if(object.getOfficialName().equals(user) || object.getCNPJ().equals(cnpj)){
              ifHotel = true;
              break;
          }
      }
      return ifHotel;
  }
    
    


}

