package accounts;

import java.time.LocalDate;
import utilities.Purchase;
import utilities.ShoppingCart;

public class ClientAccount extends TadClientAccount {
	
	ShoppingCart purchasesLog;
	float VipPoint;
	
	
	
	public ClientAccount(String fullName, String cPF, String fullAdress, LocalDate birthday) {
		super(fullName, cPF, fullAdress, birthday);

	}
	
	public void setPurchasesLog(Purchase newPurchase) {
		this.purchasesLog.purchases.add(newPurchase);
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
