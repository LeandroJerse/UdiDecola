package accounts;

import java.time.LocalDate;

public class EmployeeAccount extends TadClientAccount  {

    protected String workCardNumber;
    protected double standardSalary;

    

    public EmployeeAccount(String fullName, String cPF, String fullAdress, String birthday,String password,String workCardNumber,double standardSalary){
        super(fullName, cPF, fullAdress, birthday,password);
        this.workCardNumber = workCardNumber;
        this.standardSalary = standardSalary;

    }

    public void setWorkCardNumber(String workCardNumber) {
        this.workCardNumber = workCardNumber;
    }
    public void setStandardSalary(double salary) {
        this.standardSalary = salary;
    }
    public String getWorkCardNumber() {
        return workCardNumber;
    }
    public double getStandardSalary() {
        return standardSalary;
    }

    
    
}
