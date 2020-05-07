package com.cg.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.cg.Entity.Product;
import com.cg.Entity.WishList;

@Repository
public interface WishlistDAOI {
	
	public void addToWishlist(WishList w);
	public int removeFromWishlist(int id);
	public List retrieve();
	public List retrieveP();
}
