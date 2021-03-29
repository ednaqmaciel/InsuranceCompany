package br.com.able.web;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.able.parts.Part;
import br.com.able.vehicles.Vehicle;
import br.com.able.vehicles.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	@GetMapping("/getList")
	public List<Vehicle> getList() {
		return vehicleService.getList();
	}

	@GetMapping("/gravar")
	// Sem interface gráfica
	public Vehicle gravar(Vehicle vehicle) {
		vehicleService.gravar(vehicle);
		return vehicle;
	}

	@GetMapping("/get/{idVehicle}")
	public Vehicle get(@PathVariable(name = "idVehicle", required = true) int idVehicle) {
		return vehicleService.get(idVehicle);
	}
	// simulando o gravar p n criar interface;

	@GetMapping("/addTest")
	public String add() {
		Vehicle vehicle = new Vehicle();	
		vehicle.setBrand("Jeep");
		vehicle.setModel("4x4");
		vehicle.setYear(2019);
		Part part = new Part();
		part.setName("Farol");
		part.setValue(2166);
		part.setDamaged(false);
		part.setVehicle(vehicle);
		vehicle.add(part);
		Part part2 = new Part();
		part2.setName("Retrovisor");
		part2.setValue(1642);
		part2.setDamaged(false);
		part.setVehicle(vehicle);
		vehicle.add(part2);
		vehicleService.gravar(vehicle);
		return "Gravado com sucesso!";
	}

	@GetMapping("/readFileTest")
	public String lerVehicles (){

		ObjectMapper objectMapple = new ObjectMapper();

		try {

			String json="";
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader ("vehicles.json"));
			String linha = br.readLine();
			while(linha !=null) {
				json += linha;
				linha = br.readLine();}
			List<Vehicle> listVehicles = objectMapple.readValue(json, new TypeReference<List<Vehicle>>(){});
			for(Vehicle v : listVehicles) {
				vehicleService.gravar(v);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return "Veículos Lidos!";
	}
	// Listar os nomes dos carros por ordem do somatório
	@GetMapping("/ListMoreExpensives")
	public List<Vehicle> getListExpensives () {
		return vehicleService.getListExpensives();

	}
}
