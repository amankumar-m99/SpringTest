
package springtest.springtest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import springtest.springtest.entity.Person;

public interface PersonDao extends JpaRepository<Person, Integer>{}
