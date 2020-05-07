package com.cg.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Wishlist13")
@SequenceGenerator(name= "OrderIDGenerator",initialValue=100)

public class WishList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OrderIDGenerator")
	int Wishlist_id;
		
	@OneToOne
	@JoinColumn(name="Product_id", nullable=false)
	private Product product;
	
	@OneToOne
	@JoinColumn(name="Retailer_id", nullable=false)
	private Retailer retail;
	
	


	public  WishList() {
		
	}
	public WishList(Product product, Retailer retail) {
		super();
		this.product = product;
		this.retail = retail;
	}
	public int getWishlist_id() {
		return Wishlist_id;
	}




	public void setWishlist_id(int wishlist_id) {
		Wishlist_id = wishlist_id;
	}




	public Product getProduct() {
		return product;
	}




	public void setProduct(Product product) {
		this.product = product;
	}




	public Retailer getRetail() {
		return retail;
	}




	public void setRetail(Retailer retail) {
		this.retail = retail;
	}


}
