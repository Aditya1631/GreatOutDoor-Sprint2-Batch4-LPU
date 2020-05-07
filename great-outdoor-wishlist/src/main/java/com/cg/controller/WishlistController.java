package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Entity.Product;
import com.cg.Entity.WishList;
import com.cg.service.WishlistServiceI;
@CrossOrigin("*")
@RestController
public class WishlistController {
	
	@Autowired
	WishlistServiceI wl_service;
	
	@GetMapping(value="/products")
	public List<Product> viewProducts(){
		return wl_service.retrieveP();
	}

	@GetMapping(value="/wishlists")
	public List<WishList> viewRequests() {
		return wl_service.retrieve();
	}
	
	@DeleteMapping(value="/remove_from_wishlist/{id}")
	public void removeFromWishlist(@PathVariable int id) {
		wl_service.removeFromWishlist(id);
	}
	
	@PostMapping(value="/add_wishlist",consumes= {"application/json"})
	public String addToWishlist(@RequestBody WishList w_obj)
	{
		wl_service.addToWishlist(w_obj);
		return "product added successfully";
	}

}
