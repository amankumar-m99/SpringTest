package springtest.springtest.service;

import java.util.List;

import springtest.springtest.entity.Person;

public interface PersonService {
	List<Person> getAllPersons();

	Person getPerson(String id);

	Person addPerson(Person person);

	Person updatePerson(Person person);

	void deletePerson(Person person);

	void deletePerson(String id);
}
