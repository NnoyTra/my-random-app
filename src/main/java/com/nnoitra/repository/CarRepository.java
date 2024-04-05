package com.nnoitra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nnoitra.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{

	@Query(nativeQuery = true, value = "select * from car where person_id = :personId")
	List<Car> findAllPersonCars(@Param("personId")int personId);

}
