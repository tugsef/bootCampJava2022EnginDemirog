package kodlama.io.softwareLanguages.business.abstracts;

import java.util.List;

import kodlama.io.softwareLanguages.business.requests.subTecnology.CreateSubTecnologyRequest;
import kodlama.io.softwareLanguages.business.requests.subTecnology.UpdateRequest;
import kodlama.io.softwareLanguages.business.responses.subTecnology.GetAllSubTecnologyResponse;
import kodlama.io.softwareLanguages.entity.SubTechnology;



public interface SubTecnologyService {
	List<GetAllSubTecnologyResponse> getAll();
	void delete(int id) throws Exception;
	void add(CreateSubTecnologyRequest createSubTecnologyRequest);
    void update(UpdateRequest updateRequest , int id);
    SubTechnology getById(GetAllSubTecnologyResponse getAllSubTecnologyResponse) throws Exception;
} 
