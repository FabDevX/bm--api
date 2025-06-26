package com.iws.bm.controllers;

import com.iws.bm.entities.address;
import com.iws.bm.services.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")

public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @GetMapping("/by-contact-address/{addressId}")
    public List<address> getAddressesByContactAddress(@PathVariable Integer addressId) {
        return addressService.getAddressesByContactAddressId(addressId);
    }
    // AddressController.java
    @GetMapping("/{addressId}")
    public String getName1ByAddressId(@PathVariable Integer addressId) {
        return addressService.getName1ByAddressId(addressId);
    }
}