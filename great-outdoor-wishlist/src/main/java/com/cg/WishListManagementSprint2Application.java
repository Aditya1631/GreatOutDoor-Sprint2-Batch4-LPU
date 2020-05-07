package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cg.Entity.Product;
import com.cg.Entity.Retailer;
import com.cg.Entity.WishList;
import com.cg.service.WishlistServiceI;

//import com.cg.Entity.Product;
//import com.cg.Entity.Retailer;
//import com.cg.Entity.WishList;
//import com.cg.service.WishlistServiceI;

@SpringBootApplication

@ComponentScan(basePackages= {"com.cg"})
public class WishListManagementSprint2Application implements CommandLineRunner{
	
	@Autowired 
	WishlistServiceI wlserve;
	

	public static void main(String[] args) {
		SpringApplication.run(WishListManagementSprint2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//String retailer_Name, int retailer_Id, String buidingNo, String city, String state,String field, String zip
//		
//		Product p=new Product(13,"bag",345,400,"dndkn","dknnv");
////		
//	Retailer r=new Retailer("Sports services",1,"Ashoka apartments","Lucknow","UP","None","0067845");
////		
//		wlserve.addToWishlist(new WishList(p,r));
////		
//		
		
		
	}

}

