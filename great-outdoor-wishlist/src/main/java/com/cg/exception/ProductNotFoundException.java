package com.cg.exception;

public class ProductNotFoundException extends Exception
{
	public ProductNotFoundException()
	{
		super();
	}
	
	public ProductNotFoundException(String args)
	{
		super(args);
	}
}