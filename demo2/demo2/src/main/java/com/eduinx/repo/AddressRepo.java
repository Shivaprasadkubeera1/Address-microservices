package com.eduinx.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduinx.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {
}
