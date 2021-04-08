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
	public Part gravar(Part part) {
		partService.gravar(part);
		return part;
	}

	@GetMapping ("/get/{idPart}")
	public Part get(@PathVariable(name="idPart", required=true) int idPart) {
		return partService.get(idPart);
	}	
}
