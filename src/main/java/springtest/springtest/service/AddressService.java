package springtest.springtest.service;

import java.util.List;

import springtest.springtest.entity.Address;

public interface AddressService {
	List<Address> getAllAddresses();

	Address getAddress(int id);

	Address addAddress(Address address);

	Address updateAddress(Address address);

	void deleteAddress(Address address);
	
	void deleteAddress(int id);
}
