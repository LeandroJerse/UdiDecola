
package vision;

import accounts.AccountHotel;



public class LobHotel extends LobHotelForm{
    private AccountHotel client;

    
    public LobHotel(AccountHotel hotel) {
        setTitle("Hotel"); 
        this.client =hotel;
    }

    @Override
    public AccountHotel getHotel() {
        return client;
    }
    

    
   
    
    
}
