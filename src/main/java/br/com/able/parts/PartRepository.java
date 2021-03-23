package br.com.able.parts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface PartRepository extends CrudRepository <Part, Integer> {
	
	@Query("FROM Part p ORDER BY p.name")
	List<Part> getList();	
	
	@Query("FROM Part p WHERE p.name = name")
	Part getByName(@Param(value= "name")String name);
	
}
