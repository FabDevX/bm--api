package com.iws.bm.repositories;

import com.iws.bm.entities.address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<address, Integer> {
}