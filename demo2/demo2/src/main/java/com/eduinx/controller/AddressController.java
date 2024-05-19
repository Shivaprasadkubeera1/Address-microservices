package com.eduinx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.eduinx.entity.Address;
import com.eduinx.repo.AddressRepo;

@RestController
public class AddressController {

    @Autowired
    private AddressRepo addressRepo;

    @GetMapping("/address/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable("id") int id) throws Exception {
        Address address = addressRepo.findById(id).orElse(null);
        if (address != null) {
            return ResponseEntity.ok(address);
        } else {
            throw new Exception("Issue!!!");
        }
    }
}
