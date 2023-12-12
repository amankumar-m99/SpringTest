package springtest.springtest.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.criteria.CriteriaBuilder.In;
import springtest.springtest.dao.PersonDao;
import springtest.springtest.entity.Person;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonDao personDao;

	@Override
	public List<Person> getAllPersons() {
		List<Person> list = personDao.findAll();
		if(list == null || list.size() == 0) {
			return Collections.emptyList();
		}
		return list;
	}

	@Override
	public Person getPerson(String id) {
		try {
			int dbId = Integer.parseInt(id);
			return personDao.getReferenceById(dbId);
		}
		catch (Exception e) {
		}
		return null;
	}

	@Override
	public Person addPerson(Person person) {
		return personDao.save(person);
	}

	@Override
	public Person updatePerson(Person person) {
		return personDao.save(person);
	}

	@Override
	public void deletePerson(Person person) {
		personDao.delete(person);
	}

	@Override
	public void deletePerson(String id) {
		personDao.delete(getPerson(id));
	}

}
