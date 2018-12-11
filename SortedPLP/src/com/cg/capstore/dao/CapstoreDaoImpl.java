package com.cg.capstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.capstore.dto.Product;

@Repository("dao")
public class CapstoreDaoImpl implements ICapstoreDao{

	@PersistenceContext
	EntityManager manager;
	@Override
	public List<Product> showAllSortedProd() {
		
		Query queryOne=manager.createQuery("FROM Product");
		List<Product> myList=queryOne.getResultList();
		
		return myList;
	
	}
	@Override
	public List<Product> showAllAscPriceProd() {
		Query q=manager.createQuery("from Product order by price");
		//q.setParameter("category",i);
		List<Product> myAll = q.getResultList();
		System.out.println(myAll);
		return myAll;
		
	}
	@Override
	public List<Product> showAllDescPriceProd() {
		// TODO Auto-generated method stub
		Query q=manager.createQuery("from Product order by price desc");
		//q.setParameter("category",i);
		List<Product> myAll = q.getResultList();
		System.out.println(myAll);
		return myAll ;
	}

}
