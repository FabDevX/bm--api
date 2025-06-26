package com.iws.bm.services;

import com.iws.bm.entities.address;
import com.iws.bm.repositories.AddressRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

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


    public List<address> getAddressesByContactAddressId(Integer addressId) {
        return addressRepository.findAddressesByContactAddressId(addressId);
    }

    // AddressService.java
    public String getName1ByAddressId(Integer addressId) {
        return addressRepository.findById(addressId)
                .map(address::getName1)
                .orElseThrow(() -> new RuntimeException("Address not found with id: " + addressId));
    }
}