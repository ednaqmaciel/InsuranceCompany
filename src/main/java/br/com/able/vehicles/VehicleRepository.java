package br.com.able.vehicles;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface VehicleRepository extends CrudRepository <Vehicle, Integer> {

	@Query("FROM Vehicle v ORDER BY v.brand")
	List<Vehicle> getList();	

	@Query("FROM Vehicle v WHERE v.brand = brand")
	Vehicle getByBrand(@Param(value= "brand")String brand);

	@Query("FROM Vehicle v ORDER BY v.sumValueParts DESC")
	List<Vehicle> getListExpensives();

}
