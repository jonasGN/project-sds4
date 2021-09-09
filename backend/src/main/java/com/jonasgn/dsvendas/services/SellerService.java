package com.jonasgn.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonasgn.dsvendas.dto.SellerDTO;
import com.jonasgn.dsvendas.entities.Seller;
import com.jonasgn.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;

	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(s -> new SellerDTO(s)).collect(Collectors.toList());
	}

}
