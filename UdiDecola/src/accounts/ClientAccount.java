package accounts;

import java.time.LocalDate;

public class ClientAccount extends TadClientAccount {
	
	ShoppingCart purchasesLog;
	float VipPoint;
	
	
	
	public ClientAccount(String fullName, String cPF, String fullAdress, LocalDate birthday) {
		super(fullName, cPF, fullAdress, birthday);

	}
	
	public setPurchasesLog(Purchases newPurchase) {
		purchaselog.purchases.add(newPurchase);
	}
	
	public ShoppingCart getPurchasesLog() {
		return purchasesLog;
	}

	public float getVipPoint() {
		return VipPoint;
	}
	public void setVipPoint(float vipPoint) {
		VipPoint = vipPoint;
	}
	
	
	
	

}
