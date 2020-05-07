package com.cg.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product11")
public class Product {
	@Id
	int Product_id;
	@Column
	String name;
	@Column
	int quantity;
	@Column
	int mrp;
	@Column
	String manufacturer;
	@Column
	String img_path;
	
	public Product()
	{
		
	}

	public Product(int product_id, String name, int quantity, int mrp, String manufacturer, String img_path) {
		super();
		Product_id = product_id;
		this.name = name;
		this.quantity = quantity;
		this.mrp = mrp;
		this.manufacturer = manufacturer;
		this.img_path = img_path;
	}

	public int getProduct_id() {
		return Product_id;
	}

	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getMrp() {
		return mrp;
	}

	public void setMrp(int mrp) {
		this.mrp = mrp;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getImg_path() {
		return img_path;
	}

	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}
	
	
	
	
	
	

}
