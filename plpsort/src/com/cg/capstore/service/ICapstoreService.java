package com.cg.capstore.service;

import java.util.List;

import com.cg.capstore.dto.StoreDTO;

public interface ICapstoreService {

	List<StoreDTO> getAllProducts(Integer cat);

List<StoreDTO> sort(int i, int a);

}
