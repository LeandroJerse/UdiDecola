package accounts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import dao.BedroomsDAO;



public class AccountHotel extends TadAccount {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
	
	protected String fullAdress;
	protected String numberOfStars;
	protected boolean pets;
	protected int numberOfBedrooms;
	protected LocalDate checkin;
	protected LocalDate checkout;
	protected String publicMessage;
	protected String summary;
	protected BedroomsDAO myBedrooms;
        
        
    public AccountHotel(){
        super();
    }
    public AccountHotel(String cNPJ, String officialName, String publicName, String timeOfBirth, String password,String fullAdress,String numberOfStars, boolean pets, int numberOfBedrooms, String checkin, String checkout,
			String publicMessage, String summary, BedroomsDAO myBedrooms) {
        super(cNPJ, officialName, publicName, timeOfBirth, password);
        this.fullAdress = fullAdress;
	this.numberOfStars = numberOfStars;
	this.pets = pets;
	this.numberOfBedrooms = numberOfBedrooms;
	this.setCheckin(checkin);
	this.setCheckout(checkout);
	this.publicMessage = publicMessage;
	this.summary = summary;
	this.myBedrooms = myBedrooms;
    }
    
     public String getFullAdress() {
        return fullAdress;
    }

    public void setFullAdress(String fullAdress) {
        this.fullAdress = fullAdress;
    }

    public  String getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(String numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public boolean getPets() {
        return pets;
    }

    public void setPets(boolean pets) {
        this.pets = pets;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = LocalDate.parse(checkin, formatter);
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = LocalDate.parse(checkout, formatter);
    }

    public String getPublicMessage() {
        return publicMessage;
    }

    public void setPublicMessage(String publicMessage) {
        this.publicMessage = publicMessage;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public BedroomsDAO getMyBedrooms() {
        return myBedrooms;
    }

    public void setMyBedrooms(BedroomsDAO myBedrooms) {
        this.myBedrooms = myBedrooms;
    }
}
    

