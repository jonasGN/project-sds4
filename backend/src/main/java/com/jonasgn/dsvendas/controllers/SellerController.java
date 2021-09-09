package com.jonasgn.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonasgn.dsvendas.dto.SellerDTO;
import com.jonasgn.dsvendas.services.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

	@Autowired
	private SellerService service;

	@GetMapping
	public ResponseEntity<List<SellerDTO>> getAll() {
		List<SellerDTO> sellers = service.findAll();
		return ResponseEntity.ok(sellers);
	}
}
