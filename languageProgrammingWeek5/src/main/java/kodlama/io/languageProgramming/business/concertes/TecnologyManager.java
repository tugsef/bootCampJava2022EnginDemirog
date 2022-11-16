package kodlama.io.languageProgramming.business.concertes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.languageProgramming.business.abstracts.TechnologyService;
import kodlama.io.languageProgramming.business.requests.CreateTecnologyRequest;
import kodlama.io.languageProgramming.business.requests.DeleteTecnologyRequest;
import kodlama.io.languageProgramming.business.requests.UpdateTecnologyRequest;
import kodlama.io.languageProgramming.business.responses.GetAllTechnologyResponse;
import kodlama.io.languageProgramming.dataAccess.abstracts.LanguageRepository;
import kodlama.io.languageProgramming.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.languageProgramming.entities.concretes.Language;
import kodlama.io.languageProgramming.entities.concretes.Technology;

@Service
public class TecnologyManager implements TechnologyService{
private TechnologyRepository technologyRepository;
private LanguageRepository languageRepository;


	@Autowired
	public TecnologyManager(TechnologyRepository technologyRepository, LanguageRepository languageRepository) {
	super();
	this.technologyRepository = technologyRepository;
	this.languageRepository = languageRepository;
}

	@Override
	public List<GetAllTechnologyResponse> getAll() {
List<Technology> technologies = technologyRepository.findAll();
List<GetAllTechnologyResponse> getAllTechnologyResponse = new ArrayList<>();
for (Technology technology : technologies) {
	GetAllTechnologyResponse responseItem = new GetAllTechnologyResponse();
	responseItem.setLanguageId(technology.getLanguage().getLanguageId());
	responseItem.setLanguageName(technology.getLanguage().getLanguageName());
	responseItem.setTechnologyId(technology.getTechologyId());
	responseItem.setTechnologyName(technology.getTechologyName());
	getAllTechnologyResponse.add(responseItem);
}
return getAllTechnologyResponse;
	}

	@Override
	public void add(CreateTecnologyRequest createTecnologyRequest) {
		Language language = languageRepository.findById(createTecnologyRequest.getLanguageId()).get();
		Technology technology = new Technology();
		technology.setTechologyName(createTecnologyRequest.getTechnologyName());
		technology.setLanguage(language);
		technologyRepository.save(technology);
	}

	@Override
	public void delete(DeleteTecnologyRequest deleteTecnologyRequest) {
Technology technology = new Technology();
technology.setTechologyId(deleteTecnologyRequest.getTechnologyId());
this.technologyRepository.delete(technology);
	}

	@Override
	public void update(UpdateTecnologyRequest updateTecnologyRequest, int technologId) {
		List<Technology> technologies = technologyRepository.findAll();
		List<UpdateTecnologyRequest> tecnologyRequests = new ArrayList<>();
		for (Technology technology : technologies) {
			UpdateTecnologyRequest responseItem = new UpdateTecnologyRequest();
			
			responseItem.setTecnologyId(technology.getTechologyId());
			responseItem.setTecnologyName(technology.getTechologyName());
			tecnologyRequests.add(responseItem);
		
			
	}
		for (int i = 0; i < tecnologyRequests.size(); i++) {
			UpdateTecnologyRequest update = tecnologyRequests.get(i);
			if(update.getTecnologyId()==technologId) {
				
				tecnologyRequests.set(i, updateTecnologyRequest);
				return;
			}
		}
	}
}
