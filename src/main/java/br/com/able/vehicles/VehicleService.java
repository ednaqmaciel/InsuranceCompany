package br.com.able.vehicles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.able.parts.Part;

@Service 
public class VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;
	/**
	 * Retorna um vehicle pelo ID.
	 * @param id ID.
	 * @return Vehicles.
	 **/
	public Vehicle get (int id) {
		return vehicleRepository.findById(id).get();
	}
	public void gravar(Vehicle vehicle) {
		//TODO Fazer todas as valida��es 
		for(Part part : vehicle.getParts()) {
			part.setVehicle(vehicle);			
		}
		vehicle.atualizaSomatorio();
		vehicleRepository.save(vehicle);
	}
	/**
	 * Retorna a lista das vehicles
	 * @return lista de vehicles	  	
	 */

	public List<Vehicle> getList() {
		// TODO Fazer as validações
		return vehicleRepository.getList();
	}

	@GetMapping("/ListMoreExpensives")
	public List<Vehicle> getListExpensives () {
		return vehicleRepository.getListExpensives();
	}

}