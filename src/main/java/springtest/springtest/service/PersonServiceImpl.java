package springtest.springtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springtest.springtest.dao.PersonDao;
import springtest.springtest.entity.Person;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonDao personDao;

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person addPeson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person updateEmployee(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		
	}

}
