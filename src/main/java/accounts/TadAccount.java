package accounts;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class TadAccount {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	protected String CNPJ;
	protected String officialName;
	protected String publicName;
	protected LocalDate timeOfBirth;
        protected String password;

	
	public TadAccount(){}
        
	public TadAccount(String cNPJ, String officialName, String publicName, String timeOfBirth, String password) {
		CNPJ = cNPJ;
		this.officialName = officialName;
		this.publicName = publicName;
		this.setTimeOfBirth(timeOfBirth);
                this.password = password;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getOfficialName() {
		return officialName;
	}

	public void setOfficialName(String officialName) {
		this.officialName = officialName;
	}

	public String getPublicName() {
		return publicName;
	}

	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

	public void setTimeOfBirth(String timeOfBirth) {

		this.timeOfBirth = LocalDate.parse(timeOfBirth, formatter);
	}

	public String getTimeOfBirth() {
		return this.timeOfBirth.format(formatter);
	}
        
        public void setPassword(String password){
            this.password=password;
        }
        public String getPassword() {
		return password;
	}
        

	
	
}
