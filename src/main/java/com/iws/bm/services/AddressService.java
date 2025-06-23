package com.iws.bm.services;

import com.iws.bm.entities.address;
import com.iws.bm.repositories.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<address> getAllAddresses() {
        return addressRepository.findAll();
    }
}