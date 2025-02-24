package accounts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class TadClientAccount {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
	protected String fullName;
	protected String CPF;
	protected String fullAdress;
	protected LocalDate birthday;
        protected String password;

	public TadClientAccount(){
		
	}

	public TadClientAccount(String fullName,String cpf){
		this.CPF=cpf;
		this.fullName=fullName;
	}
	
	public TadClientAccount(String fullName, String cPF, String fullAdress, String birthday,String password) {
		this.fullName = fullName;
		CPF = cPF;
		this.fullAdress = fullAdress;
		setBirthday(birthday);
                this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getFullAdress() {
		return fullAdress;
	}

	public void setFullAdress(String fullAdress) {
		this.fullAdress = fullAdress;
	}

	public String getBirthday() {
		return this.birthday.format(formatter);

	}


	public void setBirthday(String birthday) {
		this.birthday = LocalDate.parse(birthday, formatter);
	}
        
        public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		
            this.password = password;
	}
	
	

}
