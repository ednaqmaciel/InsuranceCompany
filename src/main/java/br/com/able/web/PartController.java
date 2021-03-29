package br.com.able.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.able.parts.Part;
import br.com.able.parts.PartService;
import br.com.able.vehicles.Vehicle;


@RestController
@RequestMapping("/part")
public class PartController {

	@Autowired
	private PartService partService;

	@GetMapping("/getList")
	public List<Part> getList(){
		return partService.getList();
	}

	@GetMapping("/gravar")
	//Sem interface gráfica
	public Part gravar(Part part) {
		partService.gravar(part);
		return part;
	}

	@GetMapping ("/get/{idPart}")
	public Part get(@PathVariable(name="idPart", required=true) int idPart) {
		return partService.get(idPart);
	}
	//simulando o gravar p n criar interface;

	@GetMapping("/add")
	public String add() {
		Part part = new Part ();
		part.setName("Farol");
		part.setValue(2166);
		part.setDamaged(false);
		Vehicle vehicle = new Vehicle();
		vehicle.setBrand("Mercedes");
		vehicle.setModel("4x4");
		vehicle.setYear(2018);
		part.setVehicle(vehicle);
		vehicle.add(part);
		partService.gravar(part);
		Part part2 = new Part ();
		part2.setName("Para-brisa");
		part2.setValue(2167);
		part2.setDamaged(false);
		part2.setVehicle(vehicle);
		vehicle.add(part2);
		partService.gravar(part2);
		return "Gravado com sucesso!";
	}	
}
