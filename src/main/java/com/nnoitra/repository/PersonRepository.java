package com.nnoitra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nnoitra.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

	@Query(nativeQuery = true, value = "select * from person where id = :id")
	Person findPersonById(@Param("id") int id);

}
