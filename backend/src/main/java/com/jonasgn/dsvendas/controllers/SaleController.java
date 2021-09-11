package com.jonasgn.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonasgn.dsvendas.dto.SaleDTO;
import com.jonasgn.dsvendas.dto.SaleSuccessDTO;
import com.jonasgn.dsvendas.dto.SaleSumDTO;
import com.jonasgn.dsvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;

	@GetMapping
	public ResponseEntity<Page<SaleDTO>> getAll(Pageable pageable) {
		Page<SaleDTO> sales = service.findAll(pageable);
		return ResponseEntity.ok(sales);
	}

	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> getAmountGroupedBySeller() {
		List<SaleSumDTO> result = service.amountGroupedBySeller();
		return ResponseEntity.ok(result);
	}

	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> getSuccessGroupedBySeller() {
		List<SaleSuccessDTO> result = service.successGroupedBySeller();
		return ResponseEntity.ok(result);
	}
}
