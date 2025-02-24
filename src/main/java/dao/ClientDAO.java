package dao;


import accounts.ClientAccount;
import java.util.ArrayList;


public class ClientDAO {

  private static ArrayList<ClientAccount> clients = new ArrayList<ClientAccount>();

  public static void saveNewClient(ClientAccount newClient){
    clients.add(newClient);
  }
  
  public static ClientAccount searchClient(String user, String password){
      ClientAccount ifClient = null;
      for(ClientAccount object: clients){
          if(object.getCPF().equals(user)&&object.getPassword().equals(password)){
              ifClient = object;
              break;
          }
      }
      return ifClient;
  }
  
    public static boolean searchName(String user,String cpf){
      boolean ifClient = false;
      for(ClientAccount object: clients){
          if(object.getFullName().equals(user) || object.getCPF().equals(cpf)){
              ifClient = true;
              break;
          }
      }
      return ifClient;
  }
}
