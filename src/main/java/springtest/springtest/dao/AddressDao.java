package springtest.springtest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import springtest.springtest.entity.Address;

public interface AddressDao extends JpaRepository<Address, Integer>{}