package kodlama.io.softwareLanguages.business.concreates;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.softwareLanguages.business.abstracts.SubTecnologyService;
import kodlama.io.softwareLanguages.business.requests.subTecnology.CreateSubTecnologyRequest;
import kodlama.io.softwareLanguages.business.requests.subTecnology.UpdateRequest;
import kodlama.io.softwareLanguages.business.responses.subTecnology.GetAllSubTecnologyResponse;
import kodlama.io.softwareLanguages.dataAccess.abstracts.SubTecnologysRepository;
import kodlama.io.softwareLanguages.entity.Language;
import kodlama.io.softwareLanguages.entity.SubTechnology;


@Service
public class SubTecnologyManager implements SubTecnologyService {


	private SubTecnologysRepository subTecnologysRepository;
	

	
	
	
	public SubTecnologyManager(SubTecnologysRepository subTecnologysRepository) {
		super();
		this.subTecnologysRepository = subTecnologysRepository;
	}





	@Override
	public List<GetAllSubTecnologyResponse> getAll() {
		List<SubTechnology> subTechnologies = subTecnologysRepository.findAll();
		List<GetAllSubTecnologyResponse> subTecnologyResponses = new ArrayList<>();
		for (SubTechnology subTechnology : subTechnologies) {
			GetAllSubTecnologyResponse responseItem = new GetAllSubTecnologyResponse();
			responseItem.setId(subTechnology.getSubId());
			responseItem.setLanguageName(subTechnology.getLanguage().getLanguageName());
			responseItem.setSubName(subTechnology.getSubName());
			subTecnologyResponses.add(responseItem);
		}
		
		
		
		return subTecnologyResponses;
	}





	@Override
	public void delete(int id) {
		subTecnologysRepository.deleteById(id);
		
	}





	@Override
	public void add(CreateSubTecnologyRequest createSubTecnologyRequest) {
		SubTechnology technology = new SubTechnology();
		Language language = new Language();
		language.setLanguageId(createSubTecnologyRequest.getLanguageId());
		technology.setSubName(createSubTecnologyRequest.getSubName());
		technology.setLanguage(language);
		subTecnologysRepository.save(technology);
		
	}





	@Override
	public void update(UpdateRequest updateRequest, int id) {
SubTechnology technology = subTecnologysRepository.findById(id).get();
		
		technology.setSubName(updateRequest.getName());
		subTecnologysRepository.save(technology);
		
	}





	@Override
	public SubTechnology getById(GetAllSubTecnologyResponse getAllSubTecnologyResponse) throws Exception {
		List<SubTechnology> subTechnologies = subTecnologysRepository.findAll();
		for (SubTechnology subTechnology : subTechnologies) {
			if(subTechnology.getSubId()==getAllSubTecnologyResponse.getId()) {
				return subTechnology;
			}
		}
		return null;
	}











	



	
}
