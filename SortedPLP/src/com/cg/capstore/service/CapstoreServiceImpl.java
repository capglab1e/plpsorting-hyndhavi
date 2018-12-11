package com.cg.capstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.capstore.dao.ICapstoreDao;
import com.cg.capstore.dto.Product;

@Service("service")
@Transactional
public class CapstoreServiceImpl implements ICapstoreService{

	@Autowired
	ICapstoreDao dao;
	
	@Override
	public List<Product> showAllSortedProd() {
		// TODO Auto-generated method stub
		return dao.showAllSortedProd();
	}

	@Override
	public List<Product> showAllAscPriceProd() {
		// TODO Auto-generated method stub
		return dao.showAllAscPriceProd();
	}

	@Override
	public List<Product> showAllDescPriceProd() {
		// TODO Auto-generated method stub
		return dao.showAllDescPriceProd();
	}

}
