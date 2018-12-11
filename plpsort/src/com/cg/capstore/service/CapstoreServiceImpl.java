package com.cg.capstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.capstore.dao.ICapstoreDao;
import com.cg.capstore.dto.StoreDTO;


@Service("service")
@Transactional
public class CapstoreServiceImpl implements ICapstoreService {
	@Autowired
	ICapstoreDao repo;

	@Override
	public List<StoreDTO> getAllProducts(Integer cat) {
		// TODO Auto-generated method stub
		return repo.getAllProducts(cat);
	}

	@Override
	public List<StoreDTO> sort(int i, int a) {
		// TODO Auto-generated method stub
		return repo.sort(i,a);
	}

	

}


