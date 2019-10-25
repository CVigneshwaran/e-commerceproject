package Sampleproject.system;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String email;
	private int productid;
	private float price;
	private String cartid;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCartid() {
		return cartid;
	}
	public void setCartid(String cartid) {
		this.cartid = cartid;
	}
	
}
