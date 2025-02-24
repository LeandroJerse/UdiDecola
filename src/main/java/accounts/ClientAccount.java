package accounts;

import utilities.Purchase;
import utilities.ShoppingCart;

public class ClientAccount extends TadClientAccount {
	
	ShoppingCart purchasesLog;
	float vipPoint;
	
	public ClientAccount(){
	}

	public ClientAccount(String fullName, String cPF){
		super(fullName, cPF);
	}

	public ClientAccount(String fullName, String cPF, String fullAdress, String birthday,String password) {
		super(fullName, cPF, fullAdress, birthday,password);
		this.vipPoint = 0;


	}
	
	public void increasePurchasesLog(Purchase newPurchase) {
		this.purchasesLog.purchases.add(newPurchase);
	}
	
	public ShoppingCart getPurchasesLog() {
		return purchasesLog;
	}

	public float getVipPoint() {
		return vipPoint;
	}
	public void setVipPoint(float vipPoint) {
		this.vipPoint = vipPoint;
	}

	boolean ifCreatVip(){
		if (vipPoint>=1000) {
			return true;
			
		}
		else{
			return false;
		}
	}
	
	
	
	

}
