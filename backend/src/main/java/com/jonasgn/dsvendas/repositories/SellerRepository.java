package com.jonasgn.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonasgn.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
