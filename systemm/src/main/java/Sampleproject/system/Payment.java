package Sampleproject.system;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private int accountno;
	public String getPaymentmethod() {
		return paymentmethod;
	}
	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}
	public String getShippingaddress() {
		return shippingaddress;
	}
	public void setShippingaddress(String shippingaddress) {
		this.shippingaddress = shippingaddress;
	}
	private String paymentmethod;
	
	private String shippingaddress;
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	
	public String getCartid() {
		return cartid;
	}
	public void setCartid(String cartid) {
		this.cartid = cartid;
	}
	private String cartid;

	

}
