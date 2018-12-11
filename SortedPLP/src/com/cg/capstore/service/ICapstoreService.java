package com.cg.capstore.service;

import java.util.List;
import java.util.Set;

import com.cg.capstore.dto.Product;

public interface ICapstoreService {
	
	public List<Product> showAllSortedProd();
	public List<Product> showAllAscPriceProd();
	public List<Product> showAllDescPriceProd();
	
	
}
