package Sampleproject.system;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productid;
public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	@NotBlank(message="Productname cannot be blank")
private String productname;
@Transient
private MultipartFile image;
@NotBlank(message="Description cannot be balnk")
private String description;

private float price;
public MultipartFile getImage() {
	return image;
}
public void setImage(MultipartFile image) {
	this.image = image;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Min(value=2)
private int quantity;
@Min(value=2)
private int categoryid;
private int supplierid;

public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getCategoryid() {
	return categoryid;
}
public void setCategoryid(int categoryid) {
	this.categoryid = categoryid;
}
public int getSupplierid() {
	return supplierid;
}
public void setSupplierid(int supplierid) {
	this.supplierid = supplierid;
}

}
