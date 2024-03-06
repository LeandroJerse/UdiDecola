package accounts;

import java.time.LocalDate;

import utilities.ShoppingCart;

public class ClientAccount extends TadClientAccount {
	
	ShoppingCart purchasesLog;
	float VipPoint;
	
	
	
	public ClientAccount(String fullName, String cPF, String fullAdress, LocalDate birthday) {
		super(fullName, cPF, fullAdress, birthday);

	}
	
	public setPurchasesLog(Purchase newPurchase) {
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
