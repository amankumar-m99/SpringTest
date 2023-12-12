package springtest.springtest.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springtest.springtest.dao.AddressDao;
import springtest.springtest.entity.Address;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressDao addressDao;

	@Override
	public List<Address> getAllAddresses() {
		List<Address> list = addressDao.findAll();
		if(list == null)
			return Collections.emptyList();
		return list;
	}

	@Override
	public Address getAddress(int id) {
		return addressDao.getReferenceById(id);
	}

	@Override
	public Address addAddress(Address address) {
		return addressDao.save(address);
	}

	@Override
	public Address updateAddress(Address address) {
		return addressDao.save(address);
	}

	@Override
	public void deleteAddress(Address address) {
		addressDao.delete(address);
	}

	@Override
	public void deleteAddress(int id) {
		addressDao.delete(getAddress(id));
	}

}
