package com.iws.bm.repositories;

import com.iws.bm.entities.address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<address, Integer> {

    @Query(value = """
        SELECT * FROM elwisdb2.address a
        WHERE a.addressid IN (
            SELECT cp.contactpersonid
            FROM elwisdb2.contactperson cp
            WHERE cp.addressid = :addressId
        )
        """, nativeQuery = true)
    List<address> findAddressesByContactAddressId(@Param("addressId") Integer addressId);
}