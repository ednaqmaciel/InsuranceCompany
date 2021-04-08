package br.com.able.parts;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartService {

	@Autowired
	private PartRepository partRepository;
	/**
	 * Retorna a parts pelo ID.
	 * @param id ID.
	 * @return Parts.
	 **/
	public Part get (int id) {
		return partRepository.findById(id).get();
	}
	public void gravar(Part parts) {	
		partRepository.save(parts);
	}
	/**
	 * Retorna a lista das parts
	 * @return lista de parts	  	
	 */
	public List<Part> getList() {
		// TODO Fazer as validações
		return partRepository.getList();
	}

}		