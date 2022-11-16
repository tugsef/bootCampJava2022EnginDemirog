package kodlama.io.languageProgramming.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.languageProgramming.business.abstracts.TechnologyService;
import kodlama.io.languageProgramming.business.requests.CreateTecnologyRequest;
import kodlama.io.languageProgramming.business.requests.DeleteTecnologyRequest;
import kodlama.io.languageProgramming.business.requests.UpdateTecnologyRequest;
import kodlama.io.languageProgramming.business.responses.GetAllTechnologyResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {
	private TechnologyService technologyService;
	@Autowired
	public TechnologyController(TechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}
	
	@GetMapping("getAll")
	public List<GetAllTechnologyResponse> getAll(){
		return technologyService.getAll();
	}
	@PostMapping("/ad")
	public void add(CreateTecnologyRequest createTecnologyRequest) {
		this.technologyService.add(createTecnologyRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteTecnologyRequest deleteTecnologyRequest) {
		this.technologyService.delete(deleteTecnologyRequest);
	}
	@PutMapping("/update")
public void update(UpdateTecnologyRequest updateTecnologyRequest,int LanguageId){
		this.technologyService.update(updateTecnologyRequest, LanguageId);
	}
}
