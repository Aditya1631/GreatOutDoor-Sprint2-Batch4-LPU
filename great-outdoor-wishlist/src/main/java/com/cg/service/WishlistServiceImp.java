package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Entity.*;
import com.cg.dao.*;

@Service
@Transactional
public class WishlistServiceImp implements WishlistServiceI{
	
	@Autowired
	WishlistDAOI wl;

	@Override
	public List retrieve() {
		return wl.retrieve();
	}
	
	@Override
	public void addToWishlist(WishList w) {
		wl.addToWishlist(w);
	}

	@Override
	public int removeFromWishlist(int id) {
		return wl.removeFromWishlist(id);
	}
	
	@Override
	public List retrieveP() {
		return wl.retrieveP();
	}

}
