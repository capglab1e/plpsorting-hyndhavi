package com.cg.capstore.dao;

import java.util.List;

import com.cg.capstore.dto.Product;

public interface ICapstoreDao {

	public List<Product> showAllSortedProd();
	public List<Product> showAllAscPriceProd();
	public List<Product> showAllDescPriceProd();
}
