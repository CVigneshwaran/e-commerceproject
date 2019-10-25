package Sampleproject.system;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
@Entity
public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private String Suppliername;
	
	private String SupplierAddress;
	public String getSuppliername() {
		return Suppliername;
	}
	public void setSuppliername(String suppliername) {
		Suppliername = suppliername;
	}
	public String getSupplierAddress() {
		return SupplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		SupplierAddress = supplierAddress;
	}
	

}
