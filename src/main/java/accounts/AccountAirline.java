package accounts;

import java.time.LocalDate;

public class AccountAirline extends TadAccount{

    public AccountAirline(){
        super();
    }
    public AccountAirline(String cNPJ, String officialName, String publicName, String timeOfBirth, String password) {
        super(cNPJ, officialName, publicName, timeOfBirth, password);
    }



  @Override
  public String toString() {
    return "Airline = {" + "CNPJ = " + getCNPJ() + "; Official name = " + getOfficialName() + "; Advertising name = " + getPublicName() + "; Creation date = " + getTimeOfBirth() + '}';
  }

}
