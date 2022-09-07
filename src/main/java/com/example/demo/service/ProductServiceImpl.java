package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

@Service
public class ProductServiceImpl implements IProductService{

	@Override
	public List<Product> findAll() {
		List<Product> pl = new ArrayList<>();
		pl.add(new Product(1,"Phone"));
		pl.add(new Product(2,"Laptop"));
		return pl;
	}

}
