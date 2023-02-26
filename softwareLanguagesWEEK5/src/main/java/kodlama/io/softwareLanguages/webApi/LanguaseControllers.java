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

import kodlama.io.softwareLanguages.business.abstracts.LanguagesService;
import kodlama.io.softwareLanguages.business.requests.langueges.CreateLanguageRequests;
import kodlama.io.softwareLanguages.business.requests.langueges.GetIdAllRequests;
import kodlama.io.softwareLanguages.business.requests.langueges.UpdateRequest;
import kodlama.io.softwareLanguages.business.responses.languages.GetAllLanguagesResponse;
import kodlama.io.softwareLanguages.entity.Language;

@RestController
@RequestMapping("/api/languages")


public class LanguaseControllers {

	private LanguagesService languagesService;
	
	@Autowired
	public LanguaseControllers(LanguagesService languagesService) {
		this.languagesService = languagesService;
	}
	
	
	@GetMapping("/getAll")
	public List<GetAllLanguagesResponse> getAll(){
		
		return languagesService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateLanguageRequests createLanguageRequests) {
		
	languagesService.add(createLanguageRequests);
	
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") int id) {
		try {
			languagesService.delete(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@GetMapping("get/id")
	public Language getById(GetIdAllRequests getIdAllRequests) throws Exception{
		return languagesService.getById(getIdAllRequests);
		
	}
	
	@PutMapping("/update/{id}")
	public void update(UpdateRequest updateRequest , @PathVariable int id) throws Exception {
		languagesService.update(updateRequest, id);
	}
}
