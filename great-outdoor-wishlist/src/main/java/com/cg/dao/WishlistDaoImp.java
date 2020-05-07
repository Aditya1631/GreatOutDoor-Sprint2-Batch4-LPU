package com.cg.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.Entity.Product;
import com.cg.Entity.WishList;

@Repository

public class WishlistDaoImp implements WishlistDAOI{
	
	@Override
	public List retrieveP() {
		
		Query q = em.createQuery("from Product p");
		return q.getResultList();
	}

	@PersistenceContext
	EntityManager em;

	@Override
	public void addToWishlist(WishList w) {
				em.persist(w);
	}

	@Override
	public int removeFromWishlist(int id) {
		WishList w= em.find(WishList.class, id);
		System.out.println(w.getRetail().getRetailer_Id()+" "+w.getProduct().getProduct_id()+" "+"this record is deleted");
		em.remove(w);
		return 0;
	}

	@Override
	public List retrieve() {
		Query q = em.createQuery("from WishList w");
		return q.getResultList();
	}
	
	
	

	
	

	
	


}
