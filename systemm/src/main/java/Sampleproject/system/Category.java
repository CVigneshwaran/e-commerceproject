package Sampleproject.system;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@NotBlank(message="Categoryname can't be Blank")
	private String Categoryname;

	public String getCategoryname() {
		return Categoryname;
	}

	public void setCategoryname(String categoryname) {
		Categoryname = categoryname;
	}

}
