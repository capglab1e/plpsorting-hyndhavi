package com.cg.capstore.dao;

import java.util.List;

import com.cg.capstore.dto.StoreDTO;

public interface ICapstoreDao {

	List<StoreDTO> getAllProducts(Integer cat);

	List<StoreDTO> sort(int i, int a);

}
