package springtest.springtest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import springtest.springtest.entity.Person;
import springtest.springtest.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping("/home")
	public String home() {
		return "person home";
	}

	@GetMapping("/persons")
	public List<Person> getAllPersons(){
		List<Person> list = personService.getAllPersons();
		return list;
	}

	@GetMapping("/person/{id}")
	public Person getPerson(@PathVariable String id){
		Person person = personService.getPerson(Integer.parseInt(id));
		return person;
	}
}
