package springtest.springtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springtest.springtest.entity.Person;
import springtest.springtest.service.AddressService;
import springtest.springtest.service.PersonService;

@RestController
public class PersonController {

	private static final String origin="http://localhost:4200";

	@Autowired
	private PersonService personService;

	@Autowired
	private AddressService addressService;

	@CrossOrigin(origins = origin)
	@GetMapping("/home")
	public String home() {
		return "person home";
	}

	@CrossOrigin(origins = origin)
	@GetMapping("/persons")
	public List<Person> getAllPersons(){
		List<Person> list = personService.getAllPersons();
		return list;
	}

	@CrossOrigin(origins = origin)
	@GetMapping("/person/{id}")
	public ResponseEntity<Person> getUser(@PathVariable String id) {
		Person person = this.personService.getPerson(id);
		if(person != null)
			return ResponseEntity.ok(person);
		return ResponseEntity.ofNullable(null);
	}

	@CrossOrigin(origins = origin)
	@PostMapping(path = "/person", consumes = "application/json")
//	@PostMapping(path = "/person")
	public Person addEmployee(@RequestBody Person person) {
		addressService.addAddress(person.getAddress());
		return this.personService.addPerson(person);
	}

	@CrossOrigin(origins = origin)
	@PutMapping("/person")
	public Person updateEmployee(@RequestBody Person person) {
		addressService.updateAddress(person.getAddress());
		return this.personService.updatePerson(person);
	}

	@CrossOrigin(origins = origin)
	@DeleteMapping("/person/{id}")
	public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable String id) {
		Person person = personService.getPerson(id);
		if(person == null)
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		this.addressService.deleteAddress(person.getAddress());
		this.personService.deletePerson(person);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
