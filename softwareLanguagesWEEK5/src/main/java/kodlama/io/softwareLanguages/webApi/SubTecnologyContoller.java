package kodlama.io.softwareLanguages.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.softwareLanguages.business.abstracts.SubTecnologyService;
import kodlama.io.softwareLanguages.business.requests.langueges.GetIdAllRequests;
import kodlama.io.softwareLanguages.business.requests.subTecnology.CreateSubTecnologyRequest;
import kodlama.io.softwareLanguages.business.requests.subTecnology.UpdateRequest;
import kodlama.io.softwareLanguages.business.responses.subTecnology.GetAllSubTecnologyResponse;
import kodlama.io.softwareLanguages.entity.Language;
import kodlama.io.softwareLanguages.entity.SubTechnology;

@RestController
@RequestMapping("/api/technology")


public class SubTecnologyContoller {

	private SubTecnologyService subTecnologyService;
	
	
	@Autowired
	public SubTecnologyContoller(SubTecnologyService subTecnologyService) {
		super();
		this.subTecnologyService = subTecnologyService;
	}


	@GetMapping("/getAll")
	public List<GetAllSubTecnologyResponse> getAll(){
		return subTecnologyService.getAll();
		
	}	
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable int id) throws Exception {
		subTecnologyService.delete(id);
	}
	
	@PostMapping("/add")
	public void add(CreateSubTecnologyRequest subTechnology) {
		subTecnologyService.add(subTechnology);
		
	}
	@PutMapping("/update/{id}")
	public void update(UpdateRequest updateRequest , @PathVariable int id) throws Exception {
		subTecnologyService.update(updateRequest, id);
		
	}
	@GetMapping("get/id")
	public SubTechnology getById(GetAllSubTecnologyResponse getIdAllRequests) throws Exception{
		return subTecnologyService.getById(getIdAllRequests);
		
	}
	
}
