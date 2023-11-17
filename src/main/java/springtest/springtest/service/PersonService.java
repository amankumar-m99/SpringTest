package springtest.springtest.service;

import java.util.List;

import springtest.springtest.entity.Person;

public interface PersonService {
	List<Person> getAllPersons();

	Person getPerson(int id);

	Person addPeson(Person person);

	Person updateEmployee(Person person);

	void deletePerson(int id);
}
